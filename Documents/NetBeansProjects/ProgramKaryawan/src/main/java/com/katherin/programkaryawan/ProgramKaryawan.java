/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.katherin.programkaryawan;
import java.util.Scanner;

/**
 *
 * @author Katherin
 */
public class ProgramKaryawan {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
    int umur,tahunlahir,umurku,tahunmasuk,lembur;
    int angka = 2017;
    int masakerja;
    String nik,nama,alamat;
    long gapok = 0,gaji;
    long total;
                
        System.out.println("");
        System.out.println("Input Data Pegawai");
        System.out.println("===========================================");    
        System.out.print("Nama Karyawan        = ");
        nama = input.nextLine();
        System.out.print("Nip Karyawan         = ");
        nik = input.nextLine();
        System.out.print("Alamat karyawan         = ");
        alamat = input.nextLine();
        System.out.print("Tahun Lahir Karyawan = ");
        tahunlahir = input.nextInt();
        System.out.print("Tahun Masuk Karyawan = ");
        tahunmasuk = input.nextInt();
        umurku = angka-tahunlahir;
        masakerja = angka-tahunmasuk;
        System.out.println("===========================================");
        
        System.out.println("");
        System.out.println("Result Gaji karyawan");
        System.out.println("===========================================");
        System.out.println("Nama Karyawan          = "+nama);
        System.out.println("Nik Karyawan           = "+nik);
        System.out.println("Tahun Lahir Karyawan   = "+tahunlahir);
        System.out.println("Alamat karyawan      ="+alamat);
        System.out.println("Umur Karyawan Sekarang = "+umurku+ " Tahun");
        System.out.println("Tahun Masuk Kerja      = "+masakerja);
        masakerja=2017-tahunmasuk;
        System.out.print("Total Gaji             = ");
        if(masakerja<=5)
        {
            System.out.println("Rp 3.000.000");
            gaji=gapok+3000000;
        }
        else
            if(masakerja>=5)
            {
            System.out.println("Rp 6.000.000");
            gaji=gapok+6000000;
            }
        else
            {
            System.out.println("Rp.0");
            gaji=gapok+0;
            }
        System.out.println("===========================================");
        System.out.println("Gaji Karyawan = Rp."+gaji);
        System.out.println("===========================================");
    }
}
