package com.tutorial;
import java.util.*;
public class Main {

    public static void main(String[] args) {

        // a operator b
        Scanner userInput;
        float a, b, hasil;
        char operator;

        userInput = new Scanner(System.in);

        System.out.print("masukkan nilai pertama = ");
        a = userInput.nextFloat();
        System.out.print("masukan operator = ");
        operator = userInput.next().charAt(0);
        System.out.print("masukkan nilai kedua = ");
        b = userInput.nextFloat();

        System.out.println("input user = " + a + " " + operator + " " + b);

        // operator tersedia +,-,*,/

        if (operator == '+'){
            // penjumlahan
            hasil = a + b;
            System.out.println("hasil = " + hasil);
        } else if (operator == '-'){
            // pengurangan
            hasil = a - b;
            System.out.println("hasil = " + hasil);
        } else if (operator == '*'){
            //perkaliam
            hasil = a * b;
            System.out.println("hasil = " + hasil);
        } else if (operator == '/'){
            // pembagian ( dengan if bersarang )
            if (b == 0){
                System.out.println("pembagian 0 menghasilkan tak terhingga");
            } else {
                hasil = a / b;
                System.out.println("hasil = " + hasil);
            }
        } else {
            System.out.println("operator tidak ditemukan");
        }

    }
}
