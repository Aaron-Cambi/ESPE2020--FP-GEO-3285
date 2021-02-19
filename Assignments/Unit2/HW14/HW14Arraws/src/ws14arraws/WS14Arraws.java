/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws14arraws;

import java.util.Scanner;

/**
 *
 * @author Eduardo Cambi
 */
public class WS14Arraws {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Eduardo Cambi");
        Scanner input = new Scanner(System.in);
        int[] numbersCars ;
        String[] carBrands = {"chevrolet", "hyundai", "nissan", "renault","mercedes","hyundai", "nissan"};
        float[] wide = {1.96F, 1.95F, 1.89F, 1.85F, 1.88F, 1,98F, 1.95F, 1.89F};
        int m;
        System.out.print("Enter the number of the parking -> ");
        m = input.nextInt();

        numbersCars = new int[m];
        
        for (int i = 0; i < m ; i++){
            System.out.print("Enter the number of cars of the parking " + (i + 1)+ "-> ");
            numbersCars[i] = input.nextInt();
        }       
        for (int i = 0; i < m; i++){
            System.out.println("Cars in the parkin " + (i + 1) + " are "+ numbersCars[i]);
            
        }
     for (String cars : carBrands) {
            System.out.println("Car Brand -> " + cars);
        }
      for (int i = 0; i < m ; i++) {
            System.out.println("carriage width " + (i + 1) + " -> " + wide[i]);
        }
    }
}
 