package com.sqlboy.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 二叉树
 *
 * <p>
 *
 * @author will.yang 2023/2/20
 */
public class BinaryTree {

    public TreeNode root;

    public BinaryTree(int[] array) {
        root = createBinaryTree(array, 0);
    }

    /**
     * 创建二叉树
     *
     * @param array
     * @param index
     * @return
     */
    private TreeNode createBinaryTree(int[] array, int index) {
        TreeNode treeNode = null;
        if (index < array.length) {
            treeNode = new TreeNode(array[index]);
            // 对于顺序存储的完全二叉树，如果某个节点的索引为index，
            // 其对应的左子树的索引为2 * index + 1，右子树为 2 * index + 2
            treeNode.left = createBinaryTree(array, 2 * index + 1);
            treeNode.right = createBinaryTree(array, 2 * index + 2);
        }
        return treeNode;
    }

    /**
     * 递归前序遍历
     *
     * @param node
     */
    public void preOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node);
        preOrder(node.left);
        preOrder(node.right);
    }

    /**
     * 递归中序遍历
     */
    public void inOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node);
        inOrder(node.right);
    }

    /**
     * 递归后序遍历
     *
     * @param node
     */
    public void postOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node);
    }

    /**
     * 非递归前序遍历
     *
     * @param node
     */
    public void noRecursionPreOrder(TreeNode node) {
        if (node != null) {
            Stack<TreeNode> stack = new Stack<TreeNode>();
            stack.add(node);
            while (!stack.isEmpty()) {
                node = stack.pop();
                System.out.print(node);
                if (node.right != null) {
                    stack.push(node.right);
                }
                if (node.left != null) {
                    stack.push(node.left);
                }
            }
        }
    }

    /**
     * 非递归中序遍历
     *
     * @param node
     */
    public void noRecursionInOrder(TreeNode node) {
        if (node != null) {
            Stack<TreeNode> stack = new Stack<>();
            while (!stack.isEmpty() || node != null) {
                if (node != null) {
                    stack.push(node);
                    node = node.left;
                } else {
                    node = stack.pop();
                    System.out.print(node);
                    node = node.right;
                }
            }
        }
    }

    /**
     * 非递归后续遍历
     *
     * @param node
     */
    public void noRecursionPostOrder(TreeNode node) {
        if (node != null) {
            Stack<TreeNode> s1 = new Stack<>();
            Stack<TreeNode> s2 = new Stack<>();
            s1.push(node);
            while (!s1.isEmpty()) {
                node = s1.pop(); // 头 右 左
                s2.push(node);
                if (node.left != null) {
                    s1.push(node.left);
                }
                if (node.right != null) {
                    s1.push(node.right);
                }
            }
            // 左 右 头
            while (!s2.isEmpty()) {
                System.out.print(s2.pop());
            }
        }
    }

    /**
     * 层序遍历
     *
     * @param node
     */
    public static void level(TreeNode node) {
        if (node == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            System.out.println(cur);
            if (cur.left != null) {
                queue.add(cur.left);
            }
            if (cur.right != null) {
                queue.add(cur.right);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        BinaryTree bt = new BinaryTree(arr);
        System.out.println("递归前序遍历：");
        bt.preOrder(bt.root);
        System.out.println();
        System.out.println("递归中序遍历：");
        bt.inOrder(bt.root);
        System.out.println();
        System.out.println("递归后序遍历：");
        bt.postOrder(bt.root);
        System.out.println();
        System.out.println("非递归前序遍历：");
        bt.noRecursionPreOrder(bt.root);
        System.out.println();
        System.out.println("非递归中序遍历：");
        bt.noRecursionInOrder(bt.root);
        System.out.println();
        System.out.println("非递归后序遍历：");
        bt.noRecursionPostOrder(bt.root);
    }
}