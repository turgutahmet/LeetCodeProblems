//https://leetcode.com/problems/reverse-words-in-a-string/
public class reverseWords {
    public static void main(String[] args) {

        String s = "  hello world  ";
        String[] str = s.split(" ");
        String res = "";
        for(int i = str.length - 1 ; i >= 0 ; i--){
            if(!str[i].equals("")){
                res += str[i] + " ";
            }
        }
        System.out.println(res.trim());
    }
}
