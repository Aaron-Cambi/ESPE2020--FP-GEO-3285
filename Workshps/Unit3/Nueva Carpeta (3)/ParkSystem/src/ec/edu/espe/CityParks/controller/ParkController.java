/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.CityParks.controller;

import ec.edu.espe.CityParks.model.Park;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import utils.FileManager;

/**
 *
 * @author Eduardo Cambi
 */
public class ParkController {

    public void save(Park park) {
        String data = park.getName() + ";" + park.getUbication() + ";" + park.getOpenningTime() + ";" + park.getClosingTime() + ";" + park.getPets();
        FileManager.save(data, "Parks");
    }

    public void read(String[] data, Park[] parks) {

        FileManager.readLines("Parks", data);
        for (int i = 0; i < data.length; i++) {
            String[] dataForPark = data[i].split(", ");
            String name = dataForPark[0];
            String ubication = dataForPark[1];
            int open = Integer.parseInt(dataForPark[2]);
            int close = Integer.parseInt(dataForPark[3]);
            boolean isPets = Boolean.parseBoolean(dataForPark[4]);

            parks[i] = new Park(name, ubication, open, close, isPets);
        }
    }

    public int find(Park[] parks, String name) {
        for (int i = 0; i < parks.length; i++) {
            if (name.equals(parks[i].getName())) {
                return i;
            }
        }
        return -1;
    }

    public void populateChickensTable(JTable jTable, Park[] parks) {

        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
         Object rowData[] = new Object[parks.length];
        for (int i = 0; i < parks.length; i++) {
            rowData[0] = parks[i].getName();
            rowData[1] = parks[i].getUbication();
            rowData[2] = parks[i].getOpenningTime();
            rowData[3] = parks[i].getClosingTime();
            rowData[4] = parks[i].isPets();
            model.addRow(rowData);
        }

    }
}

