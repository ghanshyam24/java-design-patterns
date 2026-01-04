package com.java.design.pattern.Behavioral.state.impl;

import com.java.design.pattern.Behavioral.state.MediaPlayer;
import com.java.design.pattern.Behavioral.state.State;

class PausedState implements State {

    public void play(MediaPlayer context) {
        System.out.println("Resuming playback");
        context.setState(new PlayingState());
    }

    public void pause(MediaPlayer context) {
        System.out.println("Already paused");
    }

    public void stop(MediaPlayer context) {
        System.out.println("Stopping the player");
        context.setState(new StoppedState());
    }
}
