package org.example.case_studies.tictactoe;

import java.util.List;

public class Game {
    int size;
    List<Player> players;
    Board board;
    WinningStrategy winningStrategy;
    int moveCount;
    int currentPlayerIdx;
    Game(int size, List<Player> players, WinningStrategy strategy){
        this.size = size;
        this.players = players;
        board = new Board(size);
        this.winningStrategy = strategy;
        moveCount = 0;
        currentPlayerIdx = 0;
    }
    public void play(int row, int col){
        moveCount++;
        Player currentPlayer = players.get(currentPlayerIdx);

        boolean result = board.write(row, col, currentPlayer.token, currentPlayer);
        if(!result){
            throw new IllegalArgumentException("Invalid Move!");
        }
        boolean didWin = winningStrategy.checkWinner(board, row, col, currentPlayer);
        if(didWin){
            System.out.println(currentPlayer.name + " has won!");
            return;
        }
        if(moveCount == size*size){
            System.out.println("Game is draw!");
            return;
        }
        currentPlayerIdx = (currentPlayerIdx+1)%players.size();

    }

}
