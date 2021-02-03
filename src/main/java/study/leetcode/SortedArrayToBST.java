package study.leetcode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SortedArrayToBST {


    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length <= 0) {
            return null;
        }
        TreeNode root = helper(nums, 0, nums.length -1);
        return root;
    }

    private TreeNode helper(int[] nums, int low, int high) {
        if (low > high) {
            return null;
        }
        int mid = (low + high) / 2;
        TreeNode treeNode = new TreeNode(nums[mid]);
        treeNode.left = helper(nums, low, mid-1);
        treeNode.right = helper(nums, mid+1, high);
        return treeNode;
    }

    public static void main(String[] args) {

        Map map  = new HashMap<>();
        Iterator iterator = map.entrySet().iterator();
        iterator.hasNext();


    }


}
