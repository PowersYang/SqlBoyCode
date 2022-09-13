package com.sqlboy.design.command;

public class ErxiCommand implements Command {

    private BeefNoodlesWorker worker;

    public ErxiCommand(BeefNoodlesWorker worker) {
        this.worker = worker;
    }

    @Override
    public void execute() {
        this.worker.makeErxi();
    }
}
