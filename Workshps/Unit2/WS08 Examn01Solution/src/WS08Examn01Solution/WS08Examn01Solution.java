/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS08Examn01Solution;

import java.util.Scanner;

/**
 *
 * @author Eduardo Cambi
 */
public class WS08Examn01Solution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int multiplicand;
        int multiplier;
        int product;
        int stop;
        stop = 12;
        do {
            System.out.println("Enter The Table You Want To Study");
            System.out.println("0. (zero) to exit --> ");
            Scanner input = new Scanner(System.in);
            multiplicand = input.nextInt();
            if (multiplicand != 0) {
                System.out.println("Studying The Table At -->");
                for (multiplier = 1; multiplier <= stop; multiplier++) {
                    product = multiplicand * multiplier;
                    System.out.println(multiplicand + " * " + multiplier + " = " 
                            + product);
                }
            }
        }while(multiplicand!= 0);

        System.out.println("God Bye");

    }

}
