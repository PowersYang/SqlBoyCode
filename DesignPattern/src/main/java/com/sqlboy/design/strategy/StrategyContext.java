package com.sqlboy.design.strategy;

public class StrategyContext {
    public void backHome(Strategy strategy, float distance) {
        strategy.caculateFee(distance);
    }
}
