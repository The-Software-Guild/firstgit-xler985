package com.sg.foundations.scanner;

import java.util.Scanner;

/**
 *
 * @author xler9
 */
public class PassingTheTuringTest {
    public static void main (String[] args) {
        String userName, userColor, userFood, userNum;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi! What's your name?");
        userName = scanner.nextLine();
        System.out.println("Hey " + userName + "! My name's Philip!");
        System.out.println("What's your favorite color, " + userName + "?");
        userColor = scanner.nextLine();
        System.out.println(userColor + " is an amazing color! Black is my favorite color!");
        System.out.println("Speaking of colors, I've been craving an orange. What's your favorite food?");
        userFood = scanner.nextLine();
        System.out.println("Ooh, I could really go for soPme " + userFood + "! I could even eat 7 servings!");
        System.out.println("You can tell 7 is my favorite number! What number is your favorite?");
        userNum = scanner.nextLine();
        System.out.println(userNum +" is a cool number! You're such a cool person!");
        System.out.println("Alright, I gotta head out but I hope you have a great day! Goodbye!");
    }   
    
}
