/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.katherin.projectasuransi;

/**
 *
 * @author Katherin
 */
public class Manajer extends pegawai{

    private int gajiPokok;
    private String divisi;
    private int tunjanganJabatan;

    public int getGajiPokok() {
        return gajiPokok;
    }

    public String getDivisi() {
        return divisi;
    }

    public int getTunjanganJabatan() {
        return tunjanganJabatan;
    }
    
    public void Manajer(String nama, String NIP, String alamat, 
        int tahunMasuk, int gajiPokok, int tunjanganJabatan, String divisi) {
        this.nama = nama;
        this.NIP = NIP;
        this.alamat = alamat;
        this.tahunMasuk = tahunMasuk;
        this.gajiPokok = gajiPokok;
        this.tunjanganJabatan = tunjanganJabatan;
        this.divisi = divisi;
        
    }
    
    public int HitungGajiAkhir() {
        int gajiAkhir = gajiPokok + tunjanganJabatan;
        return gajiAkhir;
    }
    
    public void cetakManajer() {
        System.out.println("\n--Data Manajer--");
        System.out.println("Nama: " + this.nama);
        System.out.println("NIP: " + this.NIP);
        System.out.println("Alamat: " + this.alamat);
        System.out.println("Tahun Masuk: " + this.tahunMasuk);
        System.out.println("Gaji Pokok: " + this.gajiPokok);
        System.out.println("Tunjangan Jabatan: " + this.tunjanganJabatan);
        System.out.println("Divisi: " + this.divisi);
        System.out.println("Gaji Akhir: " + HitungGajiAkhir()); 
  }

    void setManajer(String adi, String string, String jl_Angsa_56, int i, int i0, int i1, String keuangan) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 }




