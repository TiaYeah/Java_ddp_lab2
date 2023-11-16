package com.example.lab2;

public class ServerMessage {
    public int lastX;
    public int lastY;

    public String lastPlayerName;
    public String currentTurn;
    public String firstPlayerName;
    public String winnerName;

    public int remainderTurns = 1;

    public ServerMessage() {
    }

    public ServerMessage(int lastX, int lastY, String lastPlayerName, String currentTurn, String firstPlayerName, String winnerName, int remainderTurns) {
        this.lastX = lastX;
        this.lastY = lastY;
        this.lastPlayerName = lastPlayerName;
        this.currentTurn = currentTurn;
        this.firstPlayerName = firstPlayerName;
        this.winnerName = winnerName;
        this.remainderTurns = remainderTurns;
    }
}
