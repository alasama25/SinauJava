package com.tutorial;

public class Main {
    public static void main(String[] args){

        //program untuk konversi data

        int nilaiInt = 89;
        System.out.println("hasil nilaiIntltt = " + nilaiInt);

        //memperlias rentang ke tipe data lebih besar

        long nilaiLong = nilaiInt;
        System.out.println("hasil nilaiLong = " + nilaiLong);

        //memperkecil rentang tipe data lebih keci
        byte nilaiByte = (byte) nilaiInt;
        System.out.println("hasil nilaiByte = " + nilaiByte);
        System.out.println("hasil max byte = " + Byte.MAX_VALUE);
        System.out.println("hasil min byte = " + Byte.MIN_VALUE);

        //casting pembagian
        float a = (int)10;
        int b = 4;

        float c = a/b;
        System.out.printf("%f / %d = %f\n",a,b,c);

        int x = 10;
        int y = 4;

        float z = (float) x/y;
        System.out.printf("%d / %d = %f\n",x,y,z);

    }
}
