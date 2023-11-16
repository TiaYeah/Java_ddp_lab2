package com.example.lab2;

//import com.example.lab2.webservice.Server;
//import com.example.lab2.webservice.ServerService;
import com.example.lab2.webservice.ServerMessage;
import com.example.lab2.webservice.ServerController;
import com.example.lab2.webservice.ServerControllerService;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.effect.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.StrokeType;

import java.net.MalformedURLException;
import java.net.URL;

public class ClientController {
    ServerController server;
    Model model = new Model();

    ServerMessage state = new ServerMessage();

    String name;
    Circle[][] circles;

    boolean gameOver = false;

    @FXML
    private Label nameLabel;
    @FXML
    private Label turnLabel;
    @FXML
    private Circle turnCircle1;

    @FXML
    private Circle turnCircle2;
    @FXML
    private AnchorPane anchorPane;


    @FXML
    void initialize() {
        int serverPort = 8080;
        String serverHost = "localhost";
        connect(serverHost, serverPort);

        addCircles();

        new Thread(() -> {
            while (true) {
                receiveMessage();
            }
        }).start();
    }

    private void connect(String serverHost, int serverPort) {
        try {
            server = new ServerControllerService(new URL(String.format("http://%s:%s/Server?wsdl", serverHost, serverPort))).getServerControllerPort();

            name = server.getName();
            nameLabel.setText(nameLabel.getText() + name);

            System.out.println(name);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    private void addCircles() {
        circles = new Circle[19][19];

        int centerX = 42;
        int centerY = 42;

        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                Circle circle = new Circle();

                circle.setRadius(14);
                circle.setFill(Color.TRANSPARENT);
                circle.setStrokeWidth(4);
                circle.setStrokeType(StrokeType.INSIDE);
                circle.setCenterX(centerX);
                circle.setCenterY(centerY);

                circle.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent mouseEvent) {
                        circle.setStroke(Color.RED);
                    }
                });
                circle.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent mouseEvent) {
                        circle.setStroke(Color.TRANSPARENT);
                    }
                });
                circle.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent mouseEvent) {
                        int xTurn = ((int) (circle.getCenterX() - 40)) / 42;
                        int yTurn = ((int) (circle.getCenterY() - 40)) / 42;

                        sendMessage(xTurn, yTurn, name);
                    }
                });
                anchorPane.getChildren().add(circle);
                circles[i][j] = circle;
                centerX += 42;
            }
            centerX = 42;
            centerY += 42;
        }
    }

    private void sendMessage(int xTurn, int yTurn, String name) {
        if (state.getCurrentTurn() != null && state.getCurrentTurn().equals(name)) {
            server.doTurn(xTurn, yTurn, name);
        }
    }

    private void receiveMessage() {
        if (!gameOver) {
            ServerMessage currentState = server.getState();
            state = currentState;
            updateField(currentState);
            Color colorOfReminder;
            if (currentState.getCurrentTurn() != null) {
                if (!currentState.getCurrentTurn().equals(currentState.getFirstPlayerName())) {
                    colorOfReminder = Color.WHITE;
                } else {
                    colorOfReminder = Color.BLACK;
                }
                Platform.runLater(() -> {
                    turnCircle1.setFill(colorOfReminder);
                    turnCircle1.setVisible(true);
                    turnCircle2.setFill(colorOfReminder);
                    turnCircle2.setVisible(true);
                    if (currentState.getRemainderTurns() == 1) {
                        turnCircle2.setVisible(false);
                    } else if (currentState.getRemainderTurns() == 0) {
                        turnCircle1.setVisible(false);
                        turnCircle2.setVisible(false);
                    }
                });

                if (currentState.getCurrentTurn().equals("Игра окончена")) {
                    Platform.runLater(() -> {
                        turnLabel.setText("Игра окончена");
                    });
                } else if (currentState.getCurrentTurn().equals(name)) {
                    Platform.runLater(() -> {
                        turnLabel.setText("Сейчас ваш ход");
                    });
                } else {
                    Platform.runLater(() -> {
                        turnLabel.setText("Сейчас ход противника");
                    });

                }
            }
            if (currentState.getWinnerName() != null) {
                gameOver = true;
                Platform.runLater(() -> {
                    Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                    alert.setContentText("Победил " + currentState.getWinnerName());
                    alert.setTitle("Игра окончена");
                    alert.setHeaderText("Игра окончена");

                    alert.initOwner(anchorPane.getScene().getWindow());
                    alert.showAndWait();

                });
                return;
            }
        }
    }

    private void updateField(ServerMessage serverMessage) {
        if (serverMessage.getLastPlayerName() != null) {
            if (!serverMessage.getLastPlayerName().equals(serverMessage.getFirstPlayerName())) {
                int y = serverMessage.getLastY();
                int x = serverMessage.getLastX();
                Platform.runLater(() -> {
                    anchorPane.getChildren().remove(circles[y][x]);
                    Circle circle = new Circle();
                    circle.setFill(Color.WHITE);
                    circle.setStroke(Color.BLACK);
                    circle.setStrokeWidth(1);
                    circle.setRadius(14);
                    circle.setCenterX(circles[y][x].getCenterX());
                    circle.setCenterY(circles[y][x].getCenterY());
                    InnerShadow innerShadowBlack = new InnerShadow();
                    innerShadowBlack.setChoke(0.1);
                    innerShadowBlack.setWidth(1);
                    innerShadowBlack.setHeight(1);
                    innerShadowBlack.setRadius(5);
                    innerShadowBlack.setOffsetY(-4);
                    circle.setEffect(innerShadowBlack);
                    circles[y][x] = circle;
                    anchorPane.getChildren().add(circle);
                });
            } else {
                int y = serverMessage.getLastY();
                int x = serverMessage.getLastX();
                Platform.runLater(() -> {
                    anchorPane.getChildren().remove(circles[y][x]);
                    Circle circle = new Circle();
                    circle.setFill(Color.BLACK);
                    circle.setStroke(Color.BLACK);
                    circle.setStrokeWidth(1);
                    circle.setRadius(14);
                    circle.setCenterX(circles[y][x].getCenterX());
                    circle.setCenterY(circles[y][x].getCenterY());
                    Light.Distant light = new Light.Distant();
                    light.setAzimuth(-45.0f);

                    Lighting l = new Lighting();
                    l.setLight(light);
                    l.setSurfaceScale(20.0f);
                    circle.setEffect(l);
                    circles[y][x] = circle;
                    anchorPane.getChildren().add(circle);
                });

            }

        }
    }
}