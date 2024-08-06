import java.util.ArrayList;
import java.util.List;

public class BinaryWatch {

    public static void main(String[] args) {

        int num = 1;
        System.out.println(watch(num));
    }

    static List<String> watch(int n){

        ArrayList<String> result = new ArrayList<>();
        for (int hour = 0; hour <12 ; hour++) {

            for (int min = 0; min <60 ; min++) {
                if(Integer.bitCount(hour) + Integer.bitCount(min) == n) {
                    if (min < 10) {
                        result.add(String.format("%d:0%d", hour, min));
                    } else {
                        result.add(String.format("%d:%d", hour, min));
                    }
                }
            }
        }
        return result;
    }
}
