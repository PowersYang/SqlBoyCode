package com.sqlboy.factory;

public class FactoryMethodTest {
    public static void main(String[] args) {
        String productType = "PJ";

        Product product;
        Factory factory;

        if (productType.equals("TV")) {
            factory = new TelevisionFactory();
        } else if (productType.equals("PJ")) {
            factory = new ProjectorFactory();
        } else {
            throw new IllegalArgumentException("参数类型错误");
        }

        factory.doSometh();
        product = factory.createProduct();
        product.music();
        product.play();
    }
}

/**
 * 要生产的产品抽象类，具体的产品需要集成自此类
 */
abstract class Product {
    public abstract void music();

    public abstract void play();
}

/**
 * 电视类
 */
class Television extends Product {
    @Override
    public void music() {
        System.out.println("电视在放音乐");
    }

    @Override
    public void play() {
        System.out.println("电视在放电影");
    }
}

/**
 * 投影类
 */
class Projector extends Product {
    @Override
    public void music() {
        System.out.println("投影仪在放音乐");
    }

    @Override
    public void play() {
        System.out.println("投影仪在放电影");
    }
}

/**
 * 工厂类，其内部提供一个创建产品的方法，返回类型为 Product
 */
abstract class Factory {

    /**
     * 父类也可以提供一些默认实现
     */
    abstract Product createProduct();

    /**
     * 工厂类中除了创建产品之外，还可以做一些核心业务逻辑的处理
     */
    public void doSometh() {
        System.out.println("执行 Factory 核心业务");
    }
}

/**
 * 具体创建工厂
 */
class TelevisionFactory extends Factory {
    /**
     * 子类根据需求创建不同的产品
     * @return
     */
    @Override
    Product createProduct() {
        return new Television();
    }

    @Override
    public void doSometh() {
        super.doSometh();

        System.out.println("执行 TelevisionFactory 核心业务");
    }
}

class ProjectorFactory extends Factory {
    @Override
    Product createProduct() {
        return new Projector();
    }

    @Override
    public void doSometh() {
        super.doSometh();

        System.out.println("执行 ProjectorFactory 核心业务");
    }
}