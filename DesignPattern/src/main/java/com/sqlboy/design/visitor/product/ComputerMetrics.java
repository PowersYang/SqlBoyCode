package com.sqlboy.design.visitor.product;

import com.sqlboy.design.visitor.visitor.Visitor;

/**
 * 电脑指标
 */
public class ComputerMetrics extends ProductMetrics {

    public ComputerMetrics(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
