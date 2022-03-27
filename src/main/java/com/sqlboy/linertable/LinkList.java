package com.sqlboy.linertable;

public class LinkList {
    private Node head;
    private int size;

    public LinkList() {
        head = new Node();
    }

    /**
     * 创建空链表，只有头结点
     */
    public void createList() {
        head.next = null;
        size = 0;
    }

    /**
     * 整表创建空链表
     *
     * @param n
     */
    public void createList(int n) {
        // 创建一个Node，表示前置结点
        Node preNode = null;

        for (int i = 0; i < n; i++) {
            // 创建一个当前节点
            Node node = new Node();

            if (i == 0) {
                head.next = node;
            } else {
                preNode.next = node;
            }

            preNode = node;
            size++;
        }
    }

    /**
     * 打印链表
     */
    public void show() {
        Node node = head.next;
        for (int i = 0; i < size; i++) {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println();
    }

    /**
     * 在指定位置插入新结点
     *
     * @param obj
     * @param i
     */
    public boolean insert(Object obj, int i) {
        if (i < 0 || i > size) {
            System.out.println("插入位置不正确");
            return false;
        }

        Node s = new Node(obj);
        Node p = head;

        for (int j = 0; j < i; j++) {
            p = p.next;
        }

        s.next = p.next;
        p.next = s;

        size++;
        return true;
    }

    /**
     * 查找第i个元素
     *
     * @param i
     * @return
     */
    public Object search(int i) {
        Node p = head;

        // i 有可能为0
        for (int j = 0; j <= i; j++) {
            p = p.next;
        }

        if (p == null) {
            return -1;
        } else {
            return p.data;
        }
    }

    /**
     * 删除指定位置的元素
     *
     * @param i
     * @return
     */
    public Node remove(int i) {
        if (i < 0 || i > size - 1) {
            System.out.println("删除位置不正确");
            return null;
        }

        Node p = head;
        for (int j = 0; j < i; j++) {
            p = p.next;
        }

        if (p.next == null) {
            // 没找到
            return null;
        } else {
            // 找到了
            Node t = p.next;
            p.next = p.next.next;
            size--;
            return t;
        }
    }

    public static void main(String[] args) {
        LinkList list = new LinkList();
        list.insert(new Integer(0), 0);
        list.insert(new Integer(1), 1);
        list.insert(new Integer(2), 2);
        list.insert(new Integer(3), 3);

        list.show();

        System.out.println(list.remove(3));
        System.out.println();
        list.show();


//        LinkList list2 = new LinkList();
//        list2.createList(5);
//        list2.show();
    }
}

class Node {
    // 数据域
    public Object data;
    // 指针域
    public Node next;

    public Node() {}

    public Node(Object obj) {
        data = obj;
    }

    @Override
    public String toString() {
        return data.toString();
    }
}
