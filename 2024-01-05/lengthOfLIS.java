
import java.util.ArrayList;

//https://leetcode.com/problems/longest-increasing-subsequence/?envType=daily-question&envId=2024-01-05
/*
author: turgutahmet
email : turgutahmt@gmail.com
* */
public class lengthOfLIS {
    public static void main(String[] args) {
        int[] nums1 = {10, 9, 2, 5, 3, 7, 101, 18};
        int[] nums2 = {0, 1, 0, 3, 2, 3};
        int[] nums3 = {7, 7, 7, 7, 7, 7, 7};

        System.out.println(lengthOfLISFunction(nums1)); // 4
        System.out.println(lengthOfLISFunction(nums2)); // 4
        System.out.println(lengthOfLISFunction(nums3)); // 1

    }
    public static int lengthOfLISFunction(int [] nums){
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int[] temp = new int[nums.length];
        int maxLength = 1;
        temp[0] = 1;
        
        for (int i = 1; i < nums.length; i++) {
            int maxVal = 0;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    maxVal = Math.max(maxVal, temp[j]);
                }
            }
            temp[i] = maxVal + 1;
            maxLength = Math.max(maxLength, temp[i]);
        }
        return maxLength;

    }
}
