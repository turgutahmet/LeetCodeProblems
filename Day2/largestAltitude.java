//https://leetcode.com/problems/find-the-highest-altitude/
public class largestAltitude {
    public static void main(String[] args) {
        int [] gain = {
                -5,1,5,0,-7
        };
        int [] result = new int[gain.length + 1];
        result[0] = 0;
        for(int i = 0 ; i < gain.length ; i++){
            result[i+1] = result[i] + gain[i];
        }
        int max = 0;
        for(int i = 0 ; i < result.length ; i++){
            if(result[i] > max){
                max = result[i];
            }
        }
        System.out.println(
                max
        );
    }
}
