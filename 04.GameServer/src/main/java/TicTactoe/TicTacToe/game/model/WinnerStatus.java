package TicTactoe.TicTacToe.game.model;

import java.util.Arrays;

public class WinnerStatus {

    private boolean isWinner;
    private int[] position;
    private String whoWon;

    public WinnerStatus() {

    }

    public WinnerStatus(boolean isWinner, int[] position, String whoWon) {
        this.isWinner = isWinner;
        this.position = position;
        this.whoWon = whoWon;
    }

    public boolean isWinner() {
        return isWinner;
    }

    public void setWinner(boolean winner) {
        isWinner = winner;
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

    public WinnerStatus(boolean isWinner) {
        this.isWinner = isWinner;
    }

    @Override
    public String toString() {
        return "WinnerStatus{" +
                "isWinner=" + isWinner +
                ", position=" + Arrays.toString(position) +
                ", whoWon='" + whoWon + '\'' +
                '}';
    }
}
