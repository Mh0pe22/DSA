import java.util.List;

public class CountMatch {
    public static void main(String[] args) {

        List<List<String>> items = List.of(
                List.of("phone", "blue", "pixel"),
                List.of("computer", "silver", "lenovo"),
                List.of("phone", "gold", "iphone")
        );

        String rule = "color";
        String value = "silver";
        int result = countMatch(items, rule, value);
        System.out.println(result);
    }

    // items [type , color , name]
    public static int countMatch(List<List<String >> items, String rule, String value){

//        String[][] arr =  items.toArray((new String[0][0]));
        String[] a = {"type" , "color" , "name"};
        int key = 0;
        for (int i = 0; i < 3; i++) {
            if(a[i].equals(rule)){
                key = i;
                break;
            }
        }

        int count = 0;
        for (List<String> item : items) {
            if (item.get(key).equals(value)) {
                count++;
            }
        }

        return count;
    }
}
