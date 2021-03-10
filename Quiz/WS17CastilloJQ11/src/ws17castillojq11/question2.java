/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws17castillojq11;

/**
 *
 * @author Eduardo Cambi
 */
public class question2 {
     public static void main(String[] args) {
        // TODO code application logic here
        int array[] = {4, 7, 4, 9, 50};
        int sum = 0;
        for (int x = 0; x < array.length; x++) {
            sum = sum + array[x];
        }
        float average = sum / array.length;
        System.out.printf("Sum: %d. average: %f", sum, average);
    } 
}
