package com.sqlboy.design.command;

public class ChaolatiaoCommand implements Command {

    private ChaomianWorker worker;

    public ChaolatiaoCommand(ChaomianWorker worker) {
        this.worker = worker;
    }

    @Override
    public void execute() {
        this.worker.makeChaolatiao();
    }
}
