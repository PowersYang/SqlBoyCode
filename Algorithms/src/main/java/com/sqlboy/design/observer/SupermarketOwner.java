package com.sqlboy.design.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 超市老板，具体的被观察者
 */
public class SupermarketOwner implements Subject {

    Map<String, List<Observer>> listeners = new HashMap<>();

    @Override
    public void subscribe(String topic, Observer observer) {
        List<Observer> observers = listeners.get(topic);
        if (observers == null) {
            observers = new ArrayList<>();
            observers.add(observer);
            listeners.put(topic, observers);
        } else {
            observers.add(observer);
        }
    }

    @Override
    public void unsubscribe(String topic, Observer observer) {
        List<Observer> observers = listeners.get(topic);

        if (observers == null) {
            System.out.println("主题不存在");
        } else {
            observers.remove(observer);
        }
    }

    @Override
    public void notify(String topic) {
        List<Observer> observers = listeners.get(topic);

        if (observers != null) {
            for (Observer observer : observers) {
                observer.update(topic + "到货了");
            }
        }
    }
}
