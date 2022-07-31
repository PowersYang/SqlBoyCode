package com.sqlboy.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * 在运行时创建类对象
 */
public class ClassTest {
    public static void main(String[] args) throws Exception {
        System.out.println("程序已经开始执行");
        Class clazz = Person.class;

        Constructor constructor = clazz.getDeclaredConstructor(String.class, Integer.class);
        Object person = constructor.newInstance("张三", 18);
        System.out.println(person);
        Method say = clazz.getDeclaredMethod("say");
        say.setAccessible(true);
        say.invoke(person);
    }
}

class Person {

    private String name;
    private Integer age;

    Person() {
    }

    Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "name: " + name + ",age: " + age;
    }

    private void say() {
        System.out.println("我的名字是：" + name + ", 我今年 " + age + " 岁");
    }
}
