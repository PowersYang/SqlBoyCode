package com.sqlboy.linertable;

public class DoubleLinkList {
    DoubleNode head;
    int size;

    public DoubleLinkList() {
        head = new DoubleNode();
    }

    /**
     * 打印链表
     */
    public void show() {
        DoubleNode node = head.next;
        for (int i = 0; i < size; i++) {
            if (i == 0) {
                System.out.println(node + " , prior " + "null" + " , next " + node.next);
            } else {
                System.out.println(node + " , prior " + node.prior + " , next " + node.next);
            }
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

        DoubleNode s = new DoubleNode(obj);
        DoubleNode p = head;

        for (int j = 0; j < i; j++) {
            p = p.next;
        }

        s.prior = p;
        s.next = p.next;
        if (p.next != null) {
            // 避免添加第0个结点出现空指针
            p.next.prior = s;
        }
        p.next = s;

        size++;
        return true;
    }

    /**
     * 删除指定位置的元素
     *
     * @param i
     * @return
     */
    public DoubleNode remove(int i) {
        if (i < 0 || i > size - 1) {
            System.out.println("删除位置不正确");
            return null;
        }

        DoubleNode p = head;
        for (int j = 0; j <= i; j++) {
            p = p.next;
        }

        if (p == null) {
            // 没找到
            return null;
        } else {
            // 找到了
            p.prior.next = p.next;
            if (p.next != null) {
                // 避免删除最后一个结点出现空指针
                p.next.prior = p.prior;
            }
            size--;
            return p;
        }
    }

    public static void main(String[] args) {
        DoubleLinkList list = new DoubleLinkList();
        list.insert(new Integer(0), 0);
        list.insert(new Integer(1), 1);
        list.insert(new Integer(2), 2);
        list.insert(new Integer(3), 3);

        list.show();

        System.out.println(list.remove(3));
        list.show();
    }
}

class DoubleNode {
    Object data;
    // 直接前驱指针
    DoubleNode prior;
    // 直接后继指针
    DoubleNode next;


    public DoubleNode() {
    }

    public DoubleNode(Object obj) {
        data = obj;
    }

    @Override
    public String toString() {
        return data.toString();
    }
}
