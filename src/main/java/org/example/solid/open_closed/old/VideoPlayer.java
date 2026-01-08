package org.example.solid.open_closed.old;

public class VideoPlayer {

    public void play(String videoQuality){
        if("SD".equals(videoQuality))
            System.out.println("Video playing in Standard Definition");
        else if("HD".equals(videoQuality))
            System.out.println("Video playing in High Definition");
        else
            System.out.println("Invalid Format");
    }
}
