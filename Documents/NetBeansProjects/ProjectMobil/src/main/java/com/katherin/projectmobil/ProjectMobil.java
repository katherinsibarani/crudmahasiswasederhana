/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.katherin.projectmobil;

/**
 *
 * @author Katherin
 */
public class ProjectMobil {

    public static void main(String[] args) {
       System.out.println("sedan");

        Sedan h = new Sedan();
        h.tampilkan();

        System.out.println("\nminibus");

        Minibus t = new Minibus();
        t.tampilkan();

        System.out.println("\nBus");
        
        Bus z = new Bus();
        z.tampilkan();
    }
}
