package com.sg.foundations.scanner;

import java.util.Scanner;

/**
 *
 * @author xler9
 */
public class BiggerBetterAdder {
    public static void main(String[] args) {
        int num1, num2, sum;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the first number?");
        num1= Integer.parseInt(scanner.nextLine());
        System.out.println("What is the second number?");
        num2= Integer.parseInt(scanner.nextLine());
        sum = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + sum);
    } 
}
