//https://leetcode.com/problems/can-place-flowers/
public class canPlaceFlowers {
    public static void main(String[] args) {

        int[] flowerbed = {1,0,0,0,1};
        int n = 2;

        int count = 0;
        for(int i = 0 ; i < flowerbed.length ; i++){
            if (i == 0 && flowerbed.length == 1 && flowerbed[i] == 0) {
                count++;
                flowerbed[i] = 1;
                break;
            }
            if(flowerbed[i] == 0){
                if(i == 0){
                    if(flowerbed[i+1] == 0){
                        count++;
                        flowerbed[i] = 1;
                    }
                }else if(i == flowerbed.length - 1){
                    if(flowerbed[i-1] == 0){
                        count++;
                        flowerbed[i] = 1;
                    }
                }else{
                    if(flowerbed[i-1] == 0 && flowerbed[i+1] == 0){
                        count++;
                        flowerbed[i] = 1;
                    }
                }
            }
        }
        if (count == n) {
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
