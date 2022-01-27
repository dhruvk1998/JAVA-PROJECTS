package com.company;

import java.util.Scanner;

public class GRADE_ENCRYPTION {
    public static void main(String[] args) {
        //                                                ENCRYPTION
        System.out.println("Enter your grade: ");
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        char b = (char) (a+8);
        System.out.println("\nYour Encrypted Grade is : " +b );
//                                                    DECRYPTION
        char c = (char) (a-8);
        System.out.println("\nAnd Your Decrypted Grade is : " +c );
    }
}
