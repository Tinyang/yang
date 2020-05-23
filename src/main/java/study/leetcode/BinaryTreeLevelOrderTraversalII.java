package study.leetcode;

import java.util.*;

/*Given a binary tree, return the bottom-up level order traversal of its nodes' values.
(ie, from left to right, level by level from leaf to root).

    For example:
    Given binary tree [3,9,20,null,null,15,7],
     3
    / \
   9  20
     /   \
    15    7
    return its bottom-up level order traversal as:
    [
    [15,7],
    [9,20],
    [3]
    ]*/
public class BinaryTreeLevelOrderTraversalII {
    //BFS solution
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new LinkedList<>();
        if(root == null) {
            return list;
        }
        List<Integer> temp = new LinkedList<>();
        temp.add(root.val);
        list.add(temp);

        Queue<TreeNode> queue = new LinkedList();
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            temp = new ArrayList<>();
            while (size-- > 0) {
                TreeNode headNode = queue.poll();
                TreeNode leftNode = headNode.left;
                if(leftNode != null) {
                    queue.add(leftNode);
                    temp.add(leftNode.val);
                }
                TreeNode rightNode = headNode.right;
                if(rightNode != null) {
                    queue.add(rightNode);
                    temp.add(rightNode.val);
                }
            }
            if (temp.size() > 0) {
                list.add(0,temp);
            }
        }
        return list;
    }

    //DFS solution
    public List<List<Integer>> levelOrderBottom1(TreeNode root) {
        List<List<Integer>> wrapList = new LinkedList<List<Integer>>();
        levelMaker(wrapList, root, 0);
        return wrapList;
    }

    public void levelMaker(List<List<Integer>> list, TreeNode root, int level) {
        if(root == null) return;
        if( level >= list.size()) {
            list.add(0, new LinkedList<Integer>());
        }
        levelMaker(list, root.left, level+1);
        levelMaker(list, root.right, level+1);
        list.get(list.size()-level-1).add(root.val);
    }
}
