package study.algorithm;

import java.rmi.UnexpectedException;

public class QuickUnionFind {

    private int[] nums;

    public QuickUnionFind(int n) {
        nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = i;
        }
    }
    // the index stands for the element, the element in array stands for the component
    // the p, q is stand for the index
    public void union(int p, int q) throws UnexpectedException {
        if (p >= nums.length || q >= nums.length) {
            throw new UnexpectedException("the num is not in the array");
        }
        int componentP = nums[p];
        int componentQ = nums[q];
        if (componentP != componentQ) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == componentP) {
                    nums[i] = componentQ;
                }
            }
        }
    }

    public boolean isConnected(int p, int q) throws UnexpectedException {
        if (p >= nums.length || q >= nums.length) {
            throw new UnexpectedException("the num is not in the array");
        }
        return nums[p] == nums[q];
    }







    public static void main(String[] args) {

    }



}
