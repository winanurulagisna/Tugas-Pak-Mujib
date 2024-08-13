/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab5soal2;

/**
 *
 * @author winan
 */
import java.util.Scanner;
public class Bab5soal2 {

    public static void main(String[] args) {
       Scanner myInput = new Scanner(System.in);
        System.out.println("Masukan Nama Anda:");
        // String input
        String name = myInput.nextLine();
        // Numerical input
        System.out.println("Masukan Usia Anda:");
        int age = myInput.nextInt();
        System.out.println("Masukan Gaji Anda:");
        double salary = myInput.nextDouble();
        // Output input by user
        System.out.println(" Nama : " + name);
        System.out.println("Usia: " + age);
        System.out.println("Gaji: " + salary);
    }
}
