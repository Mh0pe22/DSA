public class SumOfKMirrorNumbers {
    public static void main(String[] args) {
        int k = 2;
        int  n = 5;
        System.out.println(KMirror(k , n));
    }

    public static boolean isPalindrome(String s){
        int left = 0;
        int right = s.length() - 1;

        while (left <= right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static String convertToBase(long num , int k){
        if (num == 0){
            return "0";
        }

        StringBuilder res  = new StringBuilder();
        while (num > 0){
            res.append(num % k);
            num /= k;
        }

        return res.toString();
    }

    public static long KMirror(int k , int n){
        long sum = 0;
        int length = 1; // L length of palindrome

        while(n > 0){
            int half_length = (length + 1) / 2;
            long min_num = (long)Math.pow(10 , half_length - 1);
            long max_num = (long)Math.pow(10 , half_length) - 1;

            for (int num = (int)min_num; num <= max_num ; num++) {
                String first_half = Integer.toString(num);
                String second_half = new StringBuilder(first_half).reverse().toString();

                String fullPalindrome;
                if(length % 2 == 0){
                    fullPalindrome = first_half + second_half;
                }else {
                    fullPalindrome = first_half + second_half.substring(1);
                }

                long palNum = Long.parseLong(fullPalindrome);
                String baseK = convertToBase(palNum , k);

                if(isPalindrome(baseK)){
                    sum += palNum;
                    n--;

                    if (n == 0) {
                        return sum;
                    }
                }
            }
            length++;
        }

        return sum;
    }
}
