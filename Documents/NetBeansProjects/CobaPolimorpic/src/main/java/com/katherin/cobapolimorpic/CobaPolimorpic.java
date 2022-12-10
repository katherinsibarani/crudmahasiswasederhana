/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.katherin.cobapolimorpic;

/**
 *
 * @author Katherin
 */
import java.util.Random;
public class CobaPolimorpic {

    public static void main(String[] args) {
    Binatang[] peliharaanku={new Burung("Kakak Tua"),
    new Kambing("Etawa"),
    new Anjing("Kintamani"),
    new Kucing("Anggora")};
    Binatang kesayangan;
    Random pilihan=new Random();
    //memilih secara acak
    kesayangan=peliharaanku[pilihan.nextInt(peliharaanku.length)];
    //mengacak bilangan dari 0 sampai length-1 atau (i-1).
    System.out.println("Binatang Kesayangan anda :"+kesayangan);
    System.out.print("Suaranya : ");
    kesayangan.suara();

    }
}
