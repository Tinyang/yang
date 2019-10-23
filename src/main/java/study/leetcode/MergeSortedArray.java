package study.leetcode;

import java.util.Arrays;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = 0;
        int j = 0;
        int[] copy = Arrays.copyOf(nums1,nums1.length);
        if(nums1.length == m){
            return;
        }
        for(int i = 0; i < m; i++){
            int temp1 = copy[i];
            if(j == n){
                nums1[index] = temp1;
                index++;
                continue;
            }
            int temp3 = nums2[j];
            if(temp3 < temp1){
                nums1[index] = temp3;
                index++;
                nums1[index] = temp1;
                index++;
                j++;
            }else {
                nums1[index] = temp1;
                index++;
            }
        }
        if(j < n - 1){
            for (int i = index; i < nums1.length ; i++) {
                nums1[i] = nums2[j];
                j++;
            }
        }
    }

    public static void merge2(int[] nums1, int m, int[] nums2, int n) {
        int index = m;
        for (int i = 0; i < n ; i++) {
            nums1[index] = nums2[i];
            index ++;
        }
        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        /*int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;*/
        int[] nums1 = {1,2,4,5,6,0};
        int m = 5;
        int[] nums2 = {3};
        int n = 1;
        merge2(nums1,m,nums2,n);
        System.out.println(Arrays.toString(nums1));
    }
}
