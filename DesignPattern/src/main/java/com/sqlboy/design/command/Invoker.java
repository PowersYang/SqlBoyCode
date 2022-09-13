package com.sqlboy.design.command;

import java.util.ArrayList;
import java.util.List;

public class Invoker {

    private final List<Command> commands = new ArrayList<>();

    public void addCommand(Command command) {
        commands.add(command);
        System.out.println("添加命令成功：" + command.getClass().getSimpleName());
    }

    public void executeCommand() {
        for (Command command : commands) {
            command.execute();
        }
    }

    public void UndoCommand(Command command) {
        if (commands.remove(command)) {
            System.out.println("撤销命令成功：" + command.getClass().getSimpleName());
        } else {
            System.out.println("撤销命令失败：" + command.getClass().getSimpleName());
        }
    }
}
