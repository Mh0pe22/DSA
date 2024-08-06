import java.util.ArrayList;

public class Factors {

    public static void main(String[] args) {

        int n = 20;
        factors3(n);
    }

//    Time complexity is O(N)
    static void factors1(int n){
        for (int i = 1; i<= n ; i++) {
            if(n % i == 0){
                System.out.print(i + " ");
            }
        }
    }

//    Time complexity is O(sqrt(N))
    static void factors2(int n){

        for (int i = 1; i <= Math.sqrt(n) ; i++) {

            if(n % i == 0){
                System.out.print(i + " ");
                System.out.print(n/i + " ");
            }
        }
    }

//    Time complexity and space complexity is O(sqrt(N))
    static void factors3(int n){

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n) ; i++) {

            if(n % i == 0){
                System.out.print(i + " ");
                list.add(n/i);
            }
        }

        for (int i = list.size() - 1; i >=0 ; i--) {

            System.out.print(list.get(i) + " ");
        }
    }


}
