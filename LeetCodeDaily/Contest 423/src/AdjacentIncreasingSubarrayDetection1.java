import java.util.ArrayList;
import java.util.List;

public class AdjacentIncreasingSubarrayDetection1 {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(5);
        a.add(7);
        a.add(8);
        a.add(9);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(3);
        a.add(1);

        int k = 3;
        System.out.println(hasIncreasingSubArrays(a , k));
    }

    public static boolean hasIncreasingSubArrays(List<Integer> nums , int k){

        for (int i = 0; i <= nums.size() - 2 * k; i++) {
            boolean firstIncreasing = true;
            for (int j = i + 1; j < i + k; j++) {
                if (nums.get(j - 1) >= nums.get(j)) {
                    firstIncreasing = false;
                    break;
                }
            }

            if (firstIncreasing) {
                boolean secondIncreasing = true;
                for (int j = i + k + 1; j < i + 2 * k; j++) {
                    if (nums.get(j - 1) >= nums.get(j)) {
                        secondIncreasing = false;
                        break;
                    }
                }

                if (secondIncreasing) {
                    return true;
                }
            }
        }

        return false;
    }
}
