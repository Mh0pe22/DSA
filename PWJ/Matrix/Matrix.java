package Matrix;

import java.util.Scanner;

public class Matrix {
    
    int row , column;
    float[][] mat;

    Matrix(int[][] a){
        row = a.length;
        column = a[0].length;
        mat = new float[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                mat[i][j] = a[i][j];
            }
        }
    }
    Matrix(){


        row = 0;
        column = 0;
        mat = new float[row][column];
    }
    
    Matrix(int row, int col){
        this.row = row;
        this.column = col;

        mat = new float[row][column];

    }
    
    void readMatrix(){

        System.out.println("Enter elements of matrix : ");
        Scanner in = new Scanner(System.in);
        for (int row = 0; row < mat.length; row++) {

            for (int column = 0; column < mat[row].length; column++) {

                mat[row][column] = in.nextFloat();
            }
        }
    }
    
    float[][] transpose(){
        float[][] transposed = new float[column][row];
        for (int i = 0; i < row; i++)
            for (int j = 0; j < column; j++)
                transposed[j][i] = mat[i][j];
        return transposed;
    }
    
    // Multiply two matrices and return result 
    float[][] matrixMultiplication(Matrix second){

        float[][] ans = new float[second.row][second.column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                ans[i][j] = mat[i][j] * second.mat[i][j];
            }
        }
        return ans;
    }
    
    void displayMatrix(float[][] a){

        for(float[] num : a){

            for(float ans: num){
                System.out.print(" " + ans);
            }
            System.out.println();
        }
    }
    
    void displayMatrix(){

        displayMatrix(mat);
    }
    
    // Return maximum element of first array
    float maximum_of_array(){

        float max  = mat[0][0];
        for(float[] a : mat){
            for(float ans : a){
                if(ans > max){
                    max = ans;
                }
            }
        }

        return max;
    }
    
    // Return average of first array
    float average_of_array(){

        float sum = 0;
        for(float[] a : mat){
            for(float num : a){
                sum += num;
            }

        }
        return sum / (row  * column);
    }
}
