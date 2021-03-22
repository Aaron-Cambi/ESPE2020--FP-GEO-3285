/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.tax;

import java.util.Scanner;

/**
 *
 * @author Eduardo Cambi
 */
public class OperationMatrix {
    

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

    public static float[][] subtractMatrix(int row, int columns, float[][] matrixA, float[][] matrixB) {
        float[][] matrixC;
        matrixC = new float[row][columns];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < columns; j++) {
                matrixC[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }
        return matrixC;
    }
    public static float[][] addMatrix(int row, int columns, float[][] matrixA, float[][] matrixB) {
               float[][] matrixC;
        matrixC = new float[row][columns];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < columns; j++) {
                matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        return matrixC; 
    }
        
    
}
