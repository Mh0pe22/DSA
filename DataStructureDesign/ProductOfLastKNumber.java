import java.util.ArrayList;
import java.util.List;

public class ProductOfLastKNumber {
    public static void main(String[] args) {
        ProductOfLastKNumber pl = new ProductOfLastKNumber();
        pl.add(2);
        pl.add(4);
        pl.add(3);
        System.out.println(pl.getProduct(2));
        pl.add(6);
        pl.add(10);
        System.out.println(pl.getProduct(4));
    }

    List<Integer> arr ;
    public ProductOfLastKNumber(){
        arr = new ArrayList<>();
        arr.add(1);
    }

    public void add(int num) {
        if(num == 0){
            arr.clear();
            arr.add(1);
        }else{
            int lastProduct = arr.get(arr.size() - 1);
            arr.add(num * lastProduct);
        }
    }

    public int getProduct(int k) {
        int length = arr.size();
        if(k >= length)
            return 0;

        int product = arr.get(length - 1) / arr.get(length - k - 1);
        return product;
    }
}
