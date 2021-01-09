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
         System.out.println("Enter  straight ");
         System.out.println("Ax+By+C=0");
         System.out.print("Enter value A = ");
         int A = scanner.nextInt();  
         System.out.print("Enter value B = ");
         int B = scanner.nextInt();
         System.out.print("Enter value C = ");
         int C = scanner.nextInt();
         Float pro1 = x * A;  
         Float pro2 = y * B;
         Float sum1  = pro1 + pro2 + C;
         Float a1 = x * x;
         Float b1 = y * y;
         Float sum2 = a1 + b1;
         float root = (float) Math.sqrt(sum2);
         double result = (sum1 / root);
     
         System.out.println(" The distan is equial --> " + result);
    }
    
}
