//https://leetcode.com/problems/container-with-most-water/
public class maxArea {
    public static void main(String[] args) {

        int [] height = {1,8,6,2,5,4,8,3,7};
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int area = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, area);

            // Move the pointer with the smaller height towards the center
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println(maxArea);
    }
}
