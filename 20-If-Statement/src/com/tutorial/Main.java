package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        int a,b;

        // tutorial untuk if statement atau percabangan

        System.out.print("masukkan nilai a = ");
        a = userInput.nextInt();

        System.out.print("masukkan nilai b = ");
        b = userInput.nextInt();

        // ini adalah percabangan

        if ( a > b ){
            System.out.println("nilai a lebih besar dari nilai b");
        } else {
            System.out.println("nilai b lebih besar dari nilai a");
        }

    }
}
