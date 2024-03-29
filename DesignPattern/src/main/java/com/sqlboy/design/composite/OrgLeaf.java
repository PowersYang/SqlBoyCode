package com.sqlboy.design.composite;

public class OrgLeaf extends OrgComponent {

    public OrgLeaf(String name, int userCount) {
        super(name, userCount);
    }

    @Override
    public void addSubOrg(OrgComponent org) throws Exception {
        throw new Exception("叶子结点，无法停添加子结点");
    }

    @Override
    public int getSubOrgCount() {
        return subOrgs.size();
    }

    @Override
    public int getSubOrgUserCount() {
        return 0;
    }

    @Override
    public int getUserCount() {
        return userCount;
    }
}
