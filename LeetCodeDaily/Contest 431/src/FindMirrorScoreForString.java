import java.util.*;

public class FindMirrorScoreForString {
    public static void main(String[] args) {
        String s ="azapfwonwwcdagew";
        System.out.println(calculateScore(s));
    }

//    public static long calculateScore(String s){
//
//        long product = 0;
//        Set<Integer> set = new HashSet<>();
//        for(int i = 0; i < s.length(); i++){
//
//            char ch = s.charAt(i);
//            int diff = ch - 'a';
//            char chMirror = (char) ('z' - diff);
//            if(i > 0) {
//                for (int j = i; j >= 0; j--) {
//                    if(s.charAt(j) == chMirror && !set.contains(j) && !set.contains(i)){
//                        set.add(j);
//                        set.add(i);
//                        product += (i - j);
//                        break;
//                    }
//                }
//            }
//        }
//
//        return product;
//    }

    public static long calculateScore(String s) {
        long score = 0;
        Map<Character, List<Integer>> lastSeen = new HashMap<>();
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            char mirrorCh = getMirrorCharacter(ch);

            if (lastSeen.containsKey(mirrorCh)) {
                List<Integer> indices = lastSeen.get(mirrorCh);
                for (int j = indices.size() - 1; j >= 0; j--) {
                    int index = indices.get(j);

                    if(!set.contains(index)) {
                        score += (i - index);

                        set.add(i);
                        set.add(index);
                        break;
                    }

                }
            }

            lastSeen.putIfAbsent(ch, new ArrayList<>());
            lastSeen.get(ch).add(i);
        }

        return score;
    }
    private static char getMirrorCharacter(char ch) {
        return (char) ('z' - (ch - 'a'));
    }

}
