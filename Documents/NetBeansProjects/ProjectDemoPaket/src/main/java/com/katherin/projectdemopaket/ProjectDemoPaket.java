/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.katherin.projectdemopaket;

/**
 *
 * @author Katherin
 */
public class ProjectDemoPaket {

    public static void main(String[] args) {
      Paket a=new Paket("Pemrograman Berorientasi Objek",
      "Benyamin Langgu Sinaga",60000,"700 MB",50000);
       a.hitungHargaPaket();
       a.cetakPaket();
    }
}
