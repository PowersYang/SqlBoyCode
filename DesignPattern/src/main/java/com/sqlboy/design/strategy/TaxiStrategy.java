package com.sqlboy.design.strategy;

public class TaxiStrategy implements Strategy {
    @Override
    public void caculateFee(float distance) {
        float fee;
        if (distance <= 2) {
            fee = 15;
        } else {
            fee = (distance - 2) * 5 + 15;
        }
        System.out.println("出租车需要 " + fee + " 元");
    }
}
