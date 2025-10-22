package com.tutorial;

public class Main {

    public static void  main(String[] args) {

        //unary = operasi yang dilakukan pada satu variable

        //unary + dan -
        int angka = 1;
        System.out.printf("unary '+', %d menjadi %d\n",angka, +angka);
        System.out.printf("unary '-', %d menjadi %d\n",angka, -angka);

        //unary decrement dan incrementt
        int angka2 = 10;

        angka2++;
        System.out.println("nilai dengan '++' menjadi = " + angka2); //decrement

        int angka3 = 10;
        angka3--;
        System.out.println("nilai dengan '--' menjadi = " + angka3); //intcremnt

        int a = 5;
        System.out.printf("nilai dengan '++' prefix menjadi = %d \n", ++a); //di tambah sebelum

        int b = 5;
        System.out.printf("nilai dengan '++' postfix menjadi = %d \n", b++); //di tambah di akhir
        System.out.printf("nilai dengan '++' postfix menjadi = %d \n", b);

        //unary boolean dengan ! untuk negasi
        boolean ucup = true;
        System.out.println("nilai dengan boolean = " + ucup);
        System.out.println("nilai dengan boolean = " + !ucup); //tanda seru untuk negasi
    }
}
