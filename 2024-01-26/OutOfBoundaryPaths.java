//https://leetcode.com/problems/out-of-boundary-paths/solutions/?envType=daily-question&envId=2024-01-26
/*
author: turgutahmet
email : turgutahmt@gmail.com
 */
public class OutOfBoundaryPaths {
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        final int MOD = 1000000007;
        int[][][] dp = new int[maxMove + 1][m][n];

        int[] directions = new int[]{-1, 0, 1, 0, -1}; // üst, sağ, alt, sol

        for (int move = 1; move <= maxMove; move++) {
            for (int row = 0; row < m; row++) {
                for (int col = 0; col < n; col++) {
                    for (int d = 0; d < 4; d++) {
                        int newRow = row + directions[d];
                        int newCol = col + directions[d + 1];
                        if (newRow < 0 || newRow >= m || newCol < 0 || newCol >= n) {
                            dp[move][row][col] += 1;
                        } else {
                            dp[move][row][col] = (dp[move][row][col] + dp[move - 1][newRow][newCol]) % MOD;
                        }
                    }
                }
            }
        }
        return dp[maxMove][startRow][startColumn];
    }

    public static void main(String[] args) {
        System.out.println(new OutOfBoundaryPaths().findPaths(2, 2, 2, 0, 0));
        System.out.println(new OutOfBoundaryPaths().findPaths(1, 3, 3, 0, 1));
    }
}
