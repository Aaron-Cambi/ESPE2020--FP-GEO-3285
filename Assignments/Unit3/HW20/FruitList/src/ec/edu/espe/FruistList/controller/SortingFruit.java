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
public class SortingFruit {

    public static String[] sortFruits(String[] fruit) {
for(int j=0;j<5;j++) {
             for(int i=0;i<5-j;i++) {
                 if (fruit[i].compareTo(fruit[i+1])>0) {
                     String aux;
                     aux=fruit[i];
                     fruit[i]=fruit[i+1];
                     fruit[i+1]=aux;
                 }
             }
         }
   return fruit;
    }
}

    
  