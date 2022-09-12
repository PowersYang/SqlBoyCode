package com.sqlboy.design.prototype;

public class ProtoTypeTest {
    public static void main(String[] args) throws InterruptedException {
        // 假设 monkey01 为孙悟空
        Monkey monkey01 = new Monkey();

        // 孙悟空刚开始的武力值为60，所以克隆出来的小猴子武力值是60
        Monkey monkey02 = (Monkey) monkey01.clone();
        System.out.println(monkey02.forceValue);

        // 孙悟空发育了一会儿，武力值达到了100
        monkey01.growUp();

        // 此时克隆出来的小猴子武力值也是100
        Monkey monkey03 = (Monkey) monkey01.clone();
        System.out.println(monkey03.forceValue);
    }
}

interface ProtoType {
    ProtoType clone();
}

class Monkey implements ProtoType {

    public int forceValue = 60;

    public Monkey() {
    }

    private Monkey(int forceValue) {
        this.forceValue = forceValue;
    }

    /**
     * 假设猴子的成长比较耗时
     *
     * @throws InterruptedException
     */
    public void growUp() throws InterruptedException {
        System.out.println("猴子正在成长");
        Thread.sleep(5 * 1000);
        this.forceValue = 100;
        System.out.println("猴子长大了，武力值充满，可以战斗");
    }

    @Override
    public ProtoType clone() {
        return new Monkey(this.forceValue);
    }
}