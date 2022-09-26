package com.sqlboy.design.factory;

interface Computer {
    /**
     * 安装屏幕
     */
    void setScreen();

    /**
     * 安装电池
     */
    void setBattery();
}

interface Phone {
    /**
     * 安装屏幕
     */
    void setScreen();

    /**
     * 安装电池
     */
    void setBattery();
}

interface AbstractFactory {
    /**
     * 工厂生产电脑接口
     *
     * @return
     */
    Computer makeComputer();

    /**
     * 共产生产手机接口
     *
     * @return
     */
    Phone makePhoto();
}

public class AbstractFactoryTest {
    public static void main(String[] args) {
        // 苹果工厂
        AppleFactory appleFactory = new AppleFactory();
        Computer appleComputer = appleFactory.makeComputer();
        Phone iphone = appleFactory.makePhoto();

        appleComputer.setScreen();
        appleComputer.setBattery();

        iphone.setScreen();
        iphone.setBattery();

        // 小米工厂
        XiaoMiFactory xiaoMiFactory = new XiaoMiFactory();
        Computer xiaomiComputer = xiaoMiFactory.makeComputer();
        Phone xiaomiPhone = xiaoMiFactory.makePhoto();

        xiaomiComputer.setScreen();
        xiaomiComputer.setBattery();

        xiaomiPhone.setScreen();
        xiaomiPhone.setBattery();
    }
}

class MacBook implements Computer {
    @Override
    public void setScreen() {
        System.out.println("为苹果电脑安装屏幕");
    }

    @Override
    public void setBattery() {
        System.out.println("为苹果电脑安装电池");
    }
}

class XiaomiComputer implements Computer {
    @Override
    public void setScreen() {
        System.out.println("为小米电脑安装屏幕");
    }

    @Override
    public void setBattery() {
        System.out.println("为小米电脑安装电池");
    }
}

class IPhone implements Phone {
    @Override
    public void setScreen() {
        System.out.println("为苹果手机安装屏幕");
    }

    @Override
    public void setBattery() {
        System.out.println("为苹果手机安装电池");
    }
}

class XiaomiPhone implements Phone {
    @Override
    public void setScreen() {
        System.out.println("为小米手机安装屏幕");
    }

    @Override
    public void setBattery() {
        System.out.println("为小米手机安装电池");
    }
}

class AppleFactory implements AbstractFactory {
    @Override
    public Computer makeComputer() {
        return new MacBook();
    }

    @Override
    public Phone makePhoto() {
        return new IPhone();
    }
}

class XiaoMiFactory implements AbstractFactory {
    @Override
    public Computer makeComputer() {
        return new XiaomiComputer();
    }

    @Override
    public Phone makePhoto() {
        return new XiaomiPhone();
    }
}