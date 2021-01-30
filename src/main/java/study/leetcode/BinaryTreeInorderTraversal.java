package study.leetcode;

import java.util.*;

public class BinaryTreeInorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        addNodeToList(root, list);
        return list;
    }

    private void addNodeToList(TreeNode root, List<Integer> list) {
        if (root != null) {
            addNodeToList(root.left, list);
            list.add(root.val);
            addNodeToList(root.right, list);
        }
    }

    public List<Integer> inorderTraversalWithStack(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Deque<TreeNode> stack = new LinkedList();
        if (null != root) {
            stack.push(root);
            TreeNode treeNode = root;
            while (treeNode.left != null) {
                stack.push(treeNode.left);
            }
            while (!stack.isEmpty()) {
                TreeNode temp = stack.pop();
                list.add(temp.val);
                if (temp.right != null) {
                    stack.push(temp.right);
                }
            }
        }
        return list;
    }


    public static void main(String[] args) {
        System.out.println(Math.round(250 / 100));

        int[] string = new int[]{1,23,3};
        string.length
    }




}
