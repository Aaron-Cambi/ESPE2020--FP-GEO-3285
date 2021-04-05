/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.CityParks.model;

/**
 *
 * @author Eduardo Cambi
 */
public class Park {

    private String name;
    private String ubication;
    private int openningTime;
    private int closingTime;
    private boolean pets;

    public Park(String name, String ubication, int openningTime, int closingTime, boolean pets) {
        this.name = name;
        this.ubication = ubication;
        this.openningTime = openningTime;
        this.closingTime = closingTime;
        this.pets = pets;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the ubication
     */
    public String getUbication() {
        return ubication;
    }

    /**
     * @param ubication the ubication to set
     */
    public void setUbication(String ubication) {
        this.ubication = ubication;
    }

    /**
     * @return the openningTime
     */
    public int getOpenningTime() {
        return openningTime;
    }

    /**
     * @param openningTime the openningTime to set
     */
    public void setOpenningTime(int openningTime) {
        this.openningTime = openningTime;
    }

    /**
     * @return the closingTime
     */
    public int getClosingTime() {
        return closingTime;
    }

    /**
     * @param closingTime the closingTime to set
     */
    public void setClosingTime(int closingTime) {
        this.closingTime = closingTime;
    }

    /**
     * @return the pets
     */
    public boolean isPets() {
        return pets;
    }

    public boolean getPets() {
        return pets;
    }

    /**
     * @param pets the pets to set
     */
    public void setPets(boolean pets) {
        this.pets = pets;
    }

}
