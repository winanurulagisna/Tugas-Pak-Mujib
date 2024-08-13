/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab15soa1;

/**
 *
 * @author winan
 */
public class Bab15soa1 {

    public static void main(String[] args) {
       // Membuat objek dari class Kalkulator
        Kalkulator kalkulator = new Kalkulator();

        // Menggunakan method pengurangan
        int hasilPengurangan = kalkulator.pengurangan(20, 10);
        System.out.println("Hasil Pengurangan: " + hasilPengurangan);

        // Menggunakan method pembagian
        float hasilPembagian = kalkulator.pembagian(20.0f, 10.0f);
        System.out.println("Hasil Pembagian: " + hasilPembagian);

        // Menggunakan method perkalian
        float hasilPerkalian = kalkulator.perkalian(20.0f, 10.0f);
        System.out.println("Hasil Perkalian: " + hasilPerkalian);
    }
}

