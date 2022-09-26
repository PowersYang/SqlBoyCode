package com.sqlboy.design.visitor.product;

import com.sqlboy.design.visitor.visitor.Visitor;

import java.util.Random;

/**
 * 抽象指标类
 */
public abstract class ProductMetrics {
    // 产品名称
    private String name;
    // 商品交易总额
    private float GMV;
    // 销量
    private int sales;
    // 日活
    private int DAU;
    // 平均在线时长
    private float averageOnlineTime;

    public ProductMetrics(String name) {
        Random random = new Random();
        this.name = name;
        this.GMV = random.nextFloat() * 10000 + 10000;
        this.sales = random.nextInt(500) + 500;
        this.DAU = random.nextInt(10000) + 10000;
        this.averageOnlineTime = random.nextFloat() * 100 + 100;
    }

    public String getName() {
        return name;
    }

    public float getGMV() {
        return GMV;
    }

    public int getSales() {
        return sales;
    }

    public int getDAU() {
        return DAU;
    }

    public float getAverageOnlineTime() {
        return averageOnlineTime;
    }

    /**
     * 核心方法，接受访问者的访问
     * Ï
     *
     * @param visitor
     */
    public abstract void accept(Visitor visitor);

}
