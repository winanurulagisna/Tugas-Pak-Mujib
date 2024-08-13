/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab14soal1;
// Kelas abstrak
abstract class AbstrakHewan {
    public abstract void suara();
    public void suara2() {
        System.out.println("Ini method konkrit dari parent class");
    }
}
class Kucing extends AbstrakHewan {
    @Override
    public void suara() {
        System.out.println("Meow");
    }
}
class Anjing extends AbstrakHewan {
    @Override
    public void suara() {
        System.out.println("Woof");
    }
}
/**
 *
 * @author winan
 */

public class Bab14soal1 {
    public static void main(String[] args) {
        AbstrakHewan kucing = new Kucing();
        AbstrakHewan anjing = new Anjing();
        
        System.out.println("Kucing:");
        kucing.suara();  
        kucing.suara2(); 
        
        System.out.println("Anjing:");
        anjing.suara();  
        anjing.suara2(); 
    }
}
