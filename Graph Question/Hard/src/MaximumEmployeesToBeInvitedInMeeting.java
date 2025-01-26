import java.util.*;

public class MaximumEmployeesToBeInvitedInMeeting {
    public static void main(String[] args) {
        int[] favourite = {2,2,1,2};
        System.out.println(maximumInvitations(favourite));
    }

    public static int maximumInvitations(int[] favourite){
        int n  = favourite.length;
        Map<Integer , List<Integer>> adj = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int u = i;
            int v = favourite[i];
            adj.computeIfAbsent(v , k -> new ArrayList<>()).add(u);
        }

        int longestCycleEmpCount = 0;
        int happyCoupleEmpCount = 0;

        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if(!visited[i]){
                Map<Integer , Integer> mp = new HashMap<>();
                int currNode = i;
                int currNodeCount = 0;

                while(!visited[currNode]){ // Until cycle is not detected
                    visited[currNode] = true;
                    mp.put(currNode , currNodeCount);

                    int nextNode = favourite[currNode];
                    currNodeCount++;

                    if(mp.containsKey(nextNode)){
                        int cycleLength = currNodeCount - mp.get(nextNode);
                        longestCycleEmpCount = Math.max(longestCycleEmpCount , cycleLength);

                        if(cycleLength == 2){ // Happy couple case
                            boolean[] visitedNodes = new boolean[n];
                            visitedNodes[currNode] = true;
                            visitedNodes[nextNode] = true;

                            happyCoupleEmpCount += 2 + BFS(currNode , adj , visitedNodes) + BFS(nextNode , adj , visitedNodes);
                        }
                        break;
                    }
                    currNode = nextNode;
                }
            }
        }
        return Math.max(happyCoupleEmpCount , longestCycleEmpCount);
    }

    public static int BFS(int start , Map<Integer ,List<Integer>> adj, boolean[] visited){
        Queue<int[]> queue =  new LinkedList<>();// {node, path length}
        queue.add(new int[]{start , 0});
        int maxDistance = 0;

        while(!queue.isEmpty()){
            int[] current = queue.poll();
            int currNode = current[0];
            int dist = current[1];

            for(int neighbour : adj.getOrDefault(currNode , new ArrayList<>())){
                if(!visited[neighbour]){
                    visited[neighbour] = true;
                    queue.add(new int[]{neighbour , dist + 1});
                    maxDistance = Math.max(maxDistance , dist + 1);
                }
            }
        }

        return maxDistance;
    }
}
