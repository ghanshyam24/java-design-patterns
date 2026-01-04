package com.java.design.pattern.Behavioral.state;

public interface State {
    void play(MediaPlayer context);
    void pause(MediaPlayer context);
    void stop(MediaPlayer context);
}
