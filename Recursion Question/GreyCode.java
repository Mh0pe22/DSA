import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GreyCode {
    public static void main(String[] args) {
        int n = 5;
        List<Integer> ans = greyCode(n);
        System.out.println(ans);
    }

    public static List<Integer> greyCode(int n){

//        if(n == 1){
//            List<String> ans = new ArrayList<>();
//            ans.add("0");
//            ans.add("1");
//            return ans.stream()
//                    .map(binary -> Integer.parseInt(binary, 2))
//                    .toList();
//        }
//
//        List<Integer> past = greyCode(n - 1);
//        ArrayList<String> ans = new ArrayList<>();
//        for (int i = 0; i < past.size(); i++) {
//            String a = String.valueOf(past.get(i));
//            ans .add("0" + a);
//        }
//
//        for (int i = past.size() - 1; i >=0 ; i--) {
//            String a = String.valueOf(past.get(i));
//            ans.add("1" + a);
//        }
//
//        return ans.stream()
//                .map(binary -> Integer.parseInt(binary, 2))
//                .toList();

        List<Integer> result = new ArrayList<>();

        // Start with base case for 0 bits
        result.add(0);

        for (int i = 0; i < n; i++) {
            int size = result.size();
            // Reflect current sequence and add the 1-bit prefix to the mirrored part
            for (int j = size - 1; j >= 0; j--) {
                result.add(result.get(j) | (1 << i));
            }
        }

        return result;
    }
}
