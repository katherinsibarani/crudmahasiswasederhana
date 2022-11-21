/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.katherin.projectmobil;

/**
 *
 * @author Katherin
 */
public class Minibus extends Mobil{
 public void tampilkan(){
 double besarsilinder;
 String bahanbakar;
 String kategori;
 int kapasitasPenumpang=6;
 int kapasitasBagasi=160;

 besarsilinder=32.5;
 bahanbakar="solar";
 kategori="off-road";

 Mobil m = new Mobil();

 m.inputData("AVANZA", "Merah", "Ekonomis", 5);
 m.tampilkandata();

   System.out.println("silinder :"+besarsilinder);
   System.out.println("jenis bahan bakar :"+bahanbakar);
   System.out.println("jenis kategori :"+kategori);
   System.out.println("kapasitas penumpang :"+kapasitasPenumpang);
   System.out.println("kapasitas bagasi :"+kapasitasBagasi);
}
}
