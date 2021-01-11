/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distancebetweenpointandstraight;

import java.util.Scanner;

/**
 *
 * @author CLIENTE
 */
public class DistanceBetweenPointAndStraight {

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
         Float y = scanner.nextFloat();
         System.out.println("Enter  straight (numbers real) ");
         System.out.println("Ax+By+C=0");
         System.out.print("Enter value A = ");
         int A = scanner.nextInt();  
         System.out.print("Enter value B = ");
         int B = scanner.nextInt();
         System.out.print("Enter value C = ");
         int C = scanner.nextInt();
         float pro1 = x * A;  
         float pro2 = y * B;
         float sum1  = pro1 + pro2 + C;
         float a1 = A * A;
         float b1 = B * B;
         float sum2 = a1 + b1;
         float root = (float) Math.sqrt(sum2);
         double result = (sum1 / root);
     
         System.out.println(" The distan is equial --> " + result);
    }
    
}
