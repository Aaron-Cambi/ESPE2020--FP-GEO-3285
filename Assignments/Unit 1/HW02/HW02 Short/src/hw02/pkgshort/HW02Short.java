/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw02.pkgshort;

import java.util.Scanner;

/**
 *
 * @author Eduardo Cambi
 */
public class HW02Short {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter number reals) ");
        System.out.println("Enter point P=(x,y) ");
         System.out.print("Enter poin x = ");
         short x = scanner.nextShort();
         System.out.print("Enter poin y = ");
         short y = scanner.nextShort();
         System.out.println("Enter  straight ");
         System.out.println("Ax+By+C=0");
         System.out.print("Enter value A = ");
         short A = scanner.nextShort();  
         System.out.print("Enter value B = ");
         short B = scanner.nextShort();
         System.out.print("Enter value C = ");
         short C = scanner.nextShort();
         double  pro1 =  (x * A);  
         double pro2 =  (y * B);
         double sum1  =  (pro1 + pro2 + C);
         double a1 =  (A * A);
         double b1 =  (B * B);
         double sum2 =  (a1 + b1);
         double root =  Math.sqrt(sum2);
         double result =  (sum1 / root);
     
         System.out.println(" The distan is equial --> " + result);
    }
    
}