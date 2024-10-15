import java.util.HashSet;

public class LetterTilePossibilities {
    public static void main(String[] args) {
        String s = "AAB";
        System.out.println(numTilePossibilities(s));
    }

    public static int numTilePossibilities(String tiles){
        HashSet<String> set = new HashSet<>();
        boolean[] visited = new boolean[tiles.length()];
        dfs(set , visited , tiles , new StringBuilder());

        return set.size() - 1;
    }

    public  static void dfs(HashSet<String> set , boolean[] visited , String tiles , StringBuilder sb){
        set.add(sb.toString());
        for (int i = 0; i < tiles.length(); i++) {
            if(!visited[i]){
                visited[i] = true;
                sb.append(tiles.charAt(i));
                dfs(set , visited , tiles , sb);
                visited[i] = false;
                sb.deleteCharAt(sb.length() - 1);
            }
        }
    }
}
