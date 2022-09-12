package com.sqlboy.design.responsibility;

public class Boss implements Handler {

    private Handler nextHandler;

    @Override
    public void setNextHanlder(Handler hanlder) {
        this.nextHandler = hanlder;
    }

    @Override
    public boolean handle(int days) {
        if (days <= 7) {
            System.out.println("Boss批了");
            return true;
        } else {
            System.out.println("不批，滚");
            return false;
        }
    }
}
