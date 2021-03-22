/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taxdeclaration;

import ec.edu.espe.tax.BasicTax;
import java.util.Scanner;

/**
 *
 * @author Eduardo Cambi
 */
public class TaxDeclaration {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float price;
        float totalPrice;
        float ivaValue;
        final float ivaPorcentage = 12;

        Scanner input = new Scanner(System.in);

        System.out.println("---Eduardo Cambi Taxes");
        System.out.println("Enter price of yopur prduct");
        price = input.nextFloat();

        ivaValue = BasicTax.computeIva(price, ivaPorcentage);
        System.out.println("IVA--> " + ivaValue);
        totalPrice = ivaValue + price;
        System.out.println("The price is -> " + totalPrice);
    }

}
