package com.sqlboy.design.bridge.shape;

import com.sqlboy.design.bridge.color.Color;

public class Circle extends Shape {

    public Circle(Color color, float r) {
        super(color, r);
    }

    @Override
    public void makeShape() {
        color.makeColor();
        System.out.println("圆，周长为：" + getPerimeter());
    }

    @Override
    public float getPerimeter() {
        return (float) (2 * 3.14 * r);
    }
}
