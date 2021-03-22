/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws22modularcalculator;

import java.util.Scanner;
import utils.Basic_Operation;

/**
 *
 * @author Eduardo Cambi
 */
public class WS22ModularCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float operand1;
        float operand2;
        float sum;
        float result;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter two numbers");
        operand1 = input.nextFloat();
        operand2 = input.nextFloat();

        System.out.println("----ADDITION----");
        result = Basic_Operation.addTwoNumbers(operand1, operand2);
        System.out.println(operand1 + " + " + operand2 + " = " + result);

        System.out.println("--SUBTRACTION---");
        result = Basic_Operation.subtractTwoNumbers(operand1, operand2);
        System.out.println(operand1 + " - " + operand2 + " = " + result);

        System.out.println("----MULTIPLICATION----");
        result = Basic_Operation.multiplyTwoNumbers(operand1, operand2);
        System.out.println(operand1 + " * " + operand2 + " = " + result);
        
        System.out.println("----DIVISION----");
        result = Basic_Operation.divideTwoNumbers(operand1, operand2);
        System.out.println(operand1 + " / " + operand2 + " = " + result);
    }

}
