package com.sqlboy.design.bridge.shape;

import com.sqlboy.design.bridge.color.Color;

public abstract class Shape {

    public float r;
    protected Color color;

    public Shape(Color color, float r) {
        this.color = color;
        this.r = r;
    }

    public abstract void makeShape();

    public abstract float getPerimeter();
}
