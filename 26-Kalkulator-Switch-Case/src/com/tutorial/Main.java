package com.tutorial;
import java.util.*;
public class Main {

    public static void main(String[] args) {

        Scanner input;
        float a,b,hasil;
        String operator;

        input = new Scanner(System.in);

        System.out.print("masukkan angka pertama = ");
        a = input.nextFloat();
        System.out.print("masukkan operator (+,-,*,/) = ");
        operator = input.next();
        System.out.print("masukkan angka kedua = ");
        b = input.nextFloat();

        switch (operator){
            case "+":
                //penjumlahan
                hasil = a + b;
                System.out.println("hasil = " + hasil);
                break;
            case "-":
                //pengurangan
                hasil = a - b;
                System.out.println("hasil = " + hasil);
                break;
            case "*":
                //perkalian
                hasil = a * b;
                System.out.println("hasil = " + hasil);
                break;
            case "/":
                //pembagian
                hasil = a / b;
                System.out.println("hasil = " + hasil);
                break;
            default:
                System.out.println("operator " + operator + " tidak ditemukan");
        }


    }

}
