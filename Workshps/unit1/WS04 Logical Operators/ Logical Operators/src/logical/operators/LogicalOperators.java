/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logical.operators;

/**
 *
 * @author Eduardo Cambi
 */
public class LogicalOperators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 8;
        if (x != 8) {
            System.out.println("x is equals to 10");
        } else {
            System.out.println("x is NOT equal to 10");
        }

        boolean y = x != 8;
        System.out.println("x != 10 --> " + (y));
        System.out.println("x == 10 --> " + (x == 8));
        System.out.println("x = 5 -->   " + (x = 6));
        System.out.println("x > 5 -->  " + (x > 6));
        System.out.println("x >= 5 --> " + (x >= 6));

        boolean comparison = false;
        boolean comparison2 = false;
        boolean comparison3 = false;
        comparison = x != 10;
        System.out.println("comparison -> " + comparison);

        comparison2 = x >= 5;
        System.out.println(" logical AND (&&)");
        comparison3 = comparison && comparison2;
        System.out.println("comparison1 ^ comparison2 --> " + (comparison3));
        comparison3 = comparison || comparison2;
        System.out.println("comparison1 v comparison2 --> " + (comparison3));

        System.out.println("not comparison --> " + !comparison);
        comparison = false;
        System.out.println("not comparison --> " + !comparison);
        comparison = true;
        System.out.println("not comparison --> " + !comparison);
        System.out.println("comparison2 -> " + comparison2);

        System.out.println(" logical AND (&&)");
        comparison3 = comparison && comparison2;
        System.out.println("comparison1 ^ comparison2 --> " + (comparison3));
        comparison3 = comparison || comparison2;
        System.out.println("comparison1 v comparison2 --> " + (comparison3));

        System.out.println("not comparison --> " + !comparison);
        comparison = false;
        System.out.println("not comparison --> " + !comparison);
        comparison = true;
        System.out.println("not comparison --> " + !comparison);

        System.out.println("Eduardo Cambi AND TRUTH TABLE odd numbers -> &&  even numbers ->||");
        System.out.println("=================================================");
       
       boolean p = true;
       boolean q = true;
       boolean r = false;
       boolean t = false;
       
       boolean comparation = p && q;
       System.out.println("" + p + " ^ " + q + " = " + comparation );
       
       boolean comparation2 = p && r;
       System.out.println("" + p + " ^ " + r + " = " + comparation2 );
       
       boolean comparation3 = t && q; 
       System.out.println("" + t + " ^ " + q + " = " + comparation3);
      
       boolean comparation4 = r && t;
       System.out.println("" + r + " ^ " + t + " = " + comparation4);
       
    }
        
    }
    
