//https://leetcode.com/problems/longest-common-subsequence/?envType=daily-question&envId=2024-01-25
/*
author: turgutahmet
email : turgutahmt@gmail.com
 */
public class LongestCommonSubsequence {
    public static int longestCommonSubsequence(String text1, String text2) {
        int len1 = text1.length();
        int len2 = text2.length();
        int[][] dp = new int[len1 + 1][len2 + 1];

        for (int i = 1; i <= len1; i++) {
            for (int ii = 1; ii <= len2; ii++) {
                if (text1.charAt(i - 1) == text2.charAt(ii - 1)) {
                    dp[i][ii] = dp[i - 1][ii - 1] + 1;
                } else {
                    dp[i][ii] = Math.max(dp[i - 1][ii], dp[i][ii - 1]);
                }
            }
        }
        return dp[len1][len2];
    }

    public static void main(String[] args) {
        System.out.println(longestCommonSubsequence("abcde", "ace")); //3
        System.out.println(longestCommonSubsequence("abc", "abc")); //3
        System.out.println(longestCommonSubsequence("abc", "def")); //0
    }
}

