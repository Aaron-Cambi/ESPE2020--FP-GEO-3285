/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp02_controlstatement;

import java.util.Scanner;

/**
 *
 * @author CLIENTE
 */
public class FP02_ControlStatement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
               Scanner scanner = new Scanner(System.in);
               System.out.println("Please enter an integer");
               int n = scanner.nextInt();
               n = n%2;
               if (n==0){
               System.out.println(n + " is event");
               } else {
                     System.out.println(n + " is odd");
                    }  
               
      }
}