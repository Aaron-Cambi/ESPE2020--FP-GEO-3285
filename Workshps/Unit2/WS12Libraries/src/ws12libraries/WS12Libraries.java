/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws12libraries;

/**
 *
 * @author Eduardo Cambi
 */
public class WS12Libraries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float squareRoot = 0.0F;
        float number = 0.0F;
        float power = 0.0F;
        float base = 0.0F;
        float exponent = 0.0F;
        float a;
        float absoluteValue;

        number = 9;  //squareRoot -> 3
        squareRoot = (float) Math.sqrt((float) number);
        System.out.println("the square root of -> " + number + " is " + squareRoot);

        number = 49; //7
        squareRoot = (float) Math.sqrt((float) number);
        System.out.println("the square root of -> " + number + " is " + squareRoot);

        number = 5; //2.23
        squareRoot = (float) Math.sqrt((float) number);
        System.out.println("the square root of -> " + number + " is " + squareRoot);

        base = 3;
        exponent = 2;

        power = (float) Math.pow(base, exponent);
        System.out.println(power);

        base = 2;
        exponent = 4; // calculator 78
        power = (float) Math.pow(base, exponent);
        System.out.println(base + "^" + exponent + "is" + power);

        base = 78;
        exponent = 5;
        power = (float) Math.pow(base, exponent);
        System.out.println(power);

        absoluteValue = getAbsoluteValue(number);
        number = -5;
        absoluteValue = getAbsoluteValue(number);
        System.out.println("absolut Value of -> " + number + " is " +absoluteValue );

        number = 5;
        absoluteValue = getAbsoluteValue(number);
        System.out.println("absolut Value of -> " + number + " is " +absoluteValue );
    }
 public static float computePower(float base, float exponent) {
        float power;
        power = 0.0F;

        for (int i = 1; i <= (int) exponent; i++) {
            power = power * base;
        }
        return power;
    }
    private static float getAbsoluteValue(float number) {
        if(number < 0){
            return -number;
        }else{
            return number;
        }
//        if (number < 0) {
//            number = number * -1;
//            return number;
//        }
//        return number;
    }
}
