//https://leetcode.com/problems/house-robber/?envType=daily-question&envId=2024-01-21
/*
author: turgutahmet
email : turgutahmt@gmail.com
 */
public class Rob {
    public static void main(String[] args) {
        int [] nums = {1,2,3,1};
        System.out.println(rob(nums));
        int [] nums2 = {2,7,9,3,1};
        System.out.println(rob(nums2));
    }
    public static int rob(int[] nums){
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }

        return dp[nums.length - 1];
    }
}
