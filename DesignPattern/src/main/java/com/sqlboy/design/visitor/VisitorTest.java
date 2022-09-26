package com.sqlboy.design.visitor;

import com.sqlboy.design.visitor.visitor.BossVisitor;
import com.sqlboy.design.visitor.visitor.LauncherTeamVisitor;

public class VisitorTest {
    public static void main(String[] args) {
        BusinessReport report = new BusinessReport();

        System.out.println("---------- Boss视角报表 ----------");
        report.show(new BossVisitor());

        System.out.println("---------- 运营团队视角报表 ----------");
        report.show(new LauncherTeamVisitor());
    }
}
