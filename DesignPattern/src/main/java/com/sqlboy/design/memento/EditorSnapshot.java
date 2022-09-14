package com.sqlboy.design.memento;

public class EditorSnapshot {
    private String text;

    private long length;

    private long timestamp;

    public EditorSnapshot(String text, long length, long timestamp) {
        this.text = text;
        this.length = length;
        this.timestamp = timestamp;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
