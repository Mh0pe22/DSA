import java.util.*;
import java.util.stream.Collectors;

// baki chhe pharithi karva no
public class GridWithMaxScore {
    public static void main(String[] args) {
        List<List<Integer>> grid = new ArrayList<>();
        grid.add(new ArrayList<>(List.of(8,7,6)));
        grid.add(new ArrayList<>(List.of(8,3,2)));
//        grid.add(new ArrayList<>(List.of(1, 1, 1)));

        System.out.println(maxScore(grid));
    }

    public static int maxScore(List<List<Integer>> grid){
        List<Integer> sortedList = grid.stream()
                .flatMap(List::stream)
                .sorted()
                .toList();

        int length = 0;
        for (int i = 0; i < 1; i++) {
            List<Integer> innerList = grid.get(i);
            length = innerList.size();
        }
        int ans = sortedList.get(length - 1);
        int count = 0;
        for (int i = grid.size() - 2; i >= 0 ; i--){

            if(count != length) {
                if (!Objects.equals(sortedList.get(i), sortedList.get(i + 1))) {
                    ans += sortedList.get(i);
                    count++;
                }
            }

        }

        return ans;
    }
}
