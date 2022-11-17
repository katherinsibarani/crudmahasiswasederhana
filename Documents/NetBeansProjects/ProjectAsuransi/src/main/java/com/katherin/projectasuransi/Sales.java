/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.katherin.projectasuransi;

/**
 *
 * @author Katherin
 */
public class Sales extends pegawai{

    private int gajiPokok;
    private int jumlahPelanggan;

    Sales() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public int getJumlahPelanggan() {
        return jumlahPelanggan;
    }
    
    public void setSales(String nama, String NIP, String alamat, 
            int tahunMasuk, int gajiPokok, int jumlahPelanggan) {
        this.nama = nama;
        this.NIP = NIP;
        this.alamat = alamat;
        this.tahunMasuk = tahunMasuk;
        this.gajiPokok = gajiPokok;
        this.jumlahPelanggan = jumlahPelanggan;
    }
    
    public int HitungGajiAkhir() {
        int gajiAkhir = gajiPokok + (50000 * jumlahPelanggan);
        return gajiAkhir;
    }
public void cetakSales() {
        System.out.println("\n--Data Sales--");
        System.out.println("Nama: " + this.nama);
        System.out.println("NIP: " + this.NIP);
        System.out.println("Alamat: " + this.alamat);
        System.out.println("Tahun Masuk: " + this.tahunMasuk);
        System.out.println("Gaji Pokok: " + this.gajiPokok);
        System.out.println("Jumlah Pelanggan yang Direkrut: " 
                + this.jumlahPelanggan);
        System.out.println("Gaji Akhir: " + HitungGajiAkhir());
    }

    Sales(String wibisana, String string, String jl_Ayam_78, int i, int i0, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}
