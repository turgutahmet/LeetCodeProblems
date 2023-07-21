//https://leetcode.com/problems/greatest-common-divisor-of-strings/

public class gcdOfStrings {
    public static void main(String[] args) {
       String str1 = "ABCABC", str2 = "ABC";


       String s = recursive(str1, str2);
        System.out.println(s);

    }
    private static String recursive(String str1, String str2){
        if(str1.equals(str2)) return str1;

        if (str1.length() > str2.length()) {
            String substr = str1.substring(0, str2.length());
            if (substr.equals(str2)) {
                return recursive(str1.substring(str2.length()), str2);
            }
        }else{
            String substr = str2.substring(0, str1.length());
            if (substr.equals(str1)) {
                return recursive(str2.substring(str1.length()), str1);

            }
        }
        return "";
    }

}
