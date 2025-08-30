import java.util.ArrayList;
import java.util.List;

public class AllSubSetOfElements {
    public static void main(String[] args) {
        int[] elements = {1, 2, 3};
        List<List<Integer>> result = subSet(elements);
        System.out.println(result);
    }

    public static List<List<Integer>> subSet(int[] elements){
        List<List<Integer>> ans = new ArrayList<>();
        solve(elements, ans, new ArrayList<>(), 0);
        return ans;
    }

    private static void solve(int[] elements, List<List<Integer>> ans, List<Integer> current, int index) {
        if (index == elements.length) {
            ans.add(new ArrayList<>(current));
            return;
        }

        // Choice 1: take the element
        current.add(elements[index]);
        solve(elements, ans, current, index + 1);
        current.removeLast();

        // Choice 2: don't take the element
        solve(elements, ans, current, index + 1);
    }
}
