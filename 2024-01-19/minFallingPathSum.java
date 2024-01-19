//https://leetcode.com/problems/minimum-falling-path-sum/description/?envType=daily-question&envId=2024-01-19
/*
author: turgutahmet
email : turgutahmt@gmail.com
 */
public class FallingPathSum {
    public static int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        for (int row = n - 2; row >= 0; row--) {
            for (int col = 0; col < n; col++) {
                int best = matrix[row + 1][col];
                if (col > 0) best = Math.min(best, matrix[row + 1][col - 1]);
                if (col + 1 < n) best = Math.min(best, matrix[row + 1][col + 1]);
                matrix[row][col] += best;
            }
        }

        int minPathSum = Integer.MAX_VALUE;
        for (int col = 0; col < n; col++) {
            minPathSum = Math.min(minPathSum, matrix[0][col]);
        }
        return minPathSum;
    }

    public static void main(String[] args) {
        int[][] matrix1 = {{2, 1, 3}, {6, 5, 4}, {7, 8, 9}};
        System.out.println(minFallingPathSum(matrix1)); // Output: 13

        int[][] matrix2 = {{-19, 57}, {-40, -5}};
        System.out.println(minFallingPathSum(matrix2)); // Output: -59
    }
}
