package com.sqlboy.design.visitor.product;

import com.sqlboy.design.visitor.visitor.Visitor;

/**
 * 手机指标
 */
public class PhoneMetrics extends ProductMetrics {

    public PhoneMetrics(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
