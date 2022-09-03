package com.sqlboy.design.decorator;

import lombok.ToString;

public class DecoratorTest {
    public static void main(String[] args) {
        Automobile automobile = new BaseAutomobile("2.0T", "双离合", "承载式");
        automobile.makeAutomobile();

        automobile = new AccDecorator(automobile);
        automobile.makeAutomobile();

        automobile = new ReversingRadarDecorator(automobile);
        automobile.makeAutomobile();
    }
}

interface Automobile {
    void makeAutomobile();
}

/**
 * 基础汽车类
 */
@ToString(callSuper = true)
class BaseAutomobile implements Automobile {

    private String engine;
    private String gearbox;
    private String chassisSuspension;

    public BaseAutomobile(String engine, String gearbox, String chassisSuspension) {
        this.engine = engine;
        this.gearbox = gearbox;
        this.chassisSuspension = chassisSuspension;
    }

    @Override
    public void makeAutomobile() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "BaseAutomobile{" + "engine='" + engine + '\'' + ", gearbox='" + gearbox + '\'' + ", chassisSuspension='" + chassisSuspension + '\'' + '}';
    }
}

@ToString
class AutomobileDecorator implements Automobile {

    private Automobile automobile;

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
@ToString(callSuper = true)
class AccDecorator extends AutomobileDecorator {

    private String acc;

    public AccDecorator(Automobile automobile) {
        super(automobile);
    }

    @Override
    public void makeAutomobile() {
        this.setAcc();
        System.out.println(this);
    }

    private void setAcc() {
        this.acc = "acc";
    }
}

class ReversingRadarDecorator extends AutomobileDecorator {

    private String reversingRadar;

    public ReversingRadarDecorator(Automobile automobile) {
        super(automobile);
    }

    @Override
    public void makeAutomobile() {
        this.setReversingRadar();
        System.out.println(this);
    }

    public void setReversingRadar() {
        this.reversingRadar = "reversingRadar";
    }
}