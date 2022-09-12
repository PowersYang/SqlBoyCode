package com.sqlboy.design.observer;

public class Consumer implements Observer {

    private String name;

    public Consumer(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + "收到：" + message);
    }
}
