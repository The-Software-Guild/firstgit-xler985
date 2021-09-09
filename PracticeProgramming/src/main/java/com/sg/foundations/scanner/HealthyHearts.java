package com.sg.foundations.scanner;

import java.util.Scanner;

/**
 *
 * @author xler9
 */
public class HealthyHearts {
    public static void main(String[] args) {
        int age, maxHeart, minHRZ, maxHRZ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your age?");
        age= Integer.parseInt(scanner.nextLine());
        maxHeart = 220 - age;
        System.out.println("Your maximum heart rate should be " + maxHeart + " beats per minute.");
        minHRZ = maxHeart / 2;
        maxHRZ = (int)(maxHeart * 0.85);
        System.out.println("Your target HR Zone is " + minHRZ + " - " + maxHRZ + " beats per minute.");
    }   
}
