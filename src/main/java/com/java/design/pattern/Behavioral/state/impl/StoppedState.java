package com.java.design.pattern.Behavioral.state.impl;


import com.java.design.pattern.Behavioral.state.MediaPlayer;
import com.java.design.pattern.Behavioral.state.State;

public class StoppedState implements State {

    public void play(MediaPlayer context) {
        System.out.println("Starting the player");
        context.setState(new PlayingState());
    }

    public void pause(MediaPlayer context) {
        System.out.println("Cannot pause. Player is stopped");
    }

    public void stop(MediaPlayer context) {
        System.out.println("Already stopped");
    }
}
