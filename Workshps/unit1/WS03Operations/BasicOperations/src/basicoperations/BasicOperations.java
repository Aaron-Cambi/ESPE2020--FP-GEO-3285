/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicoperations;

/**
 *
 * @author CLIENTE
 */
public class BasicOperations {

    private static int sub;
    private static int mul;
    private static int div;
    private static int mod;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sum;
        int addend1;
        int addend2;
        int minuend;
        int sustraend;  
        int multiplying;
        int multiplier;
        int dividend;
        int divider;
        //
        addend1 = 5;
        addend2 = 18;
        minuend = -23;
        sustraend = -6;
        multiplying = 4;
        multiplier = 3;
        dividend = 25;
        divider = 5;
        
        //operation
        sum = addend1 + addend2;
        
        System.out.println("The addition of " + addend1 + " + " + addend2 + 
                " is equal to --> to " + sum);
        ++sum;
        System.out.println("sum is equal to --> " + sum);
        
        sum++;
        System.out.println("adding one to sum " + (sum++));
        
        System.out.println("ading one to sum " + ((++sum )));
        
        sub = minuend - sustraend; 
        
        System.out.println("The subtraction " + minuend + " - " + sustraend + 
                " is equal to --> to " + sub);
        ++sub;
        System.out.println("sub is equal to --> " + sub);
        
        mul = multiplying * multiplier;
        
        System.out.println("The multiplication " + multiplying + " * " + 
                multiplier + " is equal to --> to " + mul );
        
        System.out.println("mul is equal to --> " + mul);
        
        div = dividend / divider; 
        
        System.out.println("The division " + dividend + " / " +
                divider + " is equal to --> to " + div);
        System.out.println("div is equal to --> to " + div);
        
        mod = dividend % divider; 
        
        System.out.println("The modulo " + dividend + " % " + divider + 
                " is equal to --> to " + mod);
        
        System.out.println("mod is equal to --> " + mod);
        
        
        
        
    }

        
    }
   
    

