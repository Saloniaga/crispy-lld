package org.example.case_studies.tictactoe;

public interface WinningStrategy {
    public boolean checkWinner(Board board, int row, int col, Player player);
}
