/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.katherin.projectemployee;

/**
 *
 * @author Katherin
 */
public abstract class Employer {
    String nama;
    String jabatan_3093;
    double gajibersih_3093;
    double gajikotor_3093;
    double gajipokok_3093;
    double uangmakan_3093;
 
    public Employer()
    {
        gajipokok_3093=1500000.0;
    }
 
    public void setNama (String name)
    {
        this.nama=name;
    }
 
    public String getNama()
    {
        System.out.println ("Nama Karyawan : " +nama);
        return nama;
    }
 public String jabatan_3093()
    {
        System.out.println ("Posisi Jabatan : " +jabatan_3093);
        return jabatan_3093;
    }
 
    public abstract double perhitungangaji();  
}

