package com.sqlboy.design.adapter;

/**
 * 方钉的圆孔适配器
 */
public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        // 计算方钉的最小圆半径（就是正方行中心点到其中一个顶点的距离），才能适配圆孔
        return (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
    }
}