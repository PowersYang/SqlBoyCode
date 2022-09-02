package com.sqlboy.design.adapter;

public class AdapterTest {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(3);

        // 圆孔半径大于等于圆钉半径，说明适配
        System.out.println(hole.fits(roundPeg));

        SquarePeg squarePeg = new SquarePeg(5);
        // 方钉直接和圆孔适配会报错
        // hole.fits(squarePeg);

        // 借助方钉适配器
        SquarePegAdapter adapter = new SquarePegAdapter(squarePeg);
        // 适配器计算得到的方钉适合的最大圆孔半径
        System.out.println(adapter.getRadius());
        // 适配
        System.out.println(hole.fits(adapter));
    }
}
