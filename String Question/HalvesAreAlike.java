public class HalvesAreAlike {
    public static void main(String[] args) {
        String s = "Uo";
        System.out.println(halvesAreAlike(s));
    }

    public static boolean halvesAreAlike(String s){
         s = s.toLowerCase();
        int length = s.length();
        String first = s.substring(0 , length / 2);
        String second = s.substring(length / 2 , length);

        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < length / 2; i++) {
            char chFirst = first.charAt(i);
            if(chFirst == 'a' || chFirst == 'i' || chFirst == 'o' || chFirst == 'u' || chFirst == 'e'){
                count1++;
            }
            char chSecond = second.charAt(i);
            if(chSecond == 'a' || chSecond == 'i' || chSecond == 'o' || chSecond == 'u' || chSecond == 'e'){
                count2++;
            }
        }
        return count1 == count2;
    }
}
