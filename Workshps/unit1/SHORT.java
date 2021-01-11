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
         short pro1 = x * A;  
         short pro2 = y * B;
         short sum1  = pro1 + pro2 + C;
         short a1 = A * A;
         short b1 = B * B;
         short sum2 = a1 + b1;
         short root = (short) Math.sqrt(sum2);
         short result = (short) (sum1 / root);
     
         System.out.println(" The distan is equial --> " + result);
    }
    
}