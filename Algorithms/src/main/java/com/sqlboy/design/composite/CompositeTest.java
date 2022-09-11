package com.sqlboy.design.composite;

public class CompositeTest {
    public static void main(String[] args) throws Exception {
        // 每个学校结点和学院结点都有两个领导
        OrgComponent root = new OrgComposite("XX大学", 2);
        OrgComponent school1 = new OrgComposite("计算机学院", 2);
        OrgComponent school2 = new OrgComposite("理学院", 2);
        OrgComponent school3 = new OrgComposite("外国语学院", 2);

        OrgComponent major1 = new OrgLeaf("专业1", 50);
        OrgComponent major2 = new OrgLeaf("专业2", 30);
        OrgComponent major3 = new OrgLeaf("专业3", 10);
        OrgComponent major4 = new OrgLeaf("专业4", 20);
        OrgComponent major5 = new OrgLeaf("专业5", 30);
        OrgComponent major6 = new OrgLeaf("专业6", 40);

        school1.addSubOrg(major1);
        school1.addSubOrg(major2);
        school2.addSubOrg(major3);
        school2.addSubOrg(major4);
        school3.addSubOrg(major5);
        school3.addSubOrg(major6);

        root.addSubOrg(school1);
        root.addSubOrg(school2);
        root.addSubOrg(school3);

        System.out.println("学校总结点数：" + root.getSubOrgCount());
        System.out.println("学校总人数：" + root.getUserCount());
        System.out.println("学校子结点总人数：" + root.getSubOrgUserCount());

        System.out.println("计算机学院子结点：" + school1.getSubOrgCount());
    }
}


