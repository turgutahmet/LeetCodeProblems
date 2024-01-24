//https://leetcode.com/problems/pseudo-palindromic-paths-in-a-binary-tree/?envType=daily-question&envId=2024-01-24
/*
author: turgutahmet
email : turgutahmt@gmail.com
 */
public class pseudoPalindromicPaths {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        TreeNode node1 = new TreeNode(3);
        TreeNode node2 = new TreeNode(1);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(1);
        TreeNode node5 = new TreeNode(1);
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node2.right = node4;
        node1.right = node5;

        System.out.println(test(root));
    }
    private static int test(TreeNode node) {
       return countPseudoPalindromicPaths(node, 0);
    }
    private static int countPseudoPalindromicPaths(TreeNode node, int count) {
        if (node == null) {
            return 0;
        }
        count ^= 1 << node.val;
        int totalPaths = 0;
        if (node.left == null && node.right == null) {
            if ((count & (count - 1)) == 0) {
                totalPaths = 1;
            }
        } else {
            totalPaths += countPseudoPalindromicPaths(node.left, count);
            totalPaths += countPseudoPalindromicPaths(node.right, count);
        }
        return totalPaths;
    }
}
