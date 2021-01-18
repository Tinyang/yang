package study.leetcode;

import java.util.*;

/*
Given a binary tree, find its maximum depth.

        The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

        Note: A leaf is a node with no children.

        Example:

        Given binary tree [3,9,20,null,null,15,7],

         3
        / \
       9  20
          /  \
         15   7
        return its depth = 3.*/
public class MaximumDepthOfBinaryTree {
    private boolean isLeaf(TreeNode root) {
        return root.right == null && root.left == null;
    }


    public int maxDepth2(TreeNode root) {
        if (root == null) { return 0; }
        TreeNode node = root.left;
        while (node != null) {
            node = node.left;
        }





        return 1;
    }




    public int maxDepth(TreeNode root) {
        TreeNode node = root;
        Stack<TreeNode> nodeStack = new Stack();
        Stack<Integer> depthStack = new Stack();

        int max = 0;
        int depth = 1;
        while (node != null || nodeStack.capacity() > 0) {
            if (node != null) {
                nodeStack.push(node);
                depthStack.push(depth);
                node = node.left;
                depth++;
            } else {
                node = nodeStack.pop();
                depth = depthStack.pop();

                if (depth > max) max = depth;

                node = node.right;
                depth++;
            }
        }

        return max;
    }

    public int depthFirstSearch(TreeNode root) {
        Stack<TreeNode> nodeStack = new Stack<>();
        Stack<Integer> depthStack = new Stack<>();
        int depth = 0;
        int max = 0;
        TreeNode node = root;
        while (node != null || !nodeStack.isEmpty()) {
            if (node != null) {
                depth++;
                depthStack.push(depth);
                nodeStack.push(node);
                node = node.left;
            } else {
                node = nodeStack.pop();
                depth = depthStack.pop();
                node = node.right;
                if (depth > max) {
                    max = depth;
                }
            }
        }
        return max;
    }


    public int widthFirstSearch(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int depth = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
            depth++;
        }
        return depth;
    }

    public int widthFirstSearch2(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int count = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            count++;
        }
        return count;
    }
}
