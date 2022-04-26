package com.sqlboy.lineartable;

/**
 * 环形链表
 */
public class CycleLinkList {
    // 头结点
    private Node head;

    // 结点数
    private int size;

    public CycleLinkList() {
        head = new Node();
    }

    /**
     * 打印链表
     */
    public void show() {
        Node node = head.next;
        for (int i = 0; i < size; i++) {
            System.out.println(node.data + ", next " + node.next.data);
            node = node.next;
        }
        System.out.println();
    }

    /**
     * 插入元素
     *
     * @param obj
     * @param i
     * @return
     */
    public boolean insert(Object obj, int i) {
        if (i < 0 || i > size) {
            System.out.println("插入位置不正确");
            return false;
        }

        Node s = new Node(obj);
        Node p = head;


        if (size == 0) {
            s.next = head;
            head.next = s;
        }

        for (int j = 0; j < i; j++) {
            p = p.next;
        }

        s.next = p.next;
        p.next = s;

        size++;
        return true;
    }

    /**
     * 按位置删除元素
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

        // 找到了
        Node t = p.next;
        p.next = p.next.next;
        size--;
        return t;
    }

    /**
     * 按位置查找
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


    public static void main(String[] args) {
        CycleLinkList list = new CycleLinkList();
        list.insert(new Integer(0), 0);
        list.insert(new Integer(1), 1);
        list.insert(new Integer(2), 2);
        list.show();

        list.insert(new Integer(200), 2);
        list.show();
        list.insert(new Integer(3), 3);

        list.show();

        list.remove(4);
        list.show();

        System.out.println(list.search(3));
    }
}