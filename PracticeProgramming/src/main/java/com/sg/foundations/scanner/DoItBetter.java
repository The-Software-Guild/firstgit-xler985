package com.sg.foundations.scanner;

import java.util.Scanner;

/**
 *
 * @author xler9
 */
public class DoItBetter {
    public static void main(String[] args) {
        int achiev1, achiev2, achiev3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many miles can you run?");
        achiev1= Integer.parseInt(scanner.nextLine());
        System.out.println("Well, I can run " + ((achiev1*2) + 1) + " miles, hah!");
        System.out.println("How many hot dogs can you eat?");
        achiev2= Integer.parseInt(scanner.nextLine());
        System.out.println("Well, I can eat " + ((achiev2*2) + 1) + " hot dogs, hmph!");
        System.out.println("How many languages do you know?");
        achiev3= Integer.parseInt(scanner.nextLine());
        System.out.println("Well, I know and speak in " + ((achiev3*2) + 1) + " languages!");
    }
    
}
