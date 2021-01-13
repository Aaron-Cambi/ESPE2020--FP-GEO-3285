/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws05.interations;

/**
 *
 * @author Eduardo Cambi
 */
public class WS05Interations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int i ;
        i = 0;
        System.out.println("=== This while loop from i to 10 ===");
        while(i < 10){
            System.out.println(" i --> " + (i+1) );
           i++;
        }
        System.out.println(" Firs 5 even numbers ");
           i=2;
           while(i <= 10){
          
           System.out.println(i + " is event"); 
            //i=i+1
            i+=2;
        }
           System.out.println("First 10 odd numbers ");
           int stop ;
           stop = 20;
           for(int j=1; j <stop ; j+=2){
              System.out.println(" odd numbers --> " + j ); 
           }
           System.out.println(" Multiplication table: 9 ");
           int top = 12;
           int product =0 ;
           int table = 9;
           for(int j = 1; j<= top ;j++){
               product = table * j;
               System.out.println(" 9 * " + j + " = " + product);
           }               
    }
}

         
       
        
    
    
