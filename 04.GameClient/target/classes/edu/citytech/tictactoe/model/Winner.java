package edu.citytech.tictactoe.model;

import java.util.Arrays;

public class Winner {

    private boolean winner;
    private int[] position;
    private String whoWon;

    public Winner(boolean winner, int[] position, String whoWon) {
        this.winner = winner;
        this.position = position;
        this.whoWon = whoWon;
    }

    public boolean isWinner() {
        return winner;
    }


    public void setWinner(boolean winner) {
        this.winner = winner;
    }

    public int[] getPosition() {
        return position;
    }

    public void setPosition(int[] position) {
        this.position = position;
    }

    public String getWhoWon() {
        return whoWon;
    }

    public void setWhoWon(String whoWon) {
        this.whoWon = whoWon;
    }

    @Override
    public String toString() {
        return "Winner{" +
                "iswinner=" + winner +
                ", postion=" + Arrays.toString(position) +
                ", whoWon='" + whoWon + '\'' +
                '}';
    }
}
