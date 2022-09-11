package com.sqlboy.design.flyweight;

import java.awt.*;

public class GeneralBullet implements Bullet {

    private final String name = "普通炮弹";

    // 为了简化，矢量图用字符串替代
    private final String img = "xxx";

    private final int size = 50;

    private final Color color = Color.BLACK;

    private final int lethality = 100;

    @Override
    public void draw(int x, int y) {
        System.out.println(String.format("普通炮弹位置：%d, %d", x, y));
    }
}
