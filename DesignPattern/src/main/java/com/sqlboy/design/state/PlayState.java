package com.sqlboy.design.state;

public class PlayState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in play state");
        context.setState(this);
    }

    public String toString() {
        return "play state";
    }
}
