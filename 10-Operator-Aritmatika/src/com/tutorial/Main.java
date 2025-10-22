package com.tutorial;


public class Main {
    public static void main (String[] args){

        //Operasi Aritmatika
        int v1 = 29;
        int v2 = 3;

        int hasil;

        //Penjumlahan
        hasil = v1 + v2;
        System.out.println(v1 + " + " + v2 + " = " + hasil);

        //Pengurangan
        hasil = v1 - v2;
        System.out.printf("%d - %d = %d \n",v1,v2,hasil);

        //Perkalian
        hasil = v1 * v2;
        System.out.printf("%d * %d = %d \n",v1,v2,hasil);

        //Pembagian
        hasil = v1 / v2;
        System.out.printf("%d / %d = %d \n",v1,v2,hasil);

        float a = 9;
        float b = 5;
        float c = 9;
        float d = 8;
        float e = 3;
        float f = 8;
        float hasilFloat = a+b-c/d*e%f;
        System.out.println(a + " + " + b + " - " + c + " / " + d + " * " + e + " % " + f + " = " + hasilFloat);

        //Modulus
        hasil = v1 % v2;
        System.out.printf("%d %% %d = %d \n",v1,v2,hasil);


    }

}
