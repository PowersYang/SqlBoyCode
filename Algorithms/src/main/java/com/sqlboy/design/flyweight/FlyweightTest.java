package com.sqlboy.design.flyweight;

import java.util.HashSet;
import java.util.Set;

public class FlyweightTest {
    public static void main(String[] args) {

        Set<Integer> generalSet1 = new HashSet<>();
        Set<Integer> generalSet2 = new HashSet<>();

        // 通过传统的 new 方式创建10000个对象
        for (int i = 0; i < 10000; i++) {
            GeneralBullet bullet = new GeneralBullet();
            bullet.draw(i, i + 1);
            generalSet1.add(bullet.hashCode());
        }

        // 通过 FlyweightFactory 获取10000个对象
        for (int i = 0; i < 10000; i++) {
            Bullet bullet = BulletFactory.getBullet("普通炮弹");
            bullet.draw(i, i + 1);
            generalSet2.add(bullet.hashCode());
        }

        System.out.println(generalSet1.size());
        System.out.println(generalSet2.size());
    }
}
