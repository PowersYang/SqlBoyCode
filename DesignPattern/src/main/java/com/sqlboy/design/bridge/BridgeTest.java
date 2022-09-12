package com.sqlboy.design.bridge;

import com.sqlboy.design.bridge.color.BlueColor;
import com.sqlboy.design.bridge.color.RedColor;
import com.sqlboy.design.bridge.color.YellowColor;
import com.sqlboy.design.bridge.shape.Circle;
import com.sqlboy.design.bridge.shape.Square;
import com.sqlboy.design.bridge.color.Color;

public class BridgeTest {
    public static void main(String[] args) {
        Color red = new RedColor();
        Color blue = new BlueColor();
        Color yellow = new YellowColor();

        // 红色正方行
        Square square1 = new Square(red, 10);
        square1.makeShape();

        // 蓝色正方形
        Square square2 = new Square(blue, 20);
        square2.makeShape();

        // 黄色圆
        Circle circle = new Circle(yellow, 15);
        circle.makeShape();
    }
}
