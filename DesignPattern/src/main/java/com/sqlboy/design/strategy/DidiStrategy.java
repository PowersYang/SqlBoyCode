package com.sqlboy.design.strategy;

public class DidiStrategy implements Strategy {
    @Override
    public void caculateFee(float distance) {
        float fee;
        if (distance <= 2) {
            fee = 15;
        } else {
            fee = (distance - 2) * 5 + 15 - 10;
        }

        System.out.println("滴滴需要 " + fee + " 元");
    }
}
