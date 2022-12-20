/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.katherin.relasi;

/**
 *
 * @author Katherin
 */
public class Pegawai {
    private String nama;
    private String NIP;
    public Pegawai()
    {
    System.out.println("Konstruktor pegawai dijalankan...");
    }
    public Pegawai(String NIP, String nama)
    {
    this.NIP=NIP;
    this.nama=nama;
    System.out.println("Konstruktor pegawai dijalankan...");
    }
    public void tampilPeg()
    {
    System.out.println("NIP : "+NIP+" ,Nama : "+nama);
    }  
}
