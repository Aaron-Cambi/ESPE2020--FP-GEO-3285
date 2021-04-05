/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Eduardo Cambi
 */
public class FileManager {

    public static boolean createFile(String fileName) {
        boolean created = false;
        try {
            File file = new File(fileName + ".txt");
            if (file.createNewFile()) {
                System.out.println("file was created");

                created = true;
            } else {
                System.out.println("file already exists");
                created = false;

            }
        } catch (IOException ex) {
            ex.printStackTrace();
            created = false;

        }
        return created;
    }

    public static boolean save(String data, String fileName) {
        boolean saved = false;

        createFile(fileName);

        try {
            FileWriter myWrite = new FileWriter(fileName + ".csv", true);
            myWrite.write(System.getProperty("line.separator") + data);
            myWrite.close();
            System.out.println("a new record of " + fileName + " was saved");
            saved = true;
        } catch (IOException ex) {
            ex.printStackTrace();
            saved = false;
        }

        return saved;
    }
public static int returnSize(String fileName) {
        int numberOfLines = 0;

        try {

            Scanner s = new Scanner(new File(fileName));
            while (s.hasNextLine()) {
                numberOfLines++;
            }

        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        }
        return numberOfLines;

    }

       public static String[] read(String fileName) {
        int numberOfLines = returnSize(fileName);
        String results[] = null;
        int counter = 0;
        try {
            Scanner s = new Scanner(new File(fileName));

            results = new String[numberOfLines];
            while (s.hasNextLine()) {
                results[counter] = s.nextLine();
            }

        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        }
        return results;
    }
public static int countLines(String fileName) {
        BufferedReader br = null;
        int numberOfLines = 0;
        try {

            File file = new File(fileName + ".csv");
            br = new BufferedReader(new FileReader(file));
            try {
                while ((br.readLine()) != null) {
                    numberOfLines++;
                }
            } catch (IOException ex) {
                Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
            }
            return numberOfLines;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return numberOfLines;
    }
public static void readLines(String fileName, String[] results) {
        int counter = 0;
        try {
            File myObj = new File(fileName + ".csv");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                results[counter++] = data;
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}

