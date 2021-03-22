/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws21funtion;

import java.util.Scanner;

/**
 *
 * @author Eduardo Cambi
 */
public class WS21Funtion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner input = new Scanner(System.in);
       float download;
       float files;
       float time;
       double performance;
        System.out.println("AUTOR: EDUARDO CAMBI");
        System.out.println("Calculate download time of files");
        System.out.println("Enter download speed");
        System.out.print("M ->");
        download = input.nextFloat();
        System.out.println("Enter the weight of the files");
        System.out.print("Mb");
        files = input.nextInt();
       time =  (float) calculateDownloadTime(download, files);
        System.out.println("download time is -> " + time + "seconds");
        System.out.println("MPIS performance");
        System.out.println("Enter the number of files to open ");
        files = input.nextInt();
        System.out.println("Enter the time it takes to open the files");
        System.out.print("seconds -> ");
        time = input.nextFloat();
        performance = calculateProcessorPerformance(files, time);
        System.out.println("processor performance is " + performance + "files / seconds");
    }
    public static double calculateDownloadTime(float download, float files){
        float time;
        time = (float) files / download;
    return time;
    }
    public static float calculateProcessorPerformance(float files, float time){
        float performance;
        performance =  files / time;
        return performance;
    }
}
