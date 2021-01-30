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

    public void inOrderTraversalTree(TreeNode root) {
        if (root.getLeft() != null) {
            inOrderTraversalTree(root.getLeft());
        }
        System.out.print(root.getVal() + "  ");
        if (root.getRight() != null) {
            inOrderTraversalTree(root.getRight());
        }
    }

    public void afterOrderTraversalTree(TreeNode root) {
        if (root.getLeft() != null) {
            afterOrderTraversalTree(root.getLeft());
        }
        if (root.getRight() != null) {
            afterOrderTraversalTree(root.getRight());
        }
        System.out.print(root.getVal() + "  ");
    }

    public void widthFirstTraversalTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            System.out.print(temp.getVal() + "  ");
            if (temp.getLeft() != null) {
                queue.add(temp.getLeft());
            }
            if (temp.getRight() != null) {
                queue.add(temp.getRight());
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

    public TreeNode buildBinaryTreeFromArrayWithNull(Integer[] ints) {
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode root = new TreeNode(ints[0]);
        queue.add(root);
        int index = 1;
        while (!queue.isEmpty() && index < ints.length) {
            TreeNode tempParent =  queue.poll();
            if (ints[index] != null) {
                TreeNode child = new TreeNode(ints[index]);
                tempParent.setLeft(child);
                queue.add(child);
            }
            index ++;
            if (index < ints.length) {
                if (ints[index] != null) {
                    TreeNode child = new TreeNode(ints[index]);
                    tempParent.setRight(child);
                    queue.add(child);
                }
                index ++;
            }
        }
        return root;
    }


    public static void main(String[] args) {
        Integer[] array = {1,2,3,4,5,null,6,null,null,7,8};
        TreeNode root = new TreeTest().buildBinaryTreeFromArrayWithNull(array);
        new TreeTest().preOrderTraversalTree(root);
        System.out.println("");
       /* new TreeTest().preOrderTraversalTreeUsingStack(root);
        System.out.println("");
        new TreeTest().widthFirstTraversalTree(root);*/
        new TreeTest().inOrderTraversalTree(root);
        System.out.println("");
        new TreeTest().afterOrderTraversalTree(root);
        System.out.println("");

    }

}
