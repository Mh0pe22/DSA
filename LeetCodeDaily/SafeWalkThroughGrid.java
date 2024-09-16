import java.util.*;

public class SafeWalkThroughGrid {
    public static void main(String[] args) {
        List<List<Integer>> grid = new ArrayList<>();

        // Add rows to the grid
//        List<List<Integer>> grid = new ArrayList<>();
//        grid.add(Arrays.asList(1, 1, 1));
//        grid.add(Arrays.asList(1, 0, 0));
//        grid.add(Arrays.asList(0, 1, 1));
//        grid.add(Arrays.asList(0, 1, 1));
//        grid.add(Arrays.asList(1, 1, 1));
        grid.add(Arrays.asList(1, 1, 1, 1));
        System.out.println(findSafeWalk(grid , 4));
    }

    public static boolean findSafeWalk(List<List<Integer>> grid , int health){
        int m = grid.size();
        int n = grid.get(0).size();
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

        // Priority Queue (max-heap) based on remaining health to explore paths with more health first
        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> b[2] - a[2]);
        queue.offer(new int[]{0, 0, health - grid.get(0).get(0)}); // Start from top-left

        int[][] visited = new int[m][n]; // Track maximum health on reaching any cell
        for (int[] row : visited) {
            Arrays.fill(row, -1);  // Initialize with -1 (unvisited)
        }
        visited[0][0] = health - grid.get(0).get(0);

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            int currentHealth = current[2];

            // If we've reached the bottom-right corner with health > 0
            if (x == m - 1 && y == n - 1 && currentHealth > 0) {
                return true;
            }

            // Explore all 4 directions
            for (int[] direction : directions) {
                int newX = x + direction[0];
                int newY = y + direction[1];

                // Stay within bounds
                if (newX >= 0 && newX < m && newY >= 0 && newY < n) {
                    int newHealth = currentHealth - grid.get(newX).get(newY);

                    // If newHealth > 0 and new path is better than the previous one (visited[newX][newY])
                    if (newHealth > 0 && newHealth > visited[newX][newY]) {
                        queue.offer(new int[]{newX, newY, newHealth});
                        visited[newX][newY] = newHealth;  // Update visited to reflect the best health on this cell
                    }
                }
            }
        }
        return false; // No valid path found

    }
}
