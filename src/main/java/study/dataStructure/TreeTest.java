package study.dataStructure;

import study.leetcode.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreeTest {

    public void preOrderTraversalTree(TreeNode root) {
        System.out.print(root.getVal() + "  ");
        if (root.getLeft() != null) {
            preOrderTraversalTree(root.getLeft());
        }
        if (root.getRight() != null) {
            preOrderTraversalTree(root.getRight());
        }
    }

    public void preOrderTraversalTreeUsingStack(TreeNode root) {
        Stack<TreeNode> stack = new Stack();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            System.out.print(temp.getVal() + "  ");
            if (temp.getRight() != null) {
                stack.push(temp.getRight());
            }
            if (temp.getLeft() != null) {
                stack.push(temp.getLeft());
            }
        }



    }

    public TreeNode buildBinaryTreeFromArray(int[] ints) {
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode root = new TreeNode(ints[0]);
        queue.add(root);
        int index = 1;
        while (!queue.isEmpty() && index < ints.length) {
            TreeNode tempParent =  queue.poll();
            TreeNode child = new TreeNode(ints[index ++]);
            tempParent.setLeft(child);
            queue.add(child);
            if (index < ints.length) {
                child = new TreeNode(ints[index ++]);
                tempParent.setRight(child);
                queue.add(child);
            }
        }
        return root;
    }


    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        TreeNode root = new TreeTest().buildBinaryTreeFromArray(array);
        new TreeTest().preOrderTraversalTree(root);
        System.out.println("");
        new TreeTest().preOrderTraversalTreeUsingStack(root);

    }

}
