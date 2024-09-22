import java.util.*;

public class REportSpamMessage {
    public static void main(String[] args) {
        String[] message = {"l","i","l","i","l"};
        String[] bannedWords = {"d","a","i","v","a"};

        System.out.println(reportSpam(message, bannedWords));
    }

    public static boolean reportSpam(String[] message , String[] bannedWords){
        Set<String> bannedSet = new HashSet<>();
        Collections.addAll(bannedSet, bannedWords);

        int matchCount = 0;
        for (String word : message) {
            if (bannedSet.contains(word)) {
                matchCount++;
                if (matchCount == 2) {
                    return true;
                }
            }
        }

        return false;
    }
}
