/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws10.fuctions;

/**
 *
 * @author Eduardo Cambi
 */
public class WS10Fuctions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int divd = 5;
        int divr = 10;
        float quotient = 0;
        int x = 0;
        int y = 0;
        
        quotient = divideTwoNumbers(5, 10);
        System.out.println("Quotient of 5 and 10 is -->" + quotient);       
        y = f(3);
        System.out.println("3^2 = " + y);
        
        y = f(-3);
        System.out.println("3^2 = " + y);
        
        x = -1;
        y = f(x);
        System.out.println("the square of -> " + y + " <-");
    }

    public static float divideTwoNumbers(int diviend, int divisor) {
        float quotient = 0.0F;

        quotient = (float) diviend / divisor;

        return quotient;
    }

    public static int f(int x) {
        int y = 0;
        y = x * x;
        return y;
    }

    public static int g(int x) {
        int y = 0;
        y = x * x;
        return y;
    }
}