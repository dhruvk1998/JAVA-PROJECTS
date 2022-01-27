package com.company;
import javax.swing.*;
import java.net.PasswordAuthentication;
import java.util.Scanner;
import java.util.Locale;
import java.io.*;
public class Test_App01 {
    public static void main(String[] args) {
        System.out.println("Enter Login ID: ");
        Scanner sc = new Scanner(System.in);
        String st = sc.next();

        System.out.println("Enter Password: ");
        Scanner z = new Scanner(System.in);
        String p = z.next();
        if (p.startsWith("Dhruv"))
        {
            for(int i=0; i<5; i++)

                System.out.println("*****");

            System.out.println("Welcome " + st);
            //                                                ENCRYPTION
            System.out.println("Enter your grade: ");
            Scanner grd = new Scanner(System.in);
            char a = grd.next().charAt(0);
            char b = (char) (a + 8);
            System.out.println("\nYour Encrypted Grade is : " + b);
//                                                    DECRYPTION
            System.out.println("\nAnd Your Decrypted Grade is : " + a);
            }
        else
            System.out.println("You are not Authorised");

    }
}