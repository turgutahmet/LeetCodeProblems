import java.util.ArrayList;

//https://leetcode.com/problems/maximum-length-of-a-concatenated-string-with-unique-characters/description/?envType=daily-question&envId=2024-01-23
/*
author: turgutahmet
email : turgutahmt@gmail.com
 */
import java.util.List;

public class maxLength {
    public int maxLength2(List<String> arr) {
        return backtrack(arr, 0, "");
    }

    private int backtrack(List<String> arr, int index, String current) {
        int maxLen = current.length();
        for (int i = index; i < arr.size(); i++) {
            if (isUnique(current, arr.get(i))) {
                maxLen = Math.max(maxLen, backtrack(arr, i + 1, current + arr.get(i)));
            }
        }
        return maxLen;
    }

    private boolean isUnique(String current, String add) {
        int[] count = new int[26];
        for (char c : (current + add).toCharArray()) {
            if (count[c - 'a']++ > 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        maxLength solution = new maxLength();
        System.out.println(solution.maxLength2(List.of("un", "iq", "ue"))); // Output: 4
        System.out.println(solution.maxLength2(List.of("cha", "r", "act", "ers"))); // Output: 6
        System.out.println(solution.maxLength2(List.of("abcdefghijklmnopqrstuvwxyz"))); // Output: 26
    }
}
