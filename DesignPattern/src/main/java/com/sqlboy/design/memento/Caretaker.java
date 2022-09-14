package com.sqlboy.design.memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private List<EditorSnapshot> snapshots = new ArrayList<>();

    /**
     * 保存快照
     *
     * @param snapshot
     */
    public void saveSnapshot(EditorSnapshot snapshot) {
        this.snapshots.add(snapshot);
    }

    /**
     * 获取快照
     *
     * @param index
     * @return
     */
    public EditorSnapshot getSnapshot(int index) {
        return snapshots.get(index);
    }
}
