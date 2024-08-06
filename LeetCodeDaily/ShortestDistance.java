import java.util.*;

public class ShortestDistance {
        public int[] shortestPath(int n, int[][] queries) {
            // Initialize the adjacency list with initial roads
            List<Integer>[] adjList = new ArrayList[n];
            for (int i = 0; i < n; i++) {
                adjList[i] = new ArrayList<>();
                if (i < n - 1) {
                    adjList[i].add(i + 1);
                }
            }

            int[] result = new int[queries.length];

            // Process each query
            for (int i = 0; i < queries.length; i++) {
                int ui = queries[i][0];
                int vi = queries[i][1];
                adjList[ui].add(vi);

                // Perform BFS to find the shortest path from 0 to n-1
                result[i] = bfsShortestPath(adjList, n);
            }

            return result;
        }


        private int bfsShortestPath(List<Integer>[] adjList, int n) {
            int[] dist = new int[n];
            Arrays.fill(dist, Integer.MAX_VALUE);
            dist[0] = 0;

            Queue<Integer> queue = new LinkedList<>();
            queue.offer(0);

            while (!queue.isEmpty()) {
                int curr = queue.poll();
                for (int neighbor : adjList[curr]) {
                    if (dist[curr] + 1 < dist[neighbor]) {
                        dist[neighbor] = dist[curr] + 1;
                        queue.offer(neighbor);
                    }
                }
            }

            return dist[n - 1];
        }
}
