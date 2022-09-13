package com.sqlboy.design.command;

public class CommandTest {
    public static void main(String[] args) {
        // 对应服务员
        Invoker invoker = new Invoker();

        // 命令执行者
        BeefNoodlesWorker beefNoodlesWorker = new BeefNoodlesWorker();
        ChaomianWorker chaomianWorker = new ChaomianWorker();

        // 构建具体的命令，每个命令都会绑定具体的执行者
        ErxiCommand erxiCommand = new ErxiCommand(beefNoodlesWorker);
        DakuanCommand dakuanCommand = new DakuanCommand(beefNoodlesWorker);
        ChaolatiaoCommand chaolatiaoCommand = new ChaolatiaoCommand(chaomianWorker);

        // 构建执行计划
        invoker.addCommand(erxiCommand);
        invoker.addCommand(dakuanCommand);
        invoker.addCommand(chaolatiaoCommand);

        invoker.UndoCommand(dakuanCommand);

        invoker.executeCommand();
    }
}
