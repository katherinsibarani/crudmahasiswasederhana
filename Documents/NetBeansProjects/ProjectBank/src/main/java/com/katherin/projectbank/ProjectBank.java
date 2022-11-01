/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.katherin.projectbank;

import java.util.Scanner;

/**
 *
 * @author Katherin
 */
public class ProjectBank {

    public static void main(String[] args) {
       Scanner baca = new Scanner(System.in);
        Bank ProjectBank = new Bank();
        System.out.println("Selamat Datang Di Bank Bank Tut");
        int pilih;
        do {
            System.out.println("----------------");
            System.out.println("-Daftar Layanan-");
            System.out.println("1.Cek Saldo");
            System.out.println("2.Transfer Saldo");
            System.out.println("3.Ambil Uang");
            System.out.println("4.Tambah Saldo");
            System.out.println("5.Exit");
            System.out.print("Masukkan Pilihan : ");
            pilih = baca.nextInt();
            System.out.println("----------------");
            switch (pilih) {
                case 1:
                    ProjectBank.cekSaldo();
                    break;
                case 2:
                    ProjectBank.transfer();
                    break;
                case 3:
                    System.out.print("Masukkan Uang yang Anda Ambil: Rp.");
                    double am = baca.nextDouble();
                    ProjectBank.ambilUang(am);
                    break;
                case 4:
                    System.out.print("Masukkan Uang yang Anda Tambah: Rp.");
                    double tb = baca.nextDouble();
                    ProjectBank.tambahUang(tb);
                    break;
                case 5:
                    System.out.println("Terimakasih Sudah Menggunakan Layanan Kami");
                    break;
                default:
                    System.out.println("Layanan Tidak tersedia");
            }
        }while (pilih != 5);
    }
}
 
 
