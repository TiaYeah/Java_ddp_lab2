package com.example.lab2;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.Random;

@WebService
public class ServerController {
    int playersCount = 0;
    Model model = new Model();

    ServerMessage serverMessage = new ServerMessage();

    @WebMethod
    public String getName() {
        playersCount++;
        if(playersCount == 2) {
            startGame();
        }
        return "Игрок" + playersCount;
    }

    private void startGame() {
        Random random = new Random();
        String startName = "Игрок" + (random.nextInt(2) + 1);
        model.currentTurn = serverMessage.currentTurn = startName;
        model.firstPlayerName = serverMessage.firstPlayerName = startName;
        System.out.println("Игра началась");
    }



    @WebMethod
    public ServerMessage getState() {
        return serverMessage;
    }

    @WebMethod
    public void doTurn(int x, int y, String player) {
        model.field[y][x] = player;
        serverMessage.lastX = x;
        serverMessage.lastY = y;
        serverMessage.lastPlayerName = player;

        if (model.doTurn(y, x)) {
            model.remainderTurns = serverMessage.remainderTurns = 0;
            model.winnerName = serverMessage.winnerName = player;
            model.currentTurn = serverMessage.currentTurn = "Игра окончена";
        } else {
            serverMessage.remainderTurns = model.remainderTurns;
            serverMessage.currentTurn = model.currentTurn;
        }
    }

    void printModel() {
        for (int i = 0; i< 19; i++) {
            for(int j = 0; j < 19; j++) {
                System.out.print(model.field[i][j] + " ");
            }
            System.out.println();
        }
    }


}
