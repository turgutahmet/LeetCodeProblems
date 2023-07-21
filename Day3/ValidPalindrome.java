//https://leetcode.com/problems/valid-palindrome/
public class ValidPalindrome {
    public static void main(String[] args) {

        String s = "race a car";
        String output = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println(output);
        int last_index = output.length() - 1;
        boolean isPalindrome = true;
        for (int i= 0; i < output.length(); i++){
            if (output.charAt(i) != output.charAt(last_index)){
                isPalindrome = false;
                break;
            }
            last_index--;
        }
        System.out.println(isPalindrome);
    }
}
