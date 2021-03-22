/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw18searchalgorithms;

import java.util.Scanner;

/**
 *
 * @author Eduardo Cambi
 */
public class HW18SearchAlgorithms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        int arr[] = {2, 3, 4, 5, 7, 9, 10, 15, 21, 23, 35, 40};
        int n = arr.length;
        int x;
        int result;
        System.out.println("Eduardo Cambi");
        System.out.println("Enter element");
        x = input.nextInt();
        result = BinarySearch.binarySearch(arr, 0, n - 1, x);
        if (result == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element found at index " + result);         
        }
        System.out.println("Enter element");
        x = input.nextInt(); 
        result = LinearSearch.search(arr, x);
          if (result == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element found at index " + result);         
        }
    }
}
