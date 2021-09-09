package com.sg.foundations.scanner;

import java.util.Scanner;

/**
 *
 * @author xler9
 */
public class AllTheTrivia {
    public static void main(String[] args) {
        String trivia1, trivia2, trivia3, trivia4;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name the US’s largest state:");
        trivia1= scanner.nextLine();
        System.out.println("Which planet has the most gravity?");
        trivia2= scanner.nextLine();
        System.out.println("How many weeks are in a year?");
        trivia3= scanner.nextLine();
        System.out.println("How many Earths could fit inside the sun?");
        trivia4= scanner.nextLine();
        
        System.out.println("\nWow, I didn't know that there were " + trivia4 + " days in a year!");
        System.out.println("It's crazy that the planet with the most gravity is " + trivia1 +"!");
        System.out.println("The largest state in the US is " + trivia2 + ". Didn't know that!");
        System.out.println("You can fit " + trivia3 + " Earths inside the sun!? I never knew!");
    }
}
