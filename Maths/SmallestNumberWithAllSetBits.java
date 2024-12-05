public class SmallestNumberWithAllSetBits {
    public static void main(String[] args) {

    }

    public static int smallestNumber(int n){

        int temp = n;
        while(true){
            String ans = Integer.toBinaryString(temp);

            boolean a = false;
            for (int i = 0; i < ans.length(); i++) {
                if(ans.charAt(i) == '0'){
                    a = true;
                    break;
                }
            }

            if (!a){
                return temp;
            }else{
                temp++;
            }

        }
    }
}
