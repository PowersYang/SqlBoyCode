package com.sqlboy.reflect;

public class StaticProxyTest {
    public static void main(String[] args) {
        // 被代理对象
        Customer customer1 = new Customer("找房子");
        // 代理对象
        HouseWorker houseWorker = new HouseWorker(customer1);
        // 代理对象通过自己的方法，间接调用了被代理对象的方法
        houseWorker.action();

        // 被代理对象
        Customer customer2 = new Customer("买车");
        // 代理对象
        CarWorker carWorker = new CarWorker(customer2);
        // 代理对象通过自己的方法，间接调用了被代理对象的方法
        carWorker.action();
    }
}

/**
 * 抽象代理行为
 */
interface Worker {

    void action();

}

/**
 * 代理对象
 */
class HouseWorker implements Worker {

    // 被代理对象
    Customer customer;

    HouseWorker(Customer customer) {
        this.customer = customer;
    }

    @Override
    public void action() {
        customer.action();
        System.out.println("我是房屋中介，我帮你去完成");
    }
}


class CarWorker implements Worker {

    // 被代理对象
    Customer customer;

    CarWorker(Customer customer) {
        this.customer = customer;
    }

    @Override
    public void action() {
        customer.action();
        System.out.println("我是汽车销售，我替你去完成");
    }
}

class Customer implements Worker {

    String demand;

    Customer(String demand) {
        this.demand = demand;
    }

    @Override
    public void action() {
        System.out.println("我是雇主，我需要" + demand);
    }
}