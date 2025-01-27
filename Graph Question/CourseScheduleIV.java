import java.util.*;

public class CourseScheduleIV {
    public static void main(String[] args) {
        int numCourses = 3;
        int[][] prerequisites = {
                {1,2},
                {1,0},
                {2,0}
        };
        int[][] queries = {
                {1,0},
                {1,2}
        };

        System.out.println(checkIfPrerequisite(numCourses , prerequisites , queries));
    }

    public static List<Boolean> checkIfPrerequisite(int numCourses , int[][] prerequisites , int[][] queries){
        Map<Integer , List<Integer>> adj =  new HashMap<>();
        int[] inDegree = new int[numCourses];
        for (int[] edge : prerequisites) {
            int u = edge[0];
            int v = edge[1];
            adj.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
            inDegree[v]++;
        }

        Queue<Integer> que = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if(inDegree[i] == 0){
                que.offer(i);
            }
        }


        Map<Integer , Set<Integer>> prereqMap = new HashMap<>();
        while(!que.isEmpty()){
            int node = que.poll();

            for(int neighbour : adj.getOrDefault(node , new ArrayList<>())){
                prereqMap.computeIfAbsent(neighbour , k -> new HashSet<>()).add(node);
                prereqMap.get(neighbour).addAll(prereqMap.getOrDefault(node , new HashSet<>()));

                inDegree[neighbour]--;
                if(inDegree[neighbour] == 0){
                    que.offer(neighbour);
                }
            }
        }

        List<Boolean> ans = new ArrayList<>();
        for(int[] query : queries){
            int src = query[0];
            int des = query[1];
            ans.add(prereqMap.getOrDefault(des , new HashSet<>()).contains(src));
        }

        return ans;
    }
}
