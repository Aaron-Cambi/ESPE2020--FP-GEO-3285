/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw10.funtions;

import java.util.Scanner;

/**
 *
 * @author Eduardo Cambi
 */
public class HW10Funtions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int i = 1;

        int diviend;
        int divisor;
        float quotient;
        int stop = 12;
        int multiplier;
        int table;
        int Square1;
        int square2;
        int y;
        int x;
        System.out.println("|============================|" + "\n"
                + "|       EDUARDO CAMBI        |" + "\n"
                + "|============================|");
        System.out.println("|============================|" + "\n"
                + "|          Division          |" + "\n"
                + "|============================|");
        System.out.println("|============================|" + "\n"
                + "|  Ingrese el primer numero  |" + "\n"
                + "|============================|");
        diviend = input.nextInt();
        System.out.println("|============================|" + "\n"
                + "|  Ingrese el segundo numero |" + "\n"
                + "|============================|");
        divisor = input.nextInt();
        quotient = divideTwoNumbers(diviend, divisor);
        System.out.println("|============================|"
                + "\n" + diviend + " / " + divisor + " es " + quotient + "\n"
                + "|============================|" + "\n");
        System.out.println("|============================|" + "\n"
                + "|          Exponente         |" + "\n"
                + "|============================|");
        System.out.println("|============================|" + "\n"
                + "|      Ingrese el numero     |" + "\n"
                + "|============================|");
        square2 = input.nextInt();
        Square1 = SquareTheNumber(square2);
        System.out.println("|============================|"
                + "\n" + square2 + " ^ 2 es " + Square1 + "\n"
                + "|============================|" + "\n");
        System.out.println("|============================|" + "\n"
                + "|          Polinomio         |" + "\n"
                + "|         y = x^2+2x+1       |" + "\n"
                + "|============================|");
        System.out.println("|============================|" + "\n"
                + "|          Ingrese  x        |" + "\n"
                + "|============================|");
        x = input.nextInt();
        y = Polynomial(x);
        System.out.println("|============================|"
                + "\n" + " y = " + y + "\n"
                + "|============================|" + "\n");
        System.out.println("================================================ " + "\n"
                + "| Ingrese el valor de la tabla de multiplicar   |" + "\n"
                + "================================================ ");
        multiplier = input.nextInt();
        System.out.println("================================================ " + "\n"
                + "       Tabla de multiplicar del " + multiplier + "       " + "\n"
                + "================================================ ");
        table = TableOfMultiply(multiplier);

    }

    public static float divideTwoNumbers(int divnd, int divisr) {
        float quotient;
        quotient = (float) divnd / divisr;
        return quotient;
    }

    public static int SquareTheNumber(int number) {
        int Square1;
        Square1 = number * number;
        return Square1;
    }

    public static int Polynomial(int x) {
        int y;
        y = x * x + 2 * x + 1;
        return y;
    }

    public static int TableOfMultiply(int m) {

        int n = (int) 0.0F;
        int stop = 12;

        for (int s = 1; s <= stop; s++) {
            n = m * s;
            System.out.println(s + " * " + m + " = " + n);
        }
        System.out.println("================================================ ");
        return n;
    }

}
