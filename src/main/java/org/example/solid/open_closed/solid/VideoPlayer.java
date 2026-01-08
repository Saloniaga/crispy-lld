package org.example.solid.open_closed.solid;

public class VideoPlayer {
    public void play(VideoQuality quality){
        quality.execute();

    }
}
