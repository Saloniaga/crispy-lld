package org.example.case_studies.tictactoe;

import java.util.ArrayList;
import java.util.List;

public class Orchestrator {
    public static void main(String[] args) {
        List<Player> players = new ArrayList<Player>();
        Player player1 = new Player("Sam", "O");
        Player player2 = new Player("Tim", "X");
        players.add(player1);
        players.add(player2);
        Game game = new Game(3, players, new SimpleWinningStrategy());
        game.play(0, 0);
        game.play(1,0);
        game.play(0, 1);
        game.play(1,1);
        game.play(0, 2);
        game.play(1,2);

    }
}
