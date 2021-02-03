/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw.pkg08.factorial;

import java.util.Scanner;

/**
 *
 * @author Eduardo Cambi
 */
public class HW08FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println(":========= The Factorials ========:");
        int stop;
        int factorial=1;
        do {
            System.out.println(":   The factorial of the number   :" + "\n"
                    + "===================================");
            stop = input.nextInt();
            if (stop >= 15 || stop <= 0) {               
                    System.out.println(":=================================:" + "\n"
                            + ":Number not valid                 :" + "\n"
                            + ":=================================:");               
            } else {

                for (int number = 1; number <= stop; number++) {
                    factorial *= number;
                }
                System.out.println(":=================================:" + "\n"
                        + "The factorial of " + stop + " is "
                        + factorial + "\n" + ":=================================:");
            return;
            }
   
            
        } while (stop != 0);
        System.out.println(":=================================:" + "\n"
                        + "The factorial of 0 is 1" + "\n" +
                ":=================================:");
        System.out.println("exit"); 
    }

}
