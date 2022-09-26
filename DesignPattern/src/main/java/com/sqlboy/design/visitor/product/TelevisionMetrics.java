package com.sqlboy.design.visitor.product;

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
