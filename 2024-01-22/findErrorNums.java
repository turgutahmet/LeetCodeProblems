import java.util.Arrays;

//https://leetcode.com/problems/set-mismatch/description/?envType=daily-question&envId=2024-01-22
/*
author: turgutahmet
email : turgutahmt@gmail.com
 */
public class findErrorNums {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findErrorNums2(new int[]{1, 2, 2, 4})));
    }
    public static int[] findErrorNums2(int[] nums) {
        int n = nums.length;
        int actualSum = n * (n + 1) / 2;
        int sumNums = 0;
        int sumSetNums = 0;
        boolean[] seen = new boolean[n + 1];

        for (int num : nums) {
            sumNums += num;
            if (!seen[num]) {
                sumSetNums += num;
                seen[num] = true;
            }
        }

        int duplicate = sumNums - sumSetNums;
        int missing = actualSum - sumSetNums;
        return new int[]{duplicate, missing};
    }
}
