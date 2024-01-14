//https://leetcode.com/problems/convert-an-array-into-a-2d-array-with-conditions/?envType=daily-question&envId=2024-01-02
/* author: turgutahmet
email :turgutahmt@gmail.com
*/

import java.util.*;

public class findMatrix {
    public static List<List<Integer>> create2DArray(int[] nums) {
        //freq array [8]
        int[] freq = new int[nums.length + 1];
        List<List<Integer>> result = new ArrayList<>();

        for (int c : nums) {
            if (freq[c] >= result.size()) {
                result.add(new ArrayList<>());
            }
            result.get(freq[c]).add(c);
            freq[c]++;
        }
        return result;
    }

    public static void main(String[] args) {
        // Example 1
        int[] nums1 = {1, 3, 4, 1, 2, 3, 1};
        List<List<Integer>> output1 = create2DArray(nums1);
        System.out.println(output1);

        // Example 2
        int[] nums2 = {1, 2, 3, 4};
        List<List<Integer>> output2 = create2DArray(nums2);
        System.out.println(output2);
    }
}
