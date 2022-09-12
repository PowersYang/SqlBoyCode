package com.sqlboy.design.flyweight;

import java.util.HashMap;
import java.util.Map;

public class BulletFactory {
    private static final Map<String, Bullet> map = new HashMap<>();

    public static Bullet getBullet(String name) {
        Bullet bullet = map.get(name);

        if (bullet == null) {
            if (name.equals("普通炮弹")) {
                bullet = new GeneralBullet();
            } else if (name.equals("超级炮弹")) {
                bullet = new SuperBullet();
            } else {
                throw new IllegalArgumentException();
            }

            map.put(name, bullet);
        }

        return bullet;
    }
}
