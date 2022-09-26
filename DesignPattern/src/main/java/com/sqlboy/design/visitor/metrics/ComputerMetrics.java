package com.sqlboy.design.visitor.metrics;

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
