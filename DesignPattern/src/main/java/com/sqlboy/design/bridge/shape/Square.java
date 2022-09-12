package com.sqlboy.design.bridge.shape;

import com.sqlboy.design.bridge.color.Color;

public class Square extends Shape {

    public Square(Color color, float r) {
        super(color, r);
    }

    @Override
    public void makeShape() {
        color.makeColor();
        System.out.println("正方形，周长为" + getPerimeter());
    }

    @Override
    public float getPerimeter() {
        return 4 * r;
    }
}
