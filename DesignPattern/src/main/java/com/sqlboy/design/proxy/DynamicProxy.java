package com.sqlboy.design.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy {
    public static void main(String[] args) {
        // 被代理对象1需要找房
        Customer customer1 = new Customer("找房子");
        // 代理工厂动态生成代理对象，替客户完成
        Worker proxyInstance1 = (Worker) ProxyFactory.getProxyInstance(customer1);
        // 代理对象通过调用自己的方法，间接调用了被代理对象的方法，知道了对方的需求
        proxyInstance1.action();

        // 被代理对象2需要买车
        Customer customer2 = new Customer("买车");
        Worker proxyInstance2 = (Worker) ProxyFactory.getProxyInstance(customer2);
        proxyInstance2.action();
    }
}


/**
 * 代理工厂
 */
class ProxyFactory {

    /**
     * 获取代理对象实例
     *
     * @param obj 被代理对象
     * @return
     */
    public static Object getProxyInstance(Object obj) {
        MyInvocationHandler handler = new MyInvocationHandler();
        handler.bind(obj);

        return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), handler);
    }
}

class MyInvocationHandler implements InvocationHandler {

    // 被代理对象
    private Object obj;

    // 为被代理对象赋值
    public void bind(Object obj) {
        this.obj = obj;
    }

    // 当通过代理对象调用某个方法a时，就会自动调用此方法
    // 所以可以将被代理对象要执行的功能a定义在此方法中
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // method为代理类对象的方法

        Object invokeResult = method.invoke(obj, args);
        System.out.println("我是代理对象，我替你去完成");
        return invokeResult;
    }
}
