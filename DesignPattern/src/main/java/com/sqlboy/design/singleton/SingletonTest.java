package com.sqlboy.design.singleton;

public class SingletonTest {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();

    }
}

///**
// * 饿汉式（静态常量）
// */
//class Singleton{
//
//    private Singleton(){}
//
//    private final static Singleton instance = new Singleton();
//
//    public static Singleton getInstance(){
//        return instance;
//    }
//}

///**
// * 饿汉式（静态代码块）
// */
//class Singleton{
//
//    private Singleton(){}
//
//    private static Singleton instance;
//
//    static {
//        instance = new Singleton();
//    }
//
//    public static Singleton getInstance(){
//        return instance;
//    }
//}

///**
// * 懒汉式（线程不安全）
// */
//class Singleton{
//
//    private Singleton(){}
//
//    private static Singleton instance;
//
//    public static Singleton getInstance(){
//
//        if (instance == null){
//            instance = new Singleton();
//        }
//
//        return instance;
//    }
//}

///**
// * 懒汉式（线程安全，同步方法）
// */
//class Singleton{
//
//    private Singleton(){}
//
//    private static Singleton instance;
//
//    public static synchronized Singleton getInstance(){
//
//        if (instance == null){
//            instance = new Singleton();
//        }
//
//        return instance;
//    }
//}

///**
// * 懒汉式（线程不安全，同步代码块）
// */
//class Singleton {
//
//    private Singleton() {
//    }
//
//    private static Singleton instance;
//
//    public static Singleton getInstance() {
//
//        if (instance == null) {
//            synchronized (Singleton.class) {
//                instance = new Singleton();
//            }
//        }
//
//        return instance;
//    }
//}

/**
 * 双重检查
 */
class Singleton {
    private static volatile Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }
}

///**
// * 静态内部类
// */
//class Singleton {
//
//    private Singleton() {
//    }
//
//    private static volatile Singleton instance;
//
//    private static class SingletonInstance {
//        private static final Singleton INSTANCE = new Singleton();
//    }
//
//    public static synchronized Singleton getInstance() {
//        return SingletonInstance.INSTANCE;
//    }
//}

///**
// * 枚举
// */
//enum Singleton{
//    INSTANCE;
//}