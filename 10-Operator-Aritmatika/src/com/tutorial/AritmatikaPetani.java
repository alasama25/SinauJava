//Seorang petani menanam jagung manis di lahannya seluas 200 meter persegi.
//Setiap meter persegi bisa ditanami 4 batang jagung.
//Setiap batang jagung diperkirakan menghasilkan 2 tongkol jagung saat panen.
//
//Buatlah program Java yang menghitung:
//
//1. Total batang jagung yang bisa ditanam.
//
//
//2. Total hasil panen dalam bentuk jumlah tongkol jagung.
//
//
//3. Jika 1 tongkol dijual Rp3.000, berapa total pendapatan dari panen?
//
//
//
//buatin langkah langkah pengerjaannya , langkah langkahnya saja


package com.tutorial;

public class AritmatikaPetani {

    public static void main(String[] args){

        int luasLahan = 200; //m²
        int batangPerMeter = 4;
        int tongkolPerBatang = 2;
        int hargaPerTongkol = 3000;

        int totalBatang = luasLahan * batangPerMeter;
        int totalTongkol = totalBatang * tongkolPerBatang;
        int totalPendapatan = totalTongkol * hargaPerTongkol;

        System.out.println(luasLahan + " * " + batangPerMeter + " = " + totalBatang);
        System.out.println(totalBatang + " * " + tongkolPerBatang + " = " + totalTongkol);
        System.out.println(totalTongkol + " * " + hargaPerTongkol + " = " + totalPendapatan);
    }
}