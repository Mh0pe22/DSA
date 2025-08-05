import java.util.Arrays;

public class FruitsIntoBasket2 {
    public static void main(String[] args) {
        int[] fruits = {4 , 2, 5};
        int[] baskets = {3 , 5 , 4};

        System.out.println(numOfUnplacedFruits(fruits , baskets));
    }

    public static int numOfUnplacedFruits(int[] fruits , int[] baskets){
        int n = fruits.length;

        for (int i = 0; i < fruits.length; i++) {
            for (int j = 0; j < baskets.length; j++) {
                if(fruits[i] <= baskets[j]){
                    n--;
                    baskets[j] = -1;
                    break;
                }
            }
        }

        return n;
    }
}
