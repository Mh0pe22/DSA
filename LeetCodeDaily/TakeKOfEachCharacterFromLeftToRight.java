public class TakeKOfEachCharacterFromLeftToRight {
    public static void main(String[] args) {

        String s = "aabaaaacaabc";
        int k = 2;

        System.out.println(takeCharacter(s ,k));
    }

    public static int takeCharacter(String s , int k){

        int count_a = 0;
        int count_b =0 ;
        int count_c = 0;

        for(char i : s.toCharArray()){
            if(i == 'a'){
                count_a++;
            } else if (i == 'b') {
                count_b++;
            }else {
                count_c++;
            }
        }

        if(count_a < k || count_b < k || count_c < k){
            return -1;
        }

        int i = 0;
        int j = 0;
        int notDeletedWindowSize = 0;

        while(j < s.length()){

            if(s.charAt(j) == 'a'){
                count_a--;
            } else if (s.charAt(j) == 'b') {
                count_b--;
            }else{
                count_c--;
            }

            while(i <= j && (count_a < k || count_b < k || count_c < k)){
                if(s.charAt(i) == 'a'){
                    count_a++;
                } else if (s.charAt(i) == 'b') {
                    count_b++;
                }else{
                    count_c++;
                }
                i++;
            }

            notDeletedWindowSize = Math.max(notDeletedWindowSize , j - i + 1);
            j++;
        }

        return s.length() - notDeletedWindowSize;
    }
}
