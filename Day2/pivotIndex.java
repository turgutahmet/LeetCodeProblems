//https://leetcode.com/problems/find-pivot-index/
public class pivotIndex {
    public static void main(String[] args) {

        int [] nums = {1,7,3,6,5,6};
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            int rightSum = totalSum - leftSum - nums[i];
            if (leftSum == rightSum) {
                System.out.println(i);
            }
            leftSum += nums[i];
        }
        System.out.println(-1);


    }
}
