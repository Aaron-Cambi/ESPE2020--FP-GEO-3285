/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solution.quiz;

import java.util.Scanner;

/**
 *
 * @author Eduardo Cambi
 */
public class SolutionQuiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                System.out.println("Eduardo Cambi");
        Scanner input = new Scanner(System.in);
        int person;
        int[] numbersPersons;
        String[] namePersons;
        int[] agePersons;
        System.out.println("Enter numbers of customer");
            person = input.nextInt();
            
            namePersons = new String[person];
            agePersons = new int[person];
            for(int i = 0 ; i < person; i++){
                input.nextLine();
                System.out.print("please enter name customer " + i + "-> ");
                namePersons[i] = input.nextLine();
                System.out.print("please enter " + namePersons[i] + " for ages -> ");
                agePersons[i] = input.nextInt();
            }
            System.out.println("Name -> \t ages");
            for(int i = 0   ; i < person; i++){
                System.out.println(namePersons[i] + " -> \t "+ agePersons[i]);
            }
    }
    
}
