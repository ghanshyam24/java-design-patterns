package com.java.design.pattern.Behavioral.state;


public class Main {
    public static void main(String[] args) {
        MediaPlayer player = new MediaPlayer();

        player.play();
        player.pause();
        player.play();
        player.stop();
    }
}
