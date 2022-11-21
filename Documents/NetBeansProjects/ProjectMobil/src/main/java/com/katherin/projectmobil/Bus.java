/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.katherin.projectmobil;

/**
 *
 * @author Katherin
 */
public class Bus extends Mobil{
   public void tampilkan(){
     double besarsilinder=5.5;
     String bahanbakar="Pertamax";
     String kategori="Sport";
     int kapasitasPenumpang=4;
     int kapasitasBagasi=120;

     Mobil m = new Mobil();

     m.inputData("CRV", "Hitam", "Mewah", 4);
     m.tampilkandata();

      System.out.println("silinder :"+besarsilinder);
      System.out.println("jenis bahan bakar :"+bahanbakar);
      System.out.println("jenis kategori :"+kategori);
      System.out.println("kapasitas penumpang :"+kapasitasPenumpang);
      System.out.println("kapasitas bagasi :"+kapasitasBagasi);
    
}     
}
