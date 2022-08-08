package com.sqlboy.annotation;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class AnnotationTest {
    public static void main(String[] args) throws Exception {
        MyAnnotationHandler myAnnotationHandler = new MyAnnotationHandler();
        myAnnotationHandler.handler();
    }
}

class MyAnnotationHandler {
    public void handler() throws Exception {
        Class<MyService> clazz = MyService.class;
        MyService myService = clazz.newInstance();
        Method[] methods = clazz.getDeclaredMethods();

        List<Method> beforeMethodList = new ArrayList<>();
        List<Method> testMethodList = new ArrayList<>();
        List<Method> afterMethodList = new ArrayList<>();

        for (Method method : methods) {
            if (method.isAnnotationPresent(MyBefore.class)) {
                beforeMethodList.add(method);
            }

            if (method.isAnnotationPresent(MyTest.class)) {
                testMethodList.add(method);
            }

            if (method.isAnnotationPresent(MyAfter.class)) {
                afterMethodList.add(method);
            }
        }

        for (Method testMethod : testMethodList) {
            for (Method beforeMethod : beforeMethodList) {
                beforeMethod.invoke(myService);
            }

            testMethod.invoke(myService);

            for (Method afterMethod : afterMethodList) {
                afterMethod.invoke(myService);
            }
        }
    }
}


class MyService {
    @MyBefore
    public void before() {
        System.out.println("获取数据库连接");
    }

    @MyTest
    public void test() {
        System.out.println("处理数据");
    }

    @MyAfter
    public void after() {
        System.out.println("释放数据库连接资源");
    }
}