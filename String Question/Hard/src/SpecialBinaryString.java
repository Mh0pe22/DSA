import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SpecialBinaryString {
    public static void main(String[] args) {
        String s =  "11011000";
        System.out.println(makeLargestSpecial(s));
    }

    public static String makeLargestSpecial(String s){
        return dfs(s , 0 , s.length() - 1);
    }

    private static final Comparator<String> COMP = (a , b) -> (b + a).compareTo(a + b);
    public static String dfs(String s , int from ,int to){

        if(from > to){
            return "";
        }
        int sum = 0;
        int groupStart = from;

        List<String> subGroups = new ArrayList<>();
        for (int i = from; i <=to; i++) {
            if(s.charAt(i) == '1'){
                sum++;
            }else{
                sum--;
            }

            if(sum == 0){
//                this is subgroup
//                subgroup start at groupstart , ends at i . inner the subgroup
//                the current subgroup we identified must start with 1 and end with 0
//                per problem statement
                subGroups.add("1" + dfs(s , groupStart + 1 , i - 1) + "0");
//                next group start at i + 1
                groupStart = i + 1;
            }

        }

//        now we have best subGroup best answer in the list , we sort them descendingly
        Collections.sort(subGroups,COMP);
        StringBuilder sb = new StringBuilder();
        for(String each : subGroups){
            sb.append(each);
        }

        return sb.toString();
    }
}
