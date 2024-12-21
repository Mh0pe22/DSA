import java.util.Arrays;

public class FinalPriceWithSpecialDiscountInAShop {
    public static void main(String[] args) {
        int[] prices = {1,2,3,4,5};
        System.out.println(Arrays.toString(finalPrice(prices)));
    }

    public static int[] finalPrice(int[] prices){

        for (int i = 0; i < prices.length - 1; i++) {

            int j = i + 1;
            if(j < prices.length && prices[i] >= prices[j]){
                prices[i] -= prices[j];
            }else {
                while(j < prices.length && prices[i] < prices[j]){
                    j++;
                }
                if( j < prices.length && prices[i] >= prices[j]){
                    prices[i] -= prices[j];
                }
            }
        }

        return prices;
    }
}
