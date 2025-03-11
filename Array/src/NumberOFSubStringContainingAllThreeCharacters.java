public class NumberOFSubStringContainingAllThreeCharacters {
    public static void main(String[] args) {
        String s = "abcabc";
        System.out.println(numberOfSubstrings(s));
    }

    public static int numberOfSubstrings(String s){

        int n = s.length();
        int count = 0;
        int[] mp = new int[3]; // 0- a , 1 - b , 2 - c
        int j = 0;
        int i = 0;

        while(j < n){
            char ch = s.charAt(j);
            mp[ch - 'a']++;

            while(mp[0] > 0 && mp[1] > 0 && mp[2] > 0){
                count += n- j;
                mp[s.charAt(i) - 'a']--;
                i++;
            }
            j++;
        }
        return count;
    }
}
