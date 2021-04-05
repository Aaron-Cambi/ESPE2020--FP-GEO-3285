/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Theodolite.model;

/**
 *
 * @author Eduardo Cambi
 */
public class Theodolite {
private String color;
    private String material;
    private float height;
    private float price;
    private boolean theodolite;

    public Theodolite(boolean type, String color, String materials, float height, float price) {

        this.theodolite = theodolite;
        this.color = color;
        this.material = material;
        this.height = height;
        this.price = price;

    }
    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @return the material
     */
    public String getMaterial() {
        return material;
    }

    /**
     * @return the height
     */
    public float getHeight() {
        return height;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @return the theodolite
     */
    public boolean isTheodolite() {
        return theodolite;
    }

    
}
