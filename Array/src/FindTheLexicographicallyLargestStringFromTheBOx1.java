public class FindTheLexicographicallyLargestStringFromTheBOx1 {
    public static void main(String[] args) {
        String word = "dbca";

        int numFriends = 2;
        System.out.println(answerString(word ,  numFriends));
    }

    public static String answerString(String word , int numFriends){
        /*
        int n = word.length();
        if (numFriends == 1) {
            return word;
        }
        String ans = "";

        int maxString = n - (numFriends - 1);
        for (int i = 0; i < n; i++) {
            int canTake = Math.min(maxString , n - i);
            String sub = word.substring(i , i + canTake);
            if(sub.compareTo(ans) > 0){
                ans = sub;
            }
        }

        return ans;
         */

        int n = word.length();
        if (numFriends == 1) {
            return word;
        }
        int  i = bestStartingPoint(word , n);

        int longestString = n - (numFriends - 1);
        int canTakeLength = Math.min(longestString , n - i);

        return word.substring(i , i + canTakeLength);
    }

    public static int bestStartingPoint(String word , int n){
        int i = 0;
        int j =  1;

        while (j < n){
            int k = 0;

            while (j + k < n && word.charAt(i + k) == word.charAt(j + k)){
                k++;
            }

            if (j + k < n && word.charAt(j + k) > word.charAt(i + k)){
                i = j;
                j++;
            }else {
                j = j + k + 1;
            }
        }

        return i;
    }
}
