/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws13.task;

import java.util.Scanner;

/**
 *
 * @author Eduardo Cambi
 */
/**
 *
 * @author Eduardo Cambi
 */
public class WS13Task {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        float polygon;
        float sides;
        float apothem;
        float valueP;
        float circle;
        float radius;
        float circularCrown;
        float majorRadius;
        float minorRadius;
        final double pi = 3.141592;
        float finalSpeed;
        float initialVelocity;
        float aceleration;
        float time;
        float force;
        float bulk;
        float weight;
        int option;
        int option1;
        int option2;
        System.out.println("Eduardo Cambi" + "\n" + "taks" + "\n");
        do {
            System.out.println("1. Calculation of Areas");
            System.out.println("2. Calculation physics formulas");
            System.out.println("0. Exit");
            option = input.nextInt();
            System.out.println("");
            switch (option) {
                case 1:
                    do {

                        System.out.println("1. Area of the Polygon");
                        System.out.println("2. Area of the Circle");
                        System.out.println("3. Area of the Circular Crown");
                        System.out.println("0. Return to main menu");
                        option1 = input.nextInt();
                        System.out.println("");
                        switch (option1) {
                            case 1:
                                System.out.println("Area of the Polygon");
                                System.out.println("Enter the number of sides ");
                                sides = input.nextInt();
                                System.out.println("Enter the value of sides ");
                                System.out.print("cm -> ");
                                valueP = input.nextInt();
                                System.out.println("Enter the value of apothem ");
                                System.out.print("cm -> ");
                                apothem = input.nextInt();
                                polygon = showCalculationOfPolygon(sides, apothem, valueP);
                                System.out.println("The Area of the Polygon of " + sides + "sides si equal to -> " + polygon + " cm^2" + "\n");
                                break;
                            case 2:
                                System.out.println("Area of the Circle");
                                System.out.println("Enter value of the radius");
                                System.out.print("cm -> ");
                                radius = input.nextInt();
                                circle = (float) showCalculationOfCircle(radius, pi);
                                System.out.println("Area of the circle radius of " + radius + " es equal -> " + circle + " cm^2" + "\n");
                                break;
                            case 3:
                                System.out.println("Area of the Circular Crown");
                                System.out.println("Enter value of the major radius");
                                System.out.print("cm -> ");
                                majorRadius = input.nextInt();
                                System.out.println("Enter value of the minor radius");
                                System.out.print("cm -> ");
                                minorRadius = input.nextInt();
                                circularCrown = (float) showCalculationOfCircularCrown(majorRadius, minorRadius, pi);
                                System.out.println("Area of the Circular Crown is equal -> " + circularCrown + " cm^2" + "\n");
                                break;
                        }
                    } while (option1 != 0);
                    break;
                case 2:
                    do {
                        System.out.println("1. Calculation final Speed");
                        System.out.println("2. Calculation acelaration");
                        System.out.println("3. Calculation of the weight");
                        System.out.println("0. Return to main menu");
                        option2 = input.nextInt();
                        System.out.println("");
                        switch (option2) {
                            case 1:
                                System.out.println("Calculation final Speed");
                                System.out.println("Enter value of the initial velocity");
                                System.out.print("m/s -> ");
                                initialVelocity = input.nextInt();
                                System.out.println("Enter value of the acelaration");
                                System.out.print("m^2/s -> ");
                                aceleration = input.nextInt();
                                System.out.println("Enter value of the time");
                                System.out.print("seconds ->");
                                time = input.nextInt();
                                finalSpeed = showFinalSpeed(initialVelocity, aceleration, time);
                                System.out.println("The final speed is equial -> " + finalSpeed + " m/s");
                                break;
                            case 2:
                                System.out.println(" Calculation acelaration");
                                System.out.println("Enter force");
                                force = input.nextFloat();
                                System.out.println("Enter bulk");
                                bulk = input.nextFloat();
                                aceleration = getAcceleration(force, bulk);
                                System.out.println("The aceleration is:" + aceleration + "m/s^2");
                                break;
                            case 3:
                                System.out.println(" Calculation of the weight");
                                System.out.println("Enter bulk");
                                bulk = input.nextFloat();
                                weight = showCalculationWeight(bulk);
                                System.out.println("The weight" + weight + "kg");
                                break;
                        }
                    } while (option2 != 0);
                    break;
            }
        } while (option != 0);
        System.out.println("Good bay");
    }

    private static float showCalculationWeight(float bulk) {
        float total;
        total = (float) (bulk * 9.8);
        return total;
    }

    private static float getAcceleration(float force, float bulk) {
        float aceleration;
        aceleration = force / bulk;
        return aceleration;
    }

    static float showCalculationOfPolygon(float sides, float apothem, float value) {
        float total;
        float areaP;
        total = sides * value * apothem;
        areaP = total / 2;
        return areaP;
    }

    static double showCalculationOfCircle(float radius, double pi) {
        double area;
        area = (radius * radius) * pi;
        return area;
    }

    static double showCalculationOfCircularCrown(float majorRadius, float minorRadius, double pi) {
        double area;
        double total;
        total = (majorRadius * majorRadius) - (minorRadius * minorRadius);
        area = pi * total;
        return area;

    }

    static float showFinalSpeed(float initialVelocity, float aceleration, float time) {
        float finalSpeed;
        finalSpeed = initialVelocity - (aceleration * time);
        return finalSpeed;
    }

}
