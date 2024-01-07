//https://leetcode.com/problems/assign-cookies/?envType=daily-question&envId=2024-01-01

import java.util.Arrays;

public class AssignCookies {
    public static void main(String[] args) {
        int[] g = {1,2};
        int[] s = {1,2,3};
        System.out.println(findContentChildren(g,s));

    }

    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int happyChild = 0;
        int childIndex = 0;

        for (int cookieSize : s) {
            if (childIndex < g.length && cookieSize >= g[childIndex]) {
                happyChild++;
                childIndex++;
            }
        }

        return happyChild;
    }
}
