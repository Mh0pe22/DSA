import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class MaximumCandiesYouCanGetFromBoxes {
    public static void main(String[] args) {
        int[] status = {1 , 0 , 1, 0};
        int[] candies = {7 , 5, 4, 100};
        int[][] keys = {
                {},
                {},
                {1},
                {}
        };
        int[][] containedBoxes = {
                {1 , 2},
                {3},
                {},
                {}
        };
        int[] initialBoxes = {0};
        System.out.println(maxCandies(status , candies , keys , containedBoxes , initialBoxes));
    }

    public static int maxCandies(int[] status , int[] candies , int[][] keys , int[][] containedBoxes , int[] initialBoxes){

        int collectedCandies = 0;
        Set<Integer> visited = new HashSet<>();
        Set<Integer> foundBoxes = new HashSet<>();

        Queue<Integer> que = new LinkedList<>();
        for(int box : initialBoxes){
            foundBoxes.add(box);
            if(status[box] == 1){
                que.add(box);
                visited.add(box);
                collectedCandies += candies[box];
            }
        }

        while(!que.isEmpty()){
            int box = que.poll();

            for(int insideBox : containedBoxes[box]){
                foundBoxes.add(insideBox);
                if(status[insideBox] == 1 && !visited.contains(insideBox)){
                    visited.add(insideBox);
                    que.add(insideBox);
                    collectedCandies += candies[insideBox];
                }
            }

            for(int boxKey : keys[box]){
                status[boxKey] = 1;
                if(foundBoxes.contains(boxKey) && !visited.contains(boxKey)){
                    visited.add(boxKey);
                    que.add(boxKey);
                    collectedCandies += candies[boxKey];
                }
            }
        }

        return collectedCandies;
    }
}
