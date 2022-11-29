/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.katherin.uts_no2_a_3093;

/**
 *
 * @author Katherin
 */
public class UTS_NO2_A_3093 {

    public static void main(String[] args) {
        Employess_3093 ref;
        Salaried_3093 pekerja=new Salaried_3093();
        Commission_3093 pegawai=new Commission_3093();
        Project_Planner_3093 atasan=new Project_Planner_3093();
     
        System.out.println ("DAFTAR GAJI KARYAWAN");
        System.out.println ("\n");
     
        ref=pekerja;      
        ref.setNama ("sam");
        ref.getNama();
        ref.jabatan_3093();
        ref.perhitungangaji();
        System.out.println ("\n");
     
        ref=pegawai;
        ref.setNama ("lincon");
        ref.getNama();
        ref.jabatan_3093();
        ref.perhitungangaji();
        System.out.println ("\n");
        ref=atasan;
        ref.setNama ("fani");
        ref.getNama();
        ref.jabatan_3093();
        ref.perhitungangaji();
    }
}
