import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        int numRows = 5;
        System.out.println(generate(numRows));
    }

    public static List<List<Integer>> generate(int numRows){
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>(List.of(1)));
        if(numRows == 1){
            return ans;
        }
        ans.add(new ArrayList<>(List.of(1 ,1)));
        if (numRows == 2){
            return ans;
        }

        for (int i = 2; i < numRows ; i++) {
            List<Integer> current = new ArrayList<>();
            current.add(1);
            for (int j = 0; j < ans.get(i - 1).size() - 1; j++) {
                int ele = ans.get( i - 1).get(j) + ans.get(i - 1).get(j + 1);
                current.add(ele);
            }
            current.add(1);
            ans.add(new ArrayList<>(current));
        }

        return ans;
    }
}
