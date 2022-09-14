package com.sqlboy.design.memento;

public class MementoTest {
    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();
        Editor editor = new Editor();

        editor.edit("这是第一份快照");
        caretaker.saveSnapshot(editor.createSnapshot());

        editor.edit("这是第二份快照，多四个字");
        caretaker.saveSnapshot(editor.createSnapshot());

        editor.edit("This is the third snapshot");
        caretaker.saveSnapshot(editor.createSnapshot());

        System.out.println(editor);

        // 恢复第一次的状态
        editor.restoreSnapshot(caretaker.getSnapshot(0));
        System.out.println(editor);

        // 恢复第二次状态
        editor.restoreSnapshot(caretaker.getSnapshot(1));
        System.out.println(editor);

        // 恢复第三次状态
        editor.restoreSnapshot(caretaker.getSnapshot(2));
        System.out.println(editor);
    }
}
