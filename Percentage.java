package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Write a program to calculate a percentage of a given student. His marks from 5 subjects must be taken as input from the keyboard.
        //(Marks are out of 100)
        // write your code here
        System.out.println("Enter the Marks obtained by the Student :");
        Scanner sc = new Scanner(System.in);
        System.out.println("Marks In English");
        int a = sc.nextInt();
        System.out.println("Marks In Hindi");
        int b = sc.nextInt();
        System.out.println("Marks In Maths");
        int c = sc.nextInt();
        System.out.println("Marks In Science");
        int d = sc.nextInt();
        System.out.println("Marks In Social Studies");
        int e = sc.nextInt();

        int TtlMrks = a+b+c+d+e;
        System.out.println("Your Total Marks are= " +TtlMrks);

        float percentage =(float) TtlMrks/500*100;
        System.out.println("Your Total Percentage is:" +percentage+"%");
    }
}
