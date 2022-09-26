package com.sqlboy.design.responsibility;

public class GroupLeader implements Handler {

    private Handler nextHandler;

    @Override
    public void setNextHanlder(Handler hanlder) {
        this.nextHandler = hanlder;
    }

    @Override
    public boolean handle(int days) {
        if (days == 1) {
            System.out.println("小组领导可以批");
            return true;
        } else {
            System.out.println("小组领导没权限，往上传递");
            return this.nextHandler.handle(days);
        }
    }
}
