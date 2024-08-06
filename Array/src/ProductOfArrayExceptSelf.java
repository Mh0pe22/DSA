import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(product(arr)));
    }

    public static int[] product(int[] arr){

        int prevProduct = 1;
        int[] ans = new int[arr.length];
        int pro = 1;

        for (int i = 0; i < arr.length; i++) {


            for (int j = i + 1; j <arr.length ; j++) {
                if(arr[j] == 0 ){
                    pro = 0;
                    break;
                }

                if (i == 0){
                    pro *= arr[j];
                }else{
                    pro = (pro * arr[j]);
                }
            }
            if(pro == 0) {
                ans[i] = 0;
            }else{

                ans[i] = pro * prevProduct;
            }
            prevProduct *= arr[i];
            pro = 1;
        }

        return ans;
    }
}
