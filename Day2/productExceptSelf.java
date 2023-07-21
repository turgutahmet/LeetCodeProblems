//https://leetcode.com/problems/product-of-array-except-self/
public class productExceptSelf {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4};
        int n = nums.length;
        int[] result = new int[n];

        int[] leftProducts = new int[n];
        leftProducts[0] = 1;
        for (int i = 1; i < n; i++) {
            leftProducts[i] = leftProducts[i - 1] * nums[i - 1];
        }

        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] = leftProducts[i] * rightProduct;
            rightProduct *= nums[i];
        }
        for (int i = 0 ; i < nums.length ; i++){
            System.out.println(result[i]);
        }
    }
}
