package com.sqlboy.linertable;

/**
 * 顺序表
 *
 * <p>
 */
public class SeqList {

    private int maxSize;
    private int usedSize;
    private Object[] arrayList;

    /**
     * 初始化
     *
     * @param maxSize
     */
    public SeqList(int maxSize) {
        this.maxSize = maxSize;
        this.usedSize = 0;

        arrayList = new Object[maxSize];
    }

    /**
     * 打印顺序表
     */
    public void display() {
        for (int i = 0; i < usedSize; i++) {
            System.out.print(arrayList[i] + " ");
        }

        System.out.println();
    }


    /**
     * 插入元素
     *
     * @param index 插入位置
     * @param obj   插入对象
     * @throws Exception
     */
    public void insert(int index, Object obj) throws Exception {
        if (usedSize == maxSize) {
            throw new Exception("顺序表已满！");
        }

        if (index < 0 || index > usedSize) {
            // index > usedSize 是为了保证元素之间不出现空缺位置
            throw new Exception("插入位置不存在");
        }

        // 从 index + 1 到 userSize 位置的元素统统往后移动一个位置
        for (int i = usedSize; i > index; i--) {
            arrayList[i] = arrayList[i - 1];
        }

        arrayList[index] = obj;
        usedSize++;
    }

    /**
     * 删除第一个出现的元素
     *
     * @param index 删除元素的下标
     * @return 删除的元素
     */
    public Object delete(int index) throws Exception {
        if (usedSize == 0) {
            throw new Exception("顺序表为空！");
        }

        if (index < 0 || index >= usedSize) {
            throw new Exception("删除位置不存在！");
        }

        // 先把要返回的元素取出来，免得待会删除以后想返回找不到了
        Object obj = arrayList[index];

        // 从index + 1 到 userSize 的元素往前移动一个位置
        for (int i = index; i < usedSize; i++) {
            arrayList[i] = arrayList[i + 1];
        }

        usedSize--;

        return obj;
    }


    /**
     * 判断是否包含某个元素
     *
     * @param obj
     * @return
     */
    public boolean contains(Object obj) {
        for (int i = 0; i < usedSize; i++) {
            if (arrayList[i].equals(obj)) {
                return true;
            }
        }

        return false;
    }

    /**
     * 查找某个元素的位置
     *
     * @param obj
     * @return
     */
    public int search(Object obj) {
        for (int i = 0; i < usedSize; i++) {
            if (arrayList[i].equals(obj)) {
                return i;
            }
        }

        return -1;
    }


    /**
     * 查找某个位置的元素
     *
     * @param index
     * @return
     */
    public Object search(int index) throws Exception {

        // 这个判断其实可以不要，因为如果 usedSize 为 0，则不论 index 的值如何都会走到下一个判断中
        if (usedSize == 0) {
            return -1;
        }

        if (index < 0 || index >= usedSize) {
            throw new Exception("查找位置不正确");
        }


        return arrayList[index];
    }

    /**
     * 清空顺序表
     */
    public void clear() {
        usedSize = 0;
    }


    public static void main(String[] args) throws Exception {
        SeqList list = new SeqList(10);
//        list.insert(0, new Integer(1));
//        list.insert(1, new Integer(2));
//        list.insert(2, new Integer(3));

        list.display();

        System.out.println(list.search(0));

        list.display();
    }
}
