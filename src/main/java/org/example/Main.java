package org.example;

import org.example.OpenClosedPrinciple.solid.HDQuality;
import org.example.OpenClosedPrinciple.solid.SDQuality;
import org.example.OpenClosedPrinciple.solid.VideoPlayer;

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