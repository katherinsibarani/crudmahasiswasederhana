/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.katherin.projectemployee;

/**
 *
 * @author Katherin
 */
public class ProjectEmployee {

    public static void main(String[] args) {
        Employer ref;
        SalariedEmployee pekerja=new SalariedEmployee();
        CommisionEmployee pegawai=new CommisionEmployee();
        ProjectPlanner atasan=new ProjectPlanner(); 
     
        System.out.println ("DAFTAR GAJI KARYAWAN");
        System.out.println ("\n");
     
        ref=pekerja;      
        ref.setNama ("linda");
        ref.getNama();
        ref.jabatan_3093 ();
        ref.perhitungangaji();
        System.out.println ("\n");
        ref=pegawai;
        ref.setNama ("pilla");
        ref.getNama();
        ref.jabatan_3093();
        ref.perhitungangaji();
        System.out.println ("\n");
        ref=atasan;
        ref.setNama ("leticia");
        ref.getNama();
        ref.jabatan_3093();
        ref.perhitungangaji();
    }
}
