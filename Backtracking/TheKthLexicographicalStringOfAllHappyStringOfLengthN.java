public class TheKthLexicographicalStringOfAllHappyStringOfLengthN {
    public static void main(String[] args) {
        int n = 1;
        int k =3;
        System.out.println(getHappyString(n , k));
    }

    public static String getHappyString(int n , int k){
        String[] result ={""};
        int[] count = {0};
        StringBuilder current = new StringBuilder();

        solve(current , result , count , k , n);

        return result[0];
    }

    public static void solve(StringBuilder current, String[] result , int[] count , int k , int n){
        if(current.length() == n){
            count[0]++;
            if(count[0] == k){
                result[0] = current.toString();
            }
            return;
        }

        for(char ch = 'a'; ch<='c' ;ch++){
            if(!current.isEmpty() && current.charAt(current.length() - 1) == ch){
               return;
            }

            current.append(ch);

            solve(current , result , count , k , n);
            if(!result[0].isEmpty())
                continue;

            current.deleteCharAt(current.length() - 1);
        }
    }

}
