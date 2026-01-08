package org.example;

import org.example.solid.open_closed.solid.HDQuality;
import org.example.solid.open_closed.solid.SDQuality;
import org.example.solid.open_closed.solid.VideoPlayer;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello, World!");
        HDQuality hd = new HDQuality();
        VideoPlayer player = new VideoPlayer();
        player.play(hd);
        SDQuality sd = new SDQuality();
        player.play(sd);


        System.out.println("Liskov -------");

    }
}