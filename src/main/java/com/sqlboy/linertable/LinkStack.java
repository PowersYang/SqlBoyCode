package com.sqlboy.linertable;

public class LinkStack {
    class StackNode {
        public Object data;
        public StackNode next;

        public StackNode() {
        }

        public StackNode(Object data) {
            this.data = data;
        }
    }

    private int size;
    private StackNode top;

    /**
     * 入栈
     *
     * @param obj
     */
    public void push(Object obj) {
        StackNode node = new StackNode(obj);
        node.next = top;
        top = node;
        size++;
    }

    /**
     * 出栈
     *
     * @return
     */
    public Object pop() {
        if (size < 1) {
            System.out.println("栈已空，出栈失败！");

            return null;
        }

        StackNode t = top;
        top = top.next;
        size--;

        return t.data;
    }

    /**
     * 打印栈
     */
    public void show() {
        StackNode node = top;
        for (int i = 0; i < size; i++) {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkStack linkStack = new LinkStack();
        linkStack.push(1);
        linkStack.push(2);
        linkStack.push(3);
        linkStack.push(4);
        linkStack.push(5);

        linkStack.show();
        System.out.println(linkStack.top.data);

        System.out.println(linkStack.pop());
        System.out.println(linkStack.pop());
        System.out.println(linkStack.pop());
        System.out.println(linkStack.pop());
        System.out.println(linkStack.pop());
        System.out.println(linkStack.pop());
    }
}
