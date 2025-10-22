package com.tutorial;

public class JagungManis {
    public static void main(String[] args) {
        // data lahan dan produktivitas
        int luasLahan = 200; // dalam meter persegi
        int batangPerMeter = 4;
        int tongkolPerBatang = 2;
        int hargaPerTongkol = 3000;

        // perhitungan
        int totalBatang = luasLahan * batangPerMeter;
        int totalTongkol = totalBatang * tongkolPerBatang;
        int totalPendapatan = totalTongkol * hargaPerTongkol;

        // output
        System.out.println("=== Perhitungan Panen Jagung Manis ===");
        System.out.println("Luas Lahan: " + luasLahan + " m²");
        System.out.println("Total Batang Jagung: " + totalBatang);
        System.out.println("Total Tongkol Jagung: " + totalTongkol);
        System.out.println("Total Pendapatan: Rp" + totalPendapatan);
    }
}
