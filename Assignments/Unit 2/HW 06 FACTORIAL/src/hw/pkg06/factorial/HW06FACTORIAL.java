/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw.pkg06.factorial;

import java.util.Scanner;

/**
 *
 * @author Eduardo Cambi
 */
public class HW06FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println(":========= The Factorials ========:");
        int number;
       int factorial = 1;
        System.out.println(":   The factorial of the number   :" + "\n"
                + "===================================");
        number = input.nextInt();
        if (number >= 15 || number <= 0) {
            System.out.println(":=================================:" + "\n" +
                               ":Number not valid                 :" + "\n" +
                    ":=================================:");
        }else {            
                for (int n = 1; n <= number; n++) {
                    factorial *= n;
                }
                System.out.println(":=================================:" + "\n"
                        +"The factorial of " + number + " is " 
                        + factorial + "\n" + ":=================================:");
            }
       
        }

    }
