/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cambiaq11;

import java.util.Scanner;

/**
 *
 * @author Eduardo Cambi
 */
public class CambiAQ11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int number[];

        int matrix[] = {12, 23, 34, 98, 87, 65, 0};
        int value;
        int sum = 0;

        number = new int[5];

        System.out.println("exercise 1");
        System.out.println("Enter 5 values for addition ");
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter values " + i + " -> ");
            number[i] = input.nextInt();
            sum = sum + number[i];
        }
        System.out.println("Sum is -> " + sum);
        System.out.println();

        float average1;
        float average[];
        float sumA = 0;
        average = new float[3];

        System.out.println("exercise 2");
        System.out.println("Enter 3 values for average ");

        for (int i = 1; i < 4; i++) {
            System.out.print("Enter values " + i + " -> ");
            average[i] = input.nextInt();
            sumA = sumA + average[i];

        }
        average1 = sumA / 3;
        System.out.println("average" + average1);

    }
}
