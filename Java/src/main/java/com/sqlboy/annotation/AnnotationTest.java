package com.sqlboy.annotation;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class AnnotationTest {
    public static void main(String[] args) throws Exception {
        MyAnnotationHandler.handle(MyService.class);
    }
}

class MyAnnotationHandler {
    public static void handle(Class clazz) throws Exception {
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

        Object obj = clazz.newInstance();
        for (Method testMethod : testMethodList) {
            for (Method beforeMethod : beforeMethodList) {
                beforeMethod.invoke(obj);
            }

            testMethod.invoke(obj);

            for (Method afterMethod : afterMethodList) {
                afterMethod.invoke(obj);
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