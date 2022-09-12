package com.sqlboy.design.strategy;

public class SubwayStrategy implements Strategy {
    @Override
    public void caculateFee(float distance) {
        float fee = (int) (distance / 5) * 2;
        System.out.println("地铁需要 " + fee + " 元");
    }
}
