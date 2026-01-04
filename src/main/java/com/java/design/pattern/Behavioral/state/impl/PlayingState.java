package com.java.design.pattern.Behavioral.state.impl;

import com.java.design.pattern.Behavioral.state.MediaPlayer;
import com.java.design.pattern.Behavioral.state.State;

class PlayingState implements State {

    public void play(MediaPlayer context) {
        System.out.println("Already playing");
    }

    public void pause(MediaPlayer context) {
        System.out.println("Pausing the player");
        context.setState(new PausedState());
    }

    public void stop(MediaPlayer context) {
        System.out.println("Stopping the player");
        context.setState(new StoppedState());
    }
}
