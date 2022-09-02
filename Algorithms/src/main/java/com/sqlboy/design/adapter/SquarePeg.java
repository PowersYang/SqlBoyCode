package com.sqlboy.design.adapter;

/**
 * 方钉
 */
public class SquarePeg {
    /**
     * 方钉边长
     */
    private double width;

    public SquarePeg(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getSquare() {
        return Math.pow(this.width, 2);
    }
}