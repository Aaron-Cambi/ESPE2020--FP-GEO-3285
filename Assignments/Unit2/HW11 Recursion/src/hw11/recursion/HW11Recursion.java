/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw11.recursion;

import java.util.Scanner;

/**
 *
 * @author Eduardo Cambi
 */
public class HW11Recursion {

    static int value = 10;
    static int interest = 5;
    static int total = 0;

    public static void main(String[] args) {
System.out.println("the rent of a movie is $ 10,"
        + " but every day that passes increases 5 dollars\n" +
"we want to know the amount to pay for x days");
        Scanner input = new Scanner(System.in);
        int days;
        float pay;
        System.out.println("Enter the days");
        days = input.nextInt();
        showPay(days);
        System.out.println("The amount to pay is $ " + total);
    }

    static void showPay(int days) {
        if (days > 0) {
            total = value + interest;
            value = interest;
            interest = total;
            showPay(days - 1);
        }
    }
}
