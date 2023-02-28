package com.sqlboy.tree;

/**
 * Title
 *
 * <p>
 *
 * @author will.yang 2023/2/20
 */
class TreeNode {
    public int data;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int data) {
        super();
        this.data = data;
    }

    @Override
    public String toString() {
        return data + " ";
    }
}