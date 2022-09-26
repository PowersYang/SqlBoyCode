package com.sqlboy.design.visitor.visitor;

import com.sqlboy.design.visitor.product.ComputerMetrics;
import com.sqlboy.design.visitor.product.PhoneMetrics;
import com.sqlboy.design.visitor.product.TelevisionMetrics;

/**
 * 老板视角可以访问所有指标
 */
public class BossVisitor implements Visitor {
    @Override
    public void visit(PhoneMetrics phone) {
        System.out.println("PhoneMetrics{" + "name='" + phone.getName() + '\'' + ", GMV=" + phone.getGMV() + ", sales=" + phone.getSales() + ", DAU=" + phone.getDAU() + ", averageOnlineTime=" + phone.getAverageOnlineTime() + '}');
    }

    @Override
    public void visit(TelevisionMetrics television) {
        System.out.println("TelevisionMetrics{" + "name='" + television.getName() + '\'' + ", GMV=" + television.getGMV() + ", sales=" + television.getSales() + ", DAU=" + television.getDAU() + ", averageOnlineTime=" + television.getAverageOnlineTime() + '}');
    }

    @Override
    public void visit(ComputerMetrics computer) {
        System.out.println("ComputerMetrics{" + "name='" + computer.getName() + '\'' + ", GMV=" + computer.getGMV() + ", sales=" + computer.getSales() + ", DAU=" + computer.getDAU() + ", averageOnlineTime=" + computer.getAverageOnlineTime() + '}');
    }
}
