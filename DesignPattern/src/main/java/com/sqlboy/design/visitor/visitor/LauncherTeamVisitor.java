package com.sqlboy.design.visitor.visitor;

import com.sqlboy.design.visitor.product.ComputerMetrics;
import com.sqlboy.design.visitor.product.PhoneMetrics;
import com.sqlboy.design.visitor.product.TelevisionMetrics;

/**
 * 内容运营团队视角，只能访问日活和活跃时长两个指标
 */
public class LauncherTeamVisitor implements Visitor {
    @Override
    public void visit(PhoneMetrics phone) {
        System.out.println("PhoneMetrics{" + "name='" + phone.getName() + '\'' + ", DAU=" + phone.getDAU() + ", averageOnlineTime=" + phone.getAverageOnlineTime() + '}');
    }

    @Override
    public void visit(TelevisionMetrics television) {
        System.out.println("TelevisionMetrics{" + "name='" + television.getName() + '\'' + ", DAU=" + television.getDAU() + ", averageOnlineTime=" + television.getAverageOnlineTime() + '}');
    }

    @Override
    public void visit(ComputerMetrics computer) {
        System.out.println("ComputerMetrics{" + "name='" + computer.getName() + '\'' + ", DAU=" + computer.getDAU() + ", averageOnlineTime=" + computer.getAverageOnlineTime() + '}');
    }
}
