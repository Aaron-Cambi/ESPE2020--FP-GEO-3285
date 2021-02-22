/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz12.pkg02.pkg2020;

import java.util.Scanner;

/**
 *
 * @author Eduardo Cambi
 */
public class Quiz12022020 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Eduardo Cambi");
        Scanner input = new Scanner(System.in);
        int person = 0;
        int[] numbersPersons;
        String[] namePersons;
        int[] agePersons;
        int persons;
        int ages;
        int age;
        String name;
        String names;

       // System.out.println("enter numbers os customer");
        // persons = input.nextInt();

       // numbersPersons = new int[persons];

        //for (int i = 0; i < persons; i++) {
          //  System.out.println("enter name of the customer " + (i + 1));
            //name = input.nextLine();

            //solution

            
        //}
         
        System.out.println("Enter numbers of customer");
            person = input.nextInt();
            
            namePersons = new String[person];
            agePersons = new int[person];
            for(int i = 0 ; i < person; i++){
                input.nextLine();
                System.out.print("please enter name customer " + i + "-> ");
                namePersons[i] = input.nextLine();
                System.out.print("please enter " + namePersons[i] + "for ages -> ");
                agePersons[i] = input.nextInt();
            }
            System.out.println("Name -> \t ages");
            for(int i = 0   ; i < person; i++){
                System.out.println(namePersons[i] + " -> \t "+ agePersons[i]);
            }
    }

}
