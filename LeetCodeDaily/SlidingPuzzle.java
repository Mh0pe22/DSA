import java.util.*;

public class SlidingPuzzle {
    public static void main(String[] args) {
        int[][] board = {
            {1,2,3},
            {4,0,5}
        };

        System.out.println(slidingPuzzle(board));

    }

    public static int slidingPuzzle(int[][] board) {

        // Construct the start string from the board
        StringBuilder start = new StringBuilder();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                start.append(board[i][j]);
            }
        }

        String target = "123450";

        // Positions representing the adjacency list
        Map<Integer, int[]> mp = new HashMap<>();
        mp.put(0, new int[]{1, 3});
        mp.put(1, new int[]{0, 2, 4});
        mp.put(2, new int[]{1, 5});
        mp.put(3, new int[]{0, 4});
        mp.put(4, new int[]{1, 3, 5});
        mp.put(5, new int[]{2, 4});

        Queue<String> queue = new LinkedList<>();
        queue.offer(start.toString());

        Set<String> visited = new HashSet<>();
        visited.add(start.toString());

        int level = 0; // Tracks the number of moves

        while (!queue.isEmpty()) {
            int n = queue.size();

            // Process all elements at the current level
            for (int i = 0; i < n; i++) {
                String curr = queue.poll();

                // If the target is reached, return the number of moves
                if (curr.equals(target)) {
                    return level;
                }

                int indexOfZero = curr.indexOf('0'); // Find the index of '0'
                for (int swapIdx : mp.get(indexOfZero)) {
                    char[] newStateArray = curr.toCharArray();
                    // Swap the positions
                    char temp = newStateArray[indexOfZero];
                    newStateArray[indexOfZero] = newStateArray[swapIdx];
                    newStateArray[swapIdx] = temp;

                    String newState = new String(newStateArray);

                    // If not visited, add to the queue
                    if (!visited.contains(newState)) {
                        queue.offer(newState);
                        visited.add(newState);
                    }
                }
            }
            level++;
        }

        return -1;
    }
}
