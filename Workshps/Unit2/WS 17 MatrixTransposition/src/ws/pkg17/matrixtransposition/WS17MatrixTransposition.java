package ws.pkg17.matrixtransposition;

import java.util.Scanner;

/**
 *
 * @author Eduardo Cambi
 */
public class WS17MatrixTransposition {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[][] a;
        float[][] b;
        float[][] t;
        float[][] c;
        int n = 0;
        int m = 0;
        System.out.println("Enter the matrix dimensions");
        System.out.print("\n m -> ");
        m = input.nextInt();

        System.out.print("\n n -> ");
        n = input.nextInt();

        a = new float[m][n];
        b = new float[m][n];
        c = new float[m][n];
        t = new float[m][n];

        System.out.println("------------Enter the elements of the matrix ------------");
        a = readMatrixElements(m, n, "A", input);
        b = readMatrixElements(m, n, "B", input);

        for (int tab = 0; tab <= m / 2; tab++) {
            System.out.println("\t");
        }
        System.out.println("        A");
        prettyPrinMatrix(m, n, a);
        System.out.println("");

        System.out.println("        B");
        prettyPrinMatrix(m, n, b);
        System.out.println("");

        transpose(n, m, t, a);

        for (int tab = 0; tab <= m / 2; tab++) {
            System.out.println("\t");
        }
        System.out.println("      T");

        prettyPrinMatrix(m, n, t);
        
        System.out.println("");

        System.out.println("---The sum of matrces is---");

        c = addTwoMatrices(m, n, a, b);

        prettyPrinMatrix(m, n, c);
        
        System.out.println("");
    }

    public static float[][] readMatrixElements(int m, int n, String matrixName, Scanner input) {
        float[][] matrix;
        matrix = new float[m][n];
        for (int i = 0; i < m; i++) {
            System.out.println("---ROW Numbers " + (i + 1) + "---");
            for (int j = 0; j < n; j++) {
                System.out.print(matrixName + "[" + (i + 1) + "] [" + (j + 1) + "] -> ");
                matrix[i][j] = input.nextFloat();
            }
        }
        return matrix;
    }

    public static void transpose(int n, int m, float[][] t, float[][] a) {
      for(int i=0; i < n; i++){
            for(int j=0; j < m; j++){
                t[i][j] = a[j][i];
            }
        }

    }

    public static float[][] addTwoMatrices(int m, int n, float[][] a, float[][] b) {
        float[][] c;
        c = new float[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }

    public static void prettyPrinMatrix(int m, int n, float[][] matrix) {
        for (int i = 0; i < m; i++) {
            System.out.println("");
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    if (i == 0) {
                        System.out.print("┌\t");
                    } else if (i == m - 1) {
                        System.out.print("└\t");
                    } else {
                        System.out.print("|\t");
                    }
                }
                System.out.print(matrix[i][j]);
                if (j > -1 && j < (n - 1)) {
                    System.out.print("\t");
                }
                if (j == (n - 1)) {
                    if (i == 0) {
                        System.out.print("\t┐");
                    } else if (i == m - 1) {
                        System.out.print("\t┘");
                    } else {
                        System.out.print(" \t|");
                    }
                }
            }
        }
        System.out.print("");
    }

    public static void prinMatrix(int m, int n, float[][] matrix) {
        for (int i = 0; i < m; i++) {
            System.out.println("");
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    if (i == 0) {
                        System.out.println("/ \t");
                    } else if (i == m - 1) {
                        System.out.println("\\\t");
                    } else {
                        System.out.println("| \t");
                    }
                }

                System.out.println(matrix[i][j]);
                if (j > -1 && j < (n - 1)) {
                    System.out.println("\t");
                }
                if (j == (n - 1)) {
                    if (i == 0) {
                        System.out.println("\t\\");
                    } else if (i == m - 1) {
                        System.out.println("\t/");
                    } else {
                        System.out.println("\t|");
                    }
                }
            }
        }
        System.out.println("");
       
    }
}
