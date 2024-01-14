//https://leetcode.com/problems/number-of-laser-beams-in-a-bank/description/?envType=daily-question&envId=2024-01-03
/* author: turgutahmet
email :turgutahmt@gmail.com
*/

public class NumberOfBeams {
    public static void main(String[] args) {
        String [] bank = {"011001","000000","010100","001000"};
        System.out.println(numberOfBeams(bank));

    }
    public static int numberOfBeams(String[] bank){
        int rowNumber = bank.length;
        int rowBeamCount[] = new int[rowNumber];
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < bank[0].length(); j++) {
                if (bank[i].charAt(j) == '1') {
                    rowBeamCount[i]++;
                }
            }
        }
        int result = 0;
        int prev = 0;
        for (int i = 0; i < rowNumber; i++) {
            if (rowBeamCount[i] > 0) {
                result += prev * rowBeamCount[i];
                prev = rowBeamCount[i];
            }
        }
        return result;
    }
}
