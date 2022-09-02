package com.sqlboy.design.adapter;

/**
 * 圆孔类
 */
public class RoundHole {
    /**
     * 半径
     */
    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    /**
     * 检验圆钉是否适配圆孔
     * @param peg 圆钉
     * @return
     */
    public boolean fits(RoundPeg peg) {
        // 如果圆孔的半径大于等于圆钉的半径，则适配
        return (this.getRadius() >= peg.getRadius());
    }
}
