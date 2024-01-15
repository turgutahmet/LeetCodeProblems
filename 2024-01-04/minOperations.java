package Ocak4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/minimum-number-of-operations-to-make-array-empty/?envType=daily-question&envId=2024-01-04
/*
author: turgutahmet
email : turgutahmt@gmail.com
 */
public class minOperations {
    public static void main(String[] args) {
        int[] nums1 = {2, 3, 3, 2, 2, 4, 2, 3, 4};
        int[] nums2 = {2, 1, 2, 2, 3, 3};
        System.out.println(minOperations(nums1)); 
        System.out.println(minOperations(nums2)); 

    }
    public static int minOperations(int[] nums) {
        Map<Integer, Integer> frequency = new HashMap<>();
        for (int num : nums) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }

        int operations = 0;
        for (int count : frequency.values()) {
            if (count == 1) {
                return -1;
            }
            operations += count / 3;
            if (count % 3 != 0) {
                operations++;
            }
        }

        return operations;
    }
}
