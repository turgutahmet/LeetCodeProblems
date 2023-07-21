//https://leetcode.com/problems/reverse-vowels-of-a-string/
class reverseVowels {
    public String reverseVowels(String s) {
        StringBuffer sb = new StringBuffer(s);
        ArrayList <String> vowels = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                sb.setCharAt(i, '*');
                vowels.add(String.valueOf(s.charAt(i)));
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if (sb.charAt(i) == '*') {
                sb.setCharAt(i, vowels.get(vowels.size() - 1).charAt(0));
                vowels.remove(vowels.size() - 1);
            }
        }
        return sb.toString();
    }
    public static Boolean isVowel(char c){
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
        || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
            return true;
        }
        return false;
    }
}
