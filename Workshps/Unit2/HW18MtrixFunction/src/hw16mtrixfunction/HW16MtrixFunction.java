/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw16mtrixfunction;

import java.util.Scanner;

/**
 *
 * @author Eduardo Cambi
 */
public class HW16MtrixFunction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int row = 0;
        int columns = 0;
        float matrixA[][];
        float matrixB[][];
        float matrixC[][];

        System.out.println("Eduardo Cambi \nSustraction of Matrix of orden m x n");
        System.out.print("Enter number of row -> ");
        row = input.nextInt();
        System.out.print("Enter number of columns -> ");
        columns = input.nextInt();

        matrixA = new float[row][columns];
        matrixB = new float[row][columns];
        matrixC = new float[row][columns];
        System.out.println("-------------Enter Values The Matrix-------------");
        matrixA = readMatrixElements(row, columns, "A", input);
        matrixB = readMatrixElements(row, columns, "B", input);

        System.out.println("");
        System.out.println("matrixA");
        showMatrix(matrixA);
        System.out.println("");
        System.out.println("matrixB");
        showMatrix(matrixB);

        System.out.println("\n matrix A - matriz B equals to -> ");
        matrixC = oprationMatrix(row, columns, matrixA, matrixB);
        showMatrix(matrixC);
    }

    private static void showMatrix(float[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("\t " + matrix[i][j]);
            }
            System.out.println("");
        }
    }

    public static float[][] readMatrixElements(int row, int columns, String matrixName, Scanner input) {
        float[][] matrix;
        matrix = new float[row][columns];
        for (int i = 0; i < row; i++) {
            System.out.println("---ROW Numbers " + (i + 1) + "---");
            for (int j = 0; j < columns; j++) {
                System.out.print(matrixName + " : [" + i + "] [" + j + "] = ");
                matrix[i][j] = input.nextInt();
            }
        }
        return matrix;
    }

    public static float[][] oprationMatrix(int row, int columns, float[][] matrixA, float[][] matrixB) {
        float[][] matrixC;
        matrixC = new float[row][columns];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < columns; j++) {
                matrixC[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }
        return matrixC;
    }
}
