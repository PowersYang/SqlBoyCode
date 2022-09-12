package com.sqlboy.design.responsibility;

public class ResponsibilityTest {
    public static void main(String[] args) {
        HandlerChain chain = new HandlerChain();
        chain.setChain(new GroupLeader(), new CenterLeader(), new Boss());

        chain.handle(1);
        System.out.println("-------------");
        chain.handle(3);
        System.out.println("-------------");
        chain.handle(5);
        System.out.println("-------------");
        chain.handle(10);
    }
}
