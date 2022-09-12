package com.sqlboy.design.responsibility;

public class CenterLeader implements Handler {

    private Handler nextHandler;

    @Override
    public void setNextHanlder(Handler hanlder) {
        this.nextHandler = hanlder;
    }

    @Override
    public boolean handle(int days) {
        if (days <= 3) {
            System.out.println("中心领导批了");
            return true;
        } else {
            System.out.println("中心领导没权限，往上传递");
            return this.nextHandler.handle(days);
        }
    }
}
