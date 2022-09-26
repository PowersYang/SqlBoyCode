package com.sqlboy.design.visitor;

import com.sqlboy.design.visitor.metrics.ComputerMetrics;
import com.sqlboy.design.visitor.metrics.PhoneMetrics;
import com.sqlboy.design.visitor.metrics.ProductMetrics;
import com.sqlboy.design.visitor.metrics.TelevisionMetrics;
import com.sqlboy.design.visitor.visitor.Visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * 报表类
 */
public class BusinessReport {

    private List<ProductMetrics> metrics = new LinkedList<>();

    public BusinessReport() {
        metrics.add(new PhoneMetrics("手机指标"));
        metrics.add(new TelevisionMetrics("电视指标"));
        metrics.add(new ComputerMetrics("电脑指标"));
    }

    public void show(Visitor visitor) {
        for (ProductMetrics metric : metrics) {
            metric.accept(visitor);
        }
    }
}
