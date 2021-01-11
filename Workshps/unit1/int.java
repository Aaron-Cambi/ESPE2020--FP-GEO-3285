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
         int x = scanner.nextInt();
         System.out.print("Enter poin y = ");
         int y = scanner.nextInt();
         System.out.println("Enter  straight ");
         System.out.println("Ax+By+C=0");
         System.out.print("Enter value A = ");
         int A = scanner.nextInt();  
         System.out.print("Enter value B = ");
         int B = scanner.nextInt();
         System.out.print("Enter value C = ");
         int C = scanner.nextInt();
         int pro1 = x * A;  
         int pro2 = y * B;
         int sum1  = pro1 + pro2 + C;
         int a1 = A * A;
         int b1 = B * B;
         int sum2 = a1 + b1;
         int root = (int) Math.sqrt(sum2);
         int result = (int) (sum1 / root);
     
         System.out.println(" The distan is equial --> " + result);
    }
    
}


 