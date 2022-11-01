/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.katherin.projectbank;
import java.util.Scanner;

/**
 *
 * @author Katherin
 */
public class Bank {
    Scanner baca =new Scanner(System.in);
    double saldo = 0;

    void cekSaldo() {
        System.out.println("Saldo Anda Saat ini adalah sebesar :Rp." + saldo + "-.");
    }
 
    void ambilUang(double am) {
        System.out.println("Anda Akan Mengambil Sejumlah :Rp." + am + "-.");
        transaksi(am);
    }
 
    void tambahUang(double tb) {
        System.out.println("Anda Menambah Uang Sejumlah :Rp." + tb + "-.");
        this.saldo += tb;
    }
    void transfer(){
        System.out.print("Masukkan Rekening Tujuan : ");String no=baca.next();
        System.out.print("Masukkan Jumlah Kiriman  : ");int nominal=baca.nextInt();
        System.out.println("Anda Akan Mentransfer Sejumlah "+nominal+ " ke rekening "+no);
        System.out.print("Apakah benar data tsb? (y/n)");char l=baca.next().charAt(0);
        if(l=='y'){
            System.out.println("Transaksi sedang diproses");
            transaksi(nominal);
    }else{
            System.out.println("Transaksi Dibatalkan User");
        }
    }
 public double transaksi(double tr) {
        if (this.saldo < tr) {
            System.out.println("Transaksi Tidak Dapat dilanjutkan \nUang anda Tidak Mencukupi untuk Transaksi ini\nSisa Saldo anda sebesar Rp. " + this.saldo);
        } else {
            System.out.println("Transaksi Berhasil");
            return this.saldo -= tr;
        }
        return this.saldo;
 }
}
    
