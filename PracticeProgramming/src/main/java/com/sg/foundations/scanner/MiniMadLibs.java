package com.sg.foundations.scanner;

import java.util.Scanner;

/**
 *
 * @author xler9
 */
public class MiniMadLibs {
    public static void main (String[] args) {
        String word1, word2, word3, word4, word5, word6, word7, word8, word9, word10;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's Play MadLibs!");
        System.out.println("I need a noun!: ");
        word1= scanner.nextLine();
        System.out.println("Now an adjective!: ");
        word2= scanner.nextLine();
        System.out.println("Give me a noun: ");
        word3= scanner.nextLine();
        System.out.println("I need a number: ");
        word4= scanner.nextLine();
        System.out.println("Another adjective, sir or madam: ");
        word5= scanner.nextLine();
        System.out.println("A plural noun is required: ");
        word6= scanner.nextLine();
        System.out.println("Another pural noun: ");
        word7= scanner.nextLine();
        System.out.println("And another plural noun: ");
        word8= scanner.nextLine();
        System.out.println("A verb (infinitive form): ");
        word9= scanner.nextLine();
        System.out.println("Lastly, the same verb as before but in past participle: ");
        word10= scanner.nextLine();
        
        System.out.println("*** NOW LETS GET MAD (libs) ***");
        System.out.print(word1 + ": the " + word2 + " frontier. These are the voyages of the starship " 
                + word3 + ". Its " + word4 + "-year mission: to explore strange " + word5 + " " 
                + word6 + ", to seek out " + word5 + " " + word7 + " and " + word5 + " "+ word8 + 
                ", to boldly "+ word9 +" where no one has "+ word10 +" before.");
    }
    
}
