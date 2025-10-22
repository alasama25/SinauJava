package com.tutorial;

import java.util.Scanner;

public class AritmatikaDasar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input dari user
        System.out.print("Masukkan nilai a: ");
        int a = input.nextInt();

        System.out.print("Masukkan nilai b: ");
        int b = input.nextInt();

        // Operasi dasar
        int tambah = a + b;
        int kurang = a - b;
        int kali = a * b;
        int bagi = a / b;
        int mod = a % b;

        // Ekspresi gabungan
        int ekspresi = (a + b) * (a - b) / a % b;

        // Output
        System.out.println("\nHasil penjumlahan: " + tambah);
        System.out.println("Hasil pengurangan: " + kurang);
        System.out.println("Hasil perkalian: " + kali);
        System.out.println("Hasil pembagian: " + bagi);
        System.out.println("Hasil modulus: " + mod);
        System.out.println("Hasil ekspresi gabungan: " + ekspresi);

        // Penjelasan (komen aja, gak tampil)
        // ekspresi = (a + b) * (a - b) / a % b
        // Langkah:
        // 1. Hitung (a + b)
        // 2. Hitung (a - b)
        // 3. Kali hasil keduanya
        // 4. Bagi dengan a
        // 5. Modulus dengan b
    }
}
