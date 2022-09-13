package com.sqlboy.design.command;

public class DakuanCommand implements Command {

    private BeefNoodlesWorker worker;

    public DakuanCommand(BeefNoodlesWorker worker) {
        this.worker = worker;
    }

    @Override
    public void execute() {
        this.worker.makeDakuan();
    }
}
