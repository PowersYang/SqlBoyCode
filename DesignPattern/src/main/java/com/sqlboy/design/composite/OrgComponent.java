package com.sqlboy.design.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class OrgComponent {

    // 结点名称
    public String name;
    // 当前结点人数
    public int userCount;

    public List<OrgComponent> subOrgs = new ArrayList<>();

    public OrgComponent(String name) {
        this.name = name;
    }

    public OrgComponent(String name, int userCount) {
        this.name = name;
        this.userCount = userCount;
    }

    /**
     * 添加子结点
     *
     * @param org
     * @throws Exception
     */
    public abstract void addSubOrg(OrgComponent org) throws Exception;

    /**
     * 获取子结点个数
     *
     * @return
     */
    public abstract int getSubOrgCount();

    /**
     * 获取所有子结点人数
     *
     * @return
     */
    public abstract int getSubOrgUserCount();

    /**
     * 获取所有子结点以及当前节点人数
     *
     * @return
     */
    public abstract int getUserCount();
}
