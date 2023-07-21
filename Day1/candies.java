import java.util.ArrayList;
//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
public class candies {
    public static void main(String[] args) {

        int [] candies = {2,3,5,1,3};
        int extraCandies = 3;

        int max = 0;
        for(int i = 0 ; i < candies.length ; i++){
            if(candies[i] > max){
                max = candies[i];
            }
        }

        ArrayList<Boolean> result = new ArrayList<>(candies.length);
        for(int i = 0 ; i < candies.length ; i++){
            if(candies[i] + extraCandies >= max){
                result.add(true);
            }else{
                result.add(false);
            }
        }

    }
}
