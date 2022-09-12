package com.sqlboy.design.observer;

public interface Subject {
    void subscribe(String topic, Observer observer);

    void unsubscribe(String topic, Observer observer);

    void notify(String topic);
}
