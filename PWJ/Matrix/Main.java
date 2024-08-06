package Matrix;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Matrix m1 = new Matrix(a);
        m1.displayMatrix();

        // Create a Matrix object with no arguments
        Matrix m2 = new Matrix();
        m2.readMatrix();
        m2.displayMatrix();

        // Create a Matrix object with row and column sizes
        Matrix m3 = new Matrix(3, 3);
        m3.readMatrix();
        m3.displayMatrix();

        float[][] multi = m1.matrixMultiplication(m3);
        System.out.println("Multiplication of matrix 1 and 3 is : ");
        System.out.println(Arrays.deepToString(multi));

        System.out.println("Transpose of matrix 1 is  : ");
        m1.displayMatrix(m1.transpose());


        System.out.println("Max: " + m1.maximum_of_array());
        System.out.println("Average: " + m1.average_of_array());
    }
}
