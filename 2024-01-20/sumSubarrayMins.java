//https://leetcode.com/problems/sum-of-subarray-minimums/description/?envType=daily-question&envId=2024-01-20
/*
author: turgutahmet
email : turgutahmt@gmail.com
 */
import java.util.Stack;
public class sumSubarrayMins {
    public static void main(String[] args) {
        System.out.println(sumArr(new int[]{3, 1, 2, 4})); // Output: 17
        System.out.println(sumArr(new int[]{11, 81, 94, 43, 3})); // Output: 444

    }
    public static int sumArr(int[] arr) {
        final int MOD = 1000000007;
        int n = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];
        Stack<Integer> stack = new Stack<>();

        // Sol tarafta önceki daha küçük elemanları bul
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                stack.pop();
            }
            left[i] = stack.isEmpty() ? i + 1 : i - stack.peek();
            stack.push(i);
        }

        // Stack'i temizle
        stack.clear();

        // Sağ tarafta sonraki daha küçük elemanları bul
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            right[i] = stack.isEmpty() ? n - i : stack.peek() - i;
            stack.push(i);
        }

        long result = 0;
        for (int i = 0; i < n; i++) {
            result = (result + (long) arr[i] * left[i] * right[i]) % MOD;
        }

        return (int) result;
    }
}
