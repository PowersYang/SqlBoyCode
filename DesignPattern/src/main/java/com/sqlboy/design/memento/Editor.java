package com.sqlboy.design.memento;

public class Editor {
    // 文本中的内容
    private String text;

    // 文本长度
    private long length;

    // 最后修改时间
    private long timestamp;

    public void edit(String text) {
        this.text = text;
        this.length = text.length();
        this.timestamp = System.currentTimeMillis();
    }

    @Override
    public String toString() {
        return "Editor{" +
                "text='" + text + '\'' +
                ", length=" + length +
                ", timestamp=" + timestamp +
                '}';
    }

    /**
     * 创建快照
     *
     * @return
     */
    public EditorSnapshot createSnapshot() {
        return new EditorSnapshot(text, length, timestamp);
    }

    /**
     * 恢复快照
     *
     * @param snapshot
     */
    public void restoreSnapshot(EditorSnapshot snapshot) {
        this.text = snapshot.getText();
        this.length = snapshot.getLength();
        this.timestamp = snapshot.getTimestamp();
    }
}
