/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wh03.interation;

/**
 *
 * @author Eduardo Cambi
 */
public class HW03Interation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 0;
        System.out.println("First 11 Numbers");
        while(n < 11){
            System.out.println(" n " + "= " + (n+1));
            n++;
        }
        System.out.println("Multiplication table 11");
        int stop=12;
        int product = 0;
        int table = 11; 
        for(int m = 1; m <= stop; m++){
            product = table * m;
            System.out.println(" 11 " + "*" + m + " = " + product);
        }
        }
    }
    

