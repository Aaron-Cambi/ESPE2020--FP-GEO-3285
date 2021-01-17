/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw04.menus.pkgswitch.pkgcase;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Eduardo Cambi
 */
public class HW04MenusSwitchCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;
        int x1;
        int y1;
        int x2;
        int y2;
        int x;
        int y;
        do {
            System.out.println("Calculator the Áreas");
            System.out.println("1. Distance between points ");
            System.out.println("2. Slope of the straight");
            System.out.println("3. Multiplication table");
            System.out.println("4. Sum of the n first numbers");
            System.out.println("5. Exit");

            System.out.println("Enter your menu option");
            option = input.nextInt();
            switch (option) {
                case 1:

                    float distance;
                    System.out.println("Distance between points");
                    System.out.println("Enter First point");
                    System.out.println("Enter x1");
                    x1 = input.nextInt();
                    System.out.println("Enter y1");
                    y1 = input.nextInt();
                    System.out.println("Enter Second point");
                    System.out.println("Enter x2");
                    x2 = input.nextInt();
                    System.out.println("Enter y2");
                    y2 = input.nextInt();
                    x = x2 - x1;
                    y = y2 - y1;
                    distance = (float) Math.sqrt(x * x + y * y);
                    System.out.println("Square area is --> " + distance + " \n ");
                    break;
                case 2:
                    float m;
                    System.out.println("Slope of the straight");
                    System.out.println("Enter First point");
                    System.out.println("Enter x1");
                    x1 = input.nextInt();
                    System.out.println("Enter y1");
                    y1 = input.nextInt();
                    System.out.println("Enter Second point");
                    System.out.println("Enter x2");
                    x2 = input.nextInt();
                    System.out.println("Enter y2");
                    y2 = input.nextInt();
                    y = y2 - y1;
                    x = x2 - x1;
                    m = y / x;
                    System.out.println("Rectangule area is --> " + m + "\n");
                    break;
                case 3:
                    System.out.println("Multiplication table ");
                   
                    int stop = 12;
                    int product = 0;
                    int table ;
                    System.out.println("Enserte value og the Table"
                            + " Multiplication");
                    table = input.nextInt();
                    System.out.println("Table Multiplication" + table );
                    for (int c = 1; c <= stop; c++) {
                        product = table * c;
                        System.out.println(+ table + "*" + c + " = " + product);
                    }

                    break;
                case 4:
                    int n;
                    int sum = 0;
                    System.out.println("Sum of the n first numbers");
                    Scanner teclado = new Scanner(System.in);
                    System.out.println("Enter n");
                    n = teclado.nextInt();
                    for (int a = 2; a < n; a++) {
                        sum = n * (n + 1) / 2;
                    }
                    System.out.println("Sum of the " + n + " first numbers"
                            + sum);
                    break;

                case 5:
                    System.out.println("Good bay Friends");
                    System.exit(0);
                    break;

            }
        } while (option != 5);

    }

}
