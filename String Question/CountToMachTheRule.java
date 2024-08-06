import java.util.List;
import java.util.Objects;

public class CountToMachTheRule {
    public static void main(String[] args) {

    }

    public static int matchTheRule(List<List<String>> items, String ruleKey, String ruleValue ){

        int match = 0;
        int index = 0;

        if(ruleKey.equals("type")){
            index = 0;
        } else if (ruleKey.equals("color")) {
            index = 1;
        }else {
            // for name
            index = 2;
        }

        for (List<String> list : items){
            if(list.get(index).equals(ruleValue)){
                match++;
            }
        }
        return match;
    }
}
