package com.sqlboy.design.responsibility;

public interface Handler {
    void setNextHanlder(Handler hanlder);

    boolean handle(int days);
}
