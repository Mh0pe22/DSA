public class SetBit {

    public static void main(String[] args) {

        int number  = 123456789;
//        int count= 0;
//
//        while(number > 0){
//            if((number & 1) == 1){
//                count++;
//            }
//            number = number >>1;
//        }
        System.out.println(Integer.toBinaryString(number));
        System.out.println(setBit(number));
    }

    static int setBit(int n){

        int count = 0;

        while(n > 0){
//            count++;
//            n -= (n & -n);

            count++;
            n = n & (n-1);
        }
        return count;
    }
}
