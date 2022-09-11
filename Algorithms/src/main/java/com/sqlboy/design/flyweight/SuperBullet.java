package com.sqlboy.design.flyweight;

import java.awt.*;

public class SuperBullet implements Bullet {

    private final String name = "超级炮弹";

    // 为了简化，矢量图用字符串替代
    private final String img = "yyy";

    private final int size = 100;

    private final Color color = Color.YELLOW;

    private final int lethality = 200;

    @Override
    public void draw(int x, int y) {
        System.out.println(String.format("超级炮弹位置：%d, %d", x, y));
    }
}
