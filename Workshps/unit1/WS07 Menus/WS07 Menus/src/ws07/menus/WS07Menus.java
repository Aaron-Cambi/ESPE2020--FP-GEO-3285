/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws07.menus;

import java.util.Scanner;

/**
 *
 * @author Eduardo Cambi
 */
public class WS07Menus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        boolean mainLoop =true;
        int option;
      
        do {
            System.out.println("=====Calculator=====");
            System.out.println("1. --> Addition");
            System.out.println("2. --> Sustration");
            System.out.println("3. --> Multiplication");
            System.out.println("4. --> Division");
            System.out.println("5. --> Exit");
            
            System.out.print("Enter your menu option --> ");
            option = input.nextInt(); 
        
        switch(option){
            case 1:
                int addend1;
                int addend2;
                int sum;
                System.out.print("enter addend 1 -> ");
                addend1 = input.nextInt();
                System.out.print("enter addend 2 -> ");
                addend2 = input.nextInt();
                sum = addend1 + addend2;
                System.out.println(" the sum is equal to--> " + sum + "\n");
                break;
            case 2: 
                int minuend;
                int sustraend;
                int rest;
                System.out.print("Enter minuend --> ");
                minuend = input.nextInt();
                System.out.print("Enter Subtract --> ");
                sustraend = input.nextInt();
                rest = minuend - sustraend;
                System.out.println("The rest is equal to --> " + rest + "\n");
                    break;
                case 3:
                    int factor1;
                    int factor2;
                    int product;
                    System.out.print("Enter prodct1 --> ");
                    factor1 = input.nextInt();
                    System.out.print("Enter product2 --> ");
                    factor2 =input.nextInt();
                    product = factor1 * factor2;
                    System.out.println("The multiplcation is equal to --> "
                            + product + "\n");
                    break;
                case 4:
                    int dividend;
                    int divisor; 
                    int division;
                    System.out.print("Enter numerator --> ");
                    dividend = input.nextInt();
                    System.out.print("Enter denominator --> ");
                    divisor = input.nextInt();
                    division = dividend / divisor;
                    System.out.println("The division is equal to --> " 
                            + division + "\n" );
                    break;

                case 5:
                    System.out.println("Good Bye my friend");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option\n\n\n");
                    break;

            }

        } while (option != 5);
                
}
}
   
        
     
     
        // TODO code application logic here
  
    
