import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample{

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ArrayList <Integer> rollNo = new ArrayList <Integer>(1);

        rollNo.add(1);

        rollNo.add(2);
        rollNo.add(3);
        rollNo.add(4);
        rollNo.add(5);
        rollNo.add(6);
        rollNo.add(7);
        rollNo.add(8);
        rollNo.add(9);
        rollNo.add(10);

        for (int i = 0; i < 5; i++) {
            System.out.println(rollNo.get(i));
        }
    }
}
