package com.sqlboy.design.visitor.visitor;

import com.sqlboy.design.visitor.product.ComputerMetrics;
import com.sqlboy.design.visitor.product.PhoneMetrics;
import com.sqlboy.design.visitor.product.TelevisionMetrics;

public interface Visitor {

    /**
     * 访问手机类
     *
     * @param phone
     */
    void visit(PhoneMetrics phone);

    /**
     * 访问电视类
     *
     * @param television
     */
    void visit(TelevisionMetrics television);

    /**
     * 访问电脑类
     *
     * @param computer
     */
    void visit(ComputerMetrics computer);
}
