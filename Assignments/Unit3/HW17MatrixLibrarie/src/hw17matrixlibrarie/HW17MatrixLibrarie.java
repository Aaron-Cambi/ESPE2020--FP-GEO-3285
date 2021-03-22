/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw17matrixlibrarie;

import java.util.Scanner;

import ec.edu.espe.tax.OperationMatrix;

/**
 *
 * @author Eduardo Cambi
 */
public class HW17MatrixLibrarie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row = 0;
        int columns = 0;
        float matrixA[][];
        float matrixB[][];
        float sum[][];
        float subtract[][];

        System.out.println("Eduardo Cambi \nSustraction of Matrix of orden m x n");
        System.out.print("Enter number of row -> ");
        row = input.nextInt();
        System.out.print("Enter number of columns -> ");
        columns = input.nextInt();

        matrixA = new float[row][columns];
        matrixB = new float[row][columns];
        sum = new float[row][columns];
        subtract = new float[row][columns];
        System.out.println("-------------Enter Values The Matrix-------------");
        matrixA = OperationMatrix.readMatrixElements(row, columns, "  A ", input);
        matrixB = OperationMatrix.readMatrixElements(row, columns, "  B", input);
        System.out.println("    Matrix A");   
        showMatrix(matrixA);
        System.out.println("    Matrix B");
        showMatrix(matrixB);
        System.out.println("    Sum");
        sum = OperationMatrix.addMatrix(row, columns, matrixA, matrixB);
        showMatrix(sum);
        System.out.println("   Subtract");
        subtract = OperationMatrix.subtractMatrix(row, columns, matrixA, matrixB);
        showMatrix(subtract);
        
    }

    private static void showMatrix(float[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("\t " + matrix[i][j]);
            }
            System.out.println("");
        }
    }
}