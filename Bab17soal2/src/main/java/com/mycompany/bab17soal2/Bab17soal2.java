/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab17soal2;

/**
 *
 * @author winan
 */
public class Bab17soal2 {

    public static void main(String[] args) {
        String[][] negaraIbukota = {
            {"Indonesia", "Jakarta"},
            {"Jepang", "Tokyo"},
            {"Iran", "Teheran"},
            {"Malaysia", "Kuala Lumpur"},
            {"Thailand", "Bangkok"}
        };

        // Loop melalui array untuk menampilkan output
        for (int i = 0; i < negaraIbukota.length; i++) {
            System.out.println("Ibukota " + negaraIbukota[i][0] + " adalah " + negaraIbukota[i][1]);
        }
    }
}