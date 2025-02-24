import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MostProfitablePathInTree {
    public static void main(String[] args) {
        int[][] edges = {
                {0,1},
                {1,2},
                {1,3},
                {3,4}
        };
        int bob = 3;
        int[] amount = {-2,4,2,-4,6};

        System.out.println(mostProfitablePath(edges , bob , amount));
    }

    public static HashMap<Integer , List<Integer>> adj = new HashMap<>();
    public static HashMap<Integer , Integer> bobMap = new HashMap<>();
    private static int aliceIncome = 0;

    public static boolean DFSBob(int curr , int t , boolean[] visited){
        visited[curr] = true;
        bobMap.put(curr , t);

        if(curr == 0){
            return true;
        }

        for(int ngbr : adj.getOrDefault(curr , new ArrayList<>())){
            if(!visited[ngbr]){
                if(DFSBob(ngbr , t + 1 , visited)){
                    return true;
                }
            }
        }
        bobMap.remove(curr);
        return false;
    }

   public static void DFSAlice(int curr , int t, int income , boolean[] visited , int[] amount){
        visited[curr] = true;

        if(!bobMap.containsKey(curr) || t < bobMap.get(curr)){
            income += amount[curr];
        } else if (t == bobMap.get(curr)) {
            income += (amount[curr] / 2);
        }

        if(adj.getOrDefault(curr , new ArrayList<>()).size() == 1 && curr != 0){
            aliceIncome = Math.max(aliceIncome , income);
        }

        for (int ngbr : adj.getOrDefault(curr , new ArrayList<>())){
            if(!visited[ngbr]){
                DFSAlice(ngbr , t + 1 , income , visited , amount);
            }
        }
    }
    public static int mostProfitablePath(int[][] edges, int bob, int[] amount){
        int n = amount.length;
        aliceIncome = Integer.MIN_VALUE;

        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];

            adj.computeIfAbsent(u , k -> new ArrayList<>()).add(v);
            adj.computeIfAbsent(v , k-> new ArrayList<>()).add(u);
        }

        int time = 0;
        boolean[] visited = new boolean[n];
        DFSBob(bob , time , visited);

        int income = 0;
        Arrays.fill(visited , false);
        DFSAlice(0 , 0 , income , visited , amount);

        return aliceIncome;
    }
}
