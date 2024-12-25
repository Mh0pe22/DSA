import java.util.*;

public class FindMinimumDiameterAfterMergingTwoTrees {
    public static void main(String[] args) {

    }

    public static Map<Integer , List<Integer>> buildAdjList(int[][] edges){
        Map<Integer , List<Integer>> adjList = new HashMap<>();

        for(int[] edge: edges){
            adjList.computeIfAbsent(edge[0], k -> new ArrayList<>()).add(edge[1]);
            adjList.computeIfAbsent(edge[1], k -> new ArrayList<>()).add(edge[0]);
        }

        return adjList;
    }
    public static int minimumDiameterAfterMergingTwoTrees(int[][] edge1, int[][] edge2){
        Map<Integer , List<Integer>> adj1 = buildAdjList(edge1);
        Map<Integer , List<Integer>> adj2 = buildAdjList(edge2);

        int d1 = findDiameter(adj1);
        int d2 = findDiameter(adj2);

        int combined = (d1 + 1) / 2 + (d2 + 1) / 2 +1;

        return Math.max(Math.max(d1 , d2) , combined);
    }

    public static int findDiameter(Map<Integer , List<Integer>> adjList){

        List<Integer> farthestNode = BFS(adjList , 0);

        farthestNode = BFS(adjList , farthestNode.get(0));

        return farthestNode.get(1);
    }

    public static List<Integer> BFS(Map<Integer , List<Integer>> adjList , int sourceNode){
        Queue<Integer> que = new LinkedList<>();
        Map<Integer , Boolean> visited = new HashMap<>();

        que.add(sourceNode);
        visited.put(sourceNode , true);

        int maxDistance = 0;
        int farthestNode = sourceNode;

        while(!que.isEmpty()){
            int size = que.size();
            for (int i = 0; i < size; i++) {
                int currentNode = que.poll();

                farthestNode = currentNode;

                for(int neighbor : adjList.getOrDefault(currentNode , new ArrayList<>())){

                    if(!visited.getOrDefault(neighbor , false)){
                        visited.put(neighbor , true);
                        que.add(neighbor);
                    }
                }
            }
            if (!que.isEmpty()){
                maxDistance++;
            }
        }
        return Arrays.asList(farthestNode , maxDistance);
    }


}
