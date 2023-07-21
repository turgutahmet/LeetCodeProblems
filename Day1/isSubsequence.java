//https://leetcode.com/problems/is-subsequence/
public class isSubsequence {
    public static void main(String[] args) {
        String s = "abc", t = "ahbgdc";

        int j = 0;
        for (int i = 0; i < t.length() && j < s.length(); i++) {
            if (s.charAt(j) == t.charAt(i)) {
                j++;
            }
        }
        if (j == s.length()) {
            System.out.println(true);
        }else{
            System.out.println(false);
        }

    }
}
