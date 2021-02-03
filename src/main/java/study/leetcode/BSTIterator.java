package study.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BSTIterator {

    public TreeNode root;

    private int index;

    private List<TreeNode> list;

    public BSTIterator(TreeNode root) {
        this.root = root;
        this.index = 0;
        this.list = inOrderTraverse(root);
    }

    public int next() {
        return list.get(index++).val;
    }

    public boolean hasNext() {
        return index < list.size();
    }


    public List inOrderTraverse(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<TreeNode> list = new ArrayList<>();
        TreeNode pNode = root;
        while (pNode != null || !stack.isEmpty()) {
            if (pNode != null) {
                stack.push(pNode);
                pNode = pNode.left;
            } else {
                TreeNode temp = stack.pop();
                list.add(temp);
                pNode = temp.right;
            }
        }
        return list;
    }



}














