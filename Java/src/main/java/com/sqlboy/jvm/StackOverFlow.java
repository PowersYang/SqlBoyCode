package com.sqlboy.jvm;

/**
 * 虚拟机参数：-Xss160k
 */
public class StackOverFlow {

    private int stackLength = 1;

    public void stackLeak(){
        stackLength ++;
        stackLeak(); // 递归调用
    }

    public static void main(String[] args) {
        StackOverFlow sof = new StackOverFlow();

        try {
        sof.stackLeak();
        }catch (Throwable e){
            System.out.println("stack length:"+ sof.stackLength);
            throw e;
        }
    }
}
