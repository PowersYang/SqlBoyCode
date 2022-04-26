package com.sqlboy.lineartable;

public class ShareStack {

    class StackNode {
        public Object[] data;

        public int maxSize;
        // 第一个栈的指针
        public int top1;
        // 第二个栈的指针
        public int top2;

        public StackNode(int maxSize) {
            this.maxSize = maxSize;
            data = new Object[maxSize];
            top1 = -1;
            top2 = maxSize;
        }
    }

    private StackNode stack;
    private int maxSize;

    public ShareStack(int maxSize) {
        this.maxSize = maxSize;
        stack = new StackNode(maxSize);
    }

    /**
     * 打印栈
     */
    public void show() {
        for (int i = 0; i < stack.maxSize; i++) {
            System.out.println(stack.data[i]);
        }
        System.out.println();
    }

    /**
     * 入栈
     *
     * @param obj        入栈元素
     * @param stackIndex 栈编号，只能为1或2
     */
    public void push(Object obj, int stackIndex) throws Exception {
        if (stack.top1 + 1 == stack.top2) {
            throw new Exception("栈已满");
        }

        if (stackIndex != 1 && stackIndex != 2) {
            throw new Exception("栈下标错误，只能为1或2");
        }

        if (stackIndex == 1) {
            stack.top1++;
            stack.data[stack.top1] = obj;
        } else {
            stack.top2--;
            stack.data[stack.top2] = obj;
        }
    }

    /**
     * 出栈
     *
     * @param stackIndex 栈编号
     * @return
     */
    public Object pop(int stackIndex) throws Exception {
        if (stackIndex != 1 && stackIndex != 2) {
            throw new Exception("栈下标错误，只能为1或2");
        }

        if (stackIndex == 1) {
            if (stack.top1 < 0) {
                throw new Exception("栈1为空");
            }

            Object data = stack.data[stack.top1];
            stack.data[stack.top1] = null;
            stack.top1--;

            return data;
        } else {
            if (stack.top2 >= stack.maxSize) {
                throw new Exception("栈2为空");
            }

            Object data = stack.data[stack.top2];
            stack.data[stack.top2] = null;
            stack.top2++;

            return data;
        }
    }

    public static void main(String[] args) throws Exception {
        ShareStack stack = new ShareStack(10);

        stack.push(0, 1);
        stack.push(1, 1);
        stack.push(2, 1);

        stack.push(3, 2);
        stack.push(4, 2);
        stack.push(5, 2);
        stack.push(5, 2);
        stack.push(5, 2);
        stack.push(5, 2);

        stack.show();

        stack.pop(2);
        stack.pop(2);
        stack.pop(1);

        stack.show();
    }
}
