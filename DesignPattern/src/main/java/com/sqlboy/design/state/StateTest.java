package com.sqlboy.design.state;

public class StateTest {
    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        PlayState playState = new PlayState();
        playState.doAction(context);

        StopState stopState = new StopState();
        stopState.doAction(context);
    }
}
