/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.katherin.relasi;

/**
 *
 * @author Katherin
 */
public class Relasi {

    public static void main(String[] args) {
       Perusahaan Per = new Perusahaan("Nusantara Jaya");
       Pegawai Peg1, Peg2, Peg3,Peg4;
       Peg1 = new Pegawai("P001","Rudi");
       Peg2 = new Pegawai("P002","Toni");
       Peg3 = new Pegawai("P003","Ani");
       //Relasi antara Class Pegawai dengan Class Perusahaan
       Per.insertPegawai(Peg1);
       Per.insertPegawai(Peg2);
       Per.insertPegawai(Peg3);
       System.out.println();
       Per.tampilPer();
    }
}
