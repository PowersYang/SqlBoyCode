package com.sqlboy.design.decorator;

import java.util.ArrayList;
import java.util.List;

public class DecoratorTest {
    public static void main(String[] args) {
        Automobile automobile = new BaseAutomobile();
        automobile.makeAutomobile();

        automobile = new AccDecorator(automobile);
        automobile.makeAutomobile();

        automobile = new ReversingRadarDecorator(automobile);
        automobile.makeAutomobile();
    }
}

interface Automobile {
    // 配置清单
    List<String> confList = new ArrayList<>();

    void makeAutomobile();
}

/**
 * 基础汽车类
 */
class BaseAutomobile implements Automobile {


    public BaseAutomobile() {
        confList.add("2.0T Engine");
        confList.add("双离合变速箱");
        confList.add("承载式车身");
    }

    @Override
    public void makeAutomobile() {
        System.out.println(confList);
    }
}

class AutomobileDecorator implements Automobile {

    public Automobile automobile;

    public AutomobileDecorator(Automobile automobile) {
        this.automobile = automobile;
    }

    @Override
    public void makeAutomobile() {
        automobile.makeAutomobile();
    }
}

/**
 * ACC功能装饰器
 */
class AccDecorator extends AutomobileDecorator {

    public AccDecorator(Automobile automobile) {
        super(automobile);
    }

    @Override
    public void makeAutomobile() {
        this.setAcc();
        System.out.println(confList);
    }

    private void setAcc() {
        confList.add("acc");
    }
}

/**
 * 倒车雷达装饰类
 */
class ReversingRadarDecorator extends AutomobileDecorator {

    public ReversingRadarDecorator(Automobile automobile) {
        super(automobile);
    }

    @Override
    public void makeAutomobile() {
        this.setReversingRadar();
        System.out.println(confList);
    }

    public void setReversingRadar() {
        confList.add("reversingRadar");
    }
}