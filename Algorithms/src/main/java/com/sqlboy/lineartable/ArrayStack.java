package com.sqlboy.lineartable;

public class ArrayStack {

    class StackNode {
        public Object[] data;
        public int top;
    }

    private int maxSize;
    private StackNode stack;

    public ArrayStack(int maxSize) {
        this.maxSize = maxSize;
        stack = new StackNode();
        stack.data = new Object[maxSize];
        stack.top = -1;
    }

    /**
     * 入栈
     *
     * @param obj
     */
    public void push(Object obj) {
        if (stack.top == maxSize - 1) {
            System.out.println("栈已满，入栈失败！");
        } else {
            stack.top++;
            stack.data[stack.top] = obj;
        }
    }

    /**
     * 出栈
     *
     * @return
     */
    public Object pop() {
        if (stack.top == -1) {
            System.out.println("栈已空，出栈失败~");

            return null;
        } else {
            Object data = stack.data[stack.top];
            stack.data[stack.top] = null;
            stack.top--;

            return data;
        }
    }

    /**
     * 打印栈
     */
    public void show() {
        for (int i = stack.top; i >= 0; i--) {
            System.out.println(stack.data[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack(5);
        arrayStack.push(1);
        arrayStack.push(2);
        arrayStack.push(3);
        arrayStack.push(4);
        arrayStack.push(5);

        arrayStack.show();

        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());

        arrayStack.show();
    }
}
