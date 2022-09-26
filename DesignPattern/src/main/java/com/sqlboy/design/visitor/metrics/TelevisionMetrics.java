package com.sqlboy.design.visitor.metrics;

import com.sqlboy.design.visitor.visitor.Visitor;

/**
 * 电视指标
 */
public class TelevisionMetrics extends ProductMetrics {

    public TelevisionMetrics(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
