import java.util.Scanner;

public class Main extends Array {

    public static void main(String[] args) {

        Array a1 = new Array();
        System.out.println("Enter 10 elements of array from 1 to 10 in any order : ");
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            a1.data[i] = in.nextInt();
        }
        System.out.println("Array elements are : ");

        a1.display(a1.data);

        System.out.println();
        System.out.println("Sorted array : ");
        a1.sorting(a1.data);

        System.out.println("Maximum element in array is : " + a1.Maximum_of_array(a1.data));

        System.out.println("Enter a element you want to search : ");
        int a = in.nextInt();
        System.out.println(a + "is on index " + a1.search(a1.data , a));

        System.out.println("The size of array is " + a1.size(a1.data));
    }
}
