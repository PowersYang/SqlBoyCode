package com.sqlboy.design.composite;

public class OrgComposite extends OrgComponent {

    public OrgComposite(String name) {
        super(name);
    }

    public OrgComposite(String name, int userCount) {
        super(name, userCount);
    }

    @Override
    public void addSubOrg(OrgComponent org) {
        subOrgs.add(org);
    }

    @Override
    public int getSubOrgCount() {
        int count = 0;
        for (OrgComponent subOrg : subOrgs) {
            count += subOrg.subOrgs.size() + 1;
        }

        return count;
    }

    @Override
    public int getSubOrgUserCount() {
        int count = 0;
        for (OrgComponent subOrg : subOrgs) {
            if (subOrg instanceof OrgLeaf) {
                count += subOrg.getUserCount();
            } else {
                count += subOrg.getSubOrgUserCount();
            }
        }

        return count;
    }

    @Override
    public int getUserCount() {
        return userCount + getSubOrgUserCount();
    }
}
