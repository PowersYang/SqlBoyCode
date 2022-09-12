package com.sqlboy.design.strategy;

public class WalkStrategy implements Strategy {
    @Override
    public void caculateFee(float distance) {
        System.out.println("步行回家不花钱，但是容易被警察叔叔拦下来盘问");
    }
}
