//https://leetcode.com/problems/climbing-stairs/description/?envType=daily-question&envId=2024-01-18
/*
author: turgutahmet
email : turgutahmt@gmail.com
 */
public class climbStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(2)); // Output: 2
        System.out.println(climbStairs(3)); // Output: 3
    }
    public static int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }

        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }
}
