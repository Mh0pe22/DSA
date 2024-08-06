package Array;

public class ReduceNumberToZero {

    public static void main(String[] args) {

//        solution(123 , 0);
        System.out.println(numberOfSteps(123));
    }

    static void solution(int num , int count){

        if(num == 0){
            System.out.println(count);
            return;
        }

        if(num % 2 == 0){
            solution(num / 2 , count + 1);
        }else{
            solution((num - 1) , count+1);
        }
    }

    static int numberOfSteps(int n) {

        int count =0;
        int a = n;
        while(a > 0){

            if(a % 2 == 0){
                a /= 2;
                count++;
            }else{

                a -= 1;
                count++;
            }

        }

        return count;
    }
}
