/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Theodolite.controller;

import Utils.FileManager;
import ec.edu.espe.Theodolite.model.Theodolite;

/**
 *
 * @author Eduardo Cambi
 */
public class TheodoliteController {
    
     public static void save(Theodolite theodolite){
         String data = theodolite.isTheodolite() + ";" + theodolite.getColor() 
                 + ";" + theodolite.getMaterial() + ";" + theodolite.getHeight() + ";" + theodolite.getPrice();
   FileManager.save(data, "Thedolite");
     }

}
