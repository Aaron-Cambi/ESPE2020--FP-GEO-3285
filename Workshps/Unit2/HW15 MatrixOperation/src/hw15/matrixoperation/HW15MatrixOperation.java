/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw15.matrixoperation;

import java.util.Scanner;

/**
 *
 * @author Eduardo Cambi
 */
public class HW15MatrixOperation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int row;
        int columns;
        int matrixA[][];
        int matrixB[][];
        int matrixC[][];
        System.out.println("Eduardo Cambi \nSustraction of Matrix of orden m x n");
        System.out.println("Enter number of row");
        row = input.nextInt();
        System.out.println("Enter number of columns");
        columns = input.nextInt();
        System.out.println("Enter values from matrix A ");
        matrixA = new int[row][columns];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("matrix A : [" + i + "] [" + j + "] = ");
                matrixA[i][j] = input.nextInt();
            }
        }

        System.out.println("");
        System.out.println("Enter values from matrix B ");
        matrixB = new int[row][columns];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("matrix B : [" + i + "] [" + j + "] = ");
                matrixB[i][j] = input.nextInt();
            }
        }
        System.out.println("");
        System.out.println("matrixA");
        for (int i = 0; i < matrixA.length; i++) {     
            for (int j = 0; j < matrixA[i].length; j++) {
                System.out.print("\t " + matrixA[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("matrixB");
        for (int i = 0; i < matrixB.length; i++) {
            for (int j = 0; j < matrixB[i].length; j++) {
                System.out.print("\t " + matrixB[i][j]);
            }
            System.out.println("");
        }
        matrixC = new int[row][columns];
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < columns; j++) {
                matrixC[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }
        System.out.println("\n matrix A - matriz B equals to -> ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("\t " + matrixC[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
    }
}