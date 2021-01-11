/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw02.pkgfloat;

import java.util.Scanner;

/**
 *
 * @author Eduardo Cambi
 */
public class HW02Float {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter point P=(x,y) ");
         System.out.print("Enter poin x = ");
         float x = scanner.nextFloat();
         System.out.print("Enter poin y = ");
         float y = scanner.nextFloat();
         System.out.println("Enter  straight ");
         System.out.println("Ax+By+C=0");
         System.out.print("Enter value A = ");
         float A = scanner.nextFloat();  
         System.out.print("Enter value B = ");
         float B = scanner.nextFloat();
         System.out.print("Enter value C = ");
         float C = scanner.nextFloat();
         float pro1 = x * A;  
         float pro2 = y * B;
         float sum1  = pro1 + pro2 + C;
        float a1 = A * A;
         float b1 = B * B;
         float sum2 = a1 + b1;
         float root = (float) Math.sqrt(sum2);
         float result = (float) (sum1 / root);
     
         System.out.println(" The distan is equial --> " + result);
    }
    
}
