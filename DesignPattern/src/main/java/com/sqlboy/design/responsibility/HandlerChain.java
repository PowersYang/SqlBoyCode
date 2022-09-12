package com.sqlboy.design.responsibility;

public class HandlerChain {

    private Handler head;

    /**
     * 设置责任链上的处理器
     *
     * @return
     */
    public void setChain(Handler first, Handler... handlers) {
        head = first;

        for (Handler nextHandler : handlers) {
            first.setNextHanlder(nextHandler);
            first = nextHandler;
        }
    }

    public void handle(int days) {
        head.handle(days);
    }
}
