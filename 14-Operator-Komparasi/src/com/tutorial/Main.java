package com.tutorial;

public class Main {

    public static void main(String[] args) {

        // Operator Komparasi....ini akan menghasilkan nilai dalam bentuk boolean

        int a,b;
        boolean hasilKomparasi;

        //Operator persamaan atau equal
        System.out.println("=====PERSAMAAN=====");
        a = 10;
        b = 10;
        hasilKomparasi = (a == b);
        System.out.printf("%d == %d --> %s \n",a,b,hasilKomparasi);

        a = 11;
        b = 10;
        hasilKomparasi = (a == b);
        System.out.printf("%d == %d --> %s \n\n",a,b,hasilKomparasi);


        //Operator pertidaksamaan atau not equal
        System.out.println("=====PERTIDAKSAMAAN=====");
        a = 10;
        b = 10;
        hasilKomparasi = (a != b);
        System.out.printf("%d != %d --> %s \n",a,b,hasilKomparasi);

        a = 11;
        b = 10;
        hasilKomparasi = (a != b);
        System.out.printf("%d != %d --> %s \n\n",a,b,hasilKomparasi);


        //Operator kurang dari atau less than
        System.out.println("=====KURANG DARI=====");
        a = 9;
        b = 10;
        hasilKomparasi = (a < b);
        System.out.printf("%d < %d --> %s \n",a,b,hasilKomparasi);

        a = 11;
        b = 10;
        hasilKomparasi = (a < b);
        System.out.printf("%d < %d --> %s \n\n",a,b,hasilKomparasi);


        //Operator lebih dari atau greater than
        System.out.println("=====LEBIH DARI=====");
        a = 10;
        b = 10;
        hasilKomparasi = (a > b);
        System.out.printf("%d > %d --> %s \n",a,b,hasilKomparasi);

        a = 11;
        b = 10;
        hasilKomparasi = (a > b);
        System.out.printf("%d > %d --> %s \n\n",a,b,hasilKomparasi);


        //Operator kurang dari sama dengan atau less than equal
        System.out.println("=====KURANG DARI SAMA DENGAN=====");
        a = 9;
        b = 10;
        hasilKomparasi = (a <= b);
        System.out.printf("%d <= %d --> %s \n",a,b,hasilKomparasi);

        a = 10;
        b = 10;
        hasilKomparasi = (a <= b);
        System.out.printf("%d <= %d --> %s \n",a,b,hasilKomparasi);

        a = 11;
        b = 10;
        hasilKomparasi = (a < b);
        System.out.printf("%d <= %d --> %s \n\n",a,b,hasilKomparasi);


        //Operator lebih dari sama dengan atau greater than Eequal
        System.out.println("=====LEBIH DARI SAMA DENGAN=====");
        a = 9;
        b = 10;
        hasilKomparasi = (a >= b);
        System.out.printf("%d >= %d --> %s \n",a,b,hasilKomparasi);

        a = 10;
        b = 10;
        hasilKomparasi = (a >= b);
        System.out.printf("%d >= %d --> %s \n",a,b,hasilKomparasi);

        a = 11;
        b = 10;
        hasilKomparasi = (a >= b);
        System.out.printf("%d >= %d --> %s \n\n",a,b,hasilKomparasi);

    }
}
