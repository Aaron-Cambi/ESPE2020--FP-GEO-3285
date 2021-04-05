/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.FruistList.controller;

/**
 *
 * @author Eduardo Cambi
 */
public class SearcherFruit {

    public static int findFruit(String[] fruit, String searchFruit) {
       for (int i = 0; i < 6; i++) {
            if (searchFruit.equals(fruit[i])) {
                return 1;
            }
        }
    return -1;
    }
}



