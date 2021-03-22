/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.util.Scanner;

/**
 *
 * @author Eduardo Cambi
 */
public class Basic_Operation {

    public static float addTwoNumbers(float addend1, float addend2) {
        float sum = 0;
        sum = addend1 + addend2;
        return sum;
    }

    public static float subtractTwoNumbers(float minuend, float sustraend) {
        float subtraction;
        subtraction = minuend - sustraend;
        return subtraction;
    }

    public static float multiplyTwoNumbers(float operand1, float operand2) {
        float multiplication;
        multiplication = operand1 * operand2;
        return multiplication;
    }

    public static float divideTwoNumbers(float dividend, float divider) {
        float division;
        division = dividend / divider;
        return division;
    }
}
