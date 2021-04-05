/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.SortAndSearch.view;

/**
 *
 * @author Eduardo Cambi
 */
public class Sorting {

    public static void sort(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            int aux = numbers[i];
            int pos = i;
            while ((pos > 0) && (numbers[pos - 1] > aux)) {
                numbers[pos] = numbers[pos - 1];
                pos--;
            }
            numbers[pos] = aux;
        }
    }
}