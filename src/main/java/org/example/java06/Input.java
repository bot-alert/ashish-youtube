package org.example.java06;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        System.out.println("What is your name?");
//
//        String name = scanner.nextLine();
//
//
//        System.out.println("Hello " + name + " welcome to our youtube code channel");

        System.out.println("Please enter a number A : ");

        int a = scanner.nextInt();

        System.out.println("Please enter a number B : ");

        int b = scanner.nextInt();

        int result = a + b;

        System.out.println("Sum of two numbers is : " + result);
    }

}
