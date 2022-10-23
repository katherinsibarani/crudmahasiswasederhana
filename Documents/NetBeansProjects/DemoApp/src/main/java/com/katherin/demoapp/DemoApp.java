/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.katherin.demoapp;

/**
 *
 * @author Katherin
 */
public class DemoApp {

    public static void main(String[] args) {
         int jumlah_looping=5;
       int bil1=5;
       int bil2=2;
       DemoObjectOriented Demo = new DemoObjectOriented();
       Demo.helloWorld(jumlah_looping);
        System.out.println("\n-pemanggilan fungsi tambah-\n");
        System.out.println("hasil operasi tambah:"+Demo.tambah(bil1,bil2)+"\n");
    }
}
