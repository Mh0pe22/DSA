import java.util.HashSet;
import java.util.Set;

public class MinimumNumberOfPeopleTeach {
    public static void main(String[] args) {
        int n = 2;
        int[][] languages = {
                {1},
                {2},
                {1 , 2}
        };

        int[][] friendships = {
                {1 , 2},
                {2 , 3},
                {1 , 3}
        };

        System.out.println(minimumTeachings(n, languages , friendships));
    }

    public static int minimumTeachings(int n, int[][] languages , int[][] friendships){
        Set<Integer> sadUsers = new HashSet<>();

        for(int[] friend : friendships){
            int u = friend[0] - 1;
            int v = friend[1] - 1;

            Set<Integer> langSet = new HashSet<>();
            for(int lang : languages[u]){
                langSet.add(lang);
            }

            boolean canTalk = false;
            for(int lang : languages[v]){
                if(langSet.contains(lang)){
                    canTalk = true;
                    break;
                }
            }

            if(!canTalk){
                sadUsers.add(u);
                sadUsers.add(v);
            }
        }

        int[] language = new int[n + 1];
        int mostKnowLang = 0;

        for(int user : sadUsers){
            for(int lang : languages[user]){
                language[lang]++;
                mostKnowLang = Math.max(mostKnowLang , language[lang]);
            }
        }

        return sadUsers.size() - mostKnowLang;
    }
}
