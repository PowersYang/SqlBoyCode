package com.sqlboy.design.observer;

public class ObserverTest {
    public static void main(String[] args) {
        Subject subject = new SupermarketOwner();
        subject.subscribe("黑兰州", new Consumer("王老二"));
        subject.subscribe("黑兰州", new Consumer("王老三"));
        subject.subscribe("利群", new Consumer("张老六"));
        subject.subscribe("利群", new Consumer("张老七"));
        subject.subscribe("利群", new Consumer("张老八"));
        subject.subscribe("华子", new Consumer("村长"));

        subject.notify("华子");
        System.out.println("------------");
        subject.notify("利群");
        System.out.println("------------");
        subject.notify("黑兰州");
    }
}
