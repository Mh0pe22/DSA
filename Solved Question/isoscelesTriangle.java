import java.util.Scanner;

public class isoscelesTriangle {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter equal side length of isosceles triangle : ");
        float equl = in.nextFloat();
        System.out.println("Enter one remaining side value : ");
        float rem = in.nextFloat();
        System.out.println("The area of isosceles triangle is " + area(equl,rem));
    }

    static double area(float a, float b){

        double root= ((a*a) -(b*b /4));
        return (b/2)*(Math.sqrt(root));
    }
}
