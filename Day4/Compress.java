//https://leetcode.com/problems/string-compression/?envType=study-plan-v2&envId=leetcode-75
public class Compress {
    public static void main(String[] args) {
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};

        int readPtr = 0;
        int writePtr = 0;

        while (readPtr < chars.length) {
            char currentChar = chars[readPtr];
            int count = 1;

            while (readPtr + 1 < chars.length && chars[readPtr + 1] == currentChar) {
                readPtr++;
                count++;
            }

            chars[writePtr] = currentChar;
            writePtr++;

            if (count > 1) {
                String countStr = String.valueOf(count);
                for (char c : countStr.toCharArray()) {
                    chars[writePtr] = c;
                    writePtr++;
                }
            }

            readPtr++;
        }

        System.out.println(writePtr);
    }
}
