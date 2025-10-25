package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main (String[] args){

        // switch case

        String input;
        Scanner userInput = new Scanner(System.in);
        System.out.println("====MENU====\n1.Ayam Geprek\n2.Mie Ayam\n3.Bakso\n");
        System.out.print("pilih menu dengan angka = ");
        input = userInput.next();

        // ekspresinya berupa satuan (int, long, byte, short), String, atau enum
        switch(input){
            case "1":
                System.out.println("\nAyam Geprek tersedia, silahkan memesan");
                break;
            case "2":
                System.out.println("\nMaaf Mie Ayam tidak tersedia");
                break;
            case "3":
                System.out.println("\nBakso tersedia, silahkan memesan");
                break;
            default:
                System.out.println("\nmenu tidak ada");
        }



    }

}
