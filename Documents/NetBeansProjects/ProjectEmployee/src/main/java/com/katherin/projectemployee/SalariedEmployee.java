/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.katherin.projectemployee;

/**
 *
 * @author Katherin
 */
public class SalariedEmployee extends Employer {
  double uangmakan;
  double tunjangankinerja;
 
    public SalariedEmployee()
    {
        jabatan_3093="salaried employee";
        uangmakan_3093=500000.0;
        tunjangankinerja=500000.0;
    }
 
    public double perhitungangaji()
    {
        double potongan;
        gajikotor_3093=gajipokok_3093+uangmakan_3093+tunjangankinerja;
        potongan=(10.0/100.0)*gajikotor_3093;
        gajibersih_3093=gajikotor_3093-potongan;
     
        System.out.println ("Gaji Pokok : " +gajipokok_3093);
        System.out.println ("Uang Makan : " +uangmakan_3093);
        System.out.println ("Tunjangan Kinerja : " +tunjangankinerja);
        System.out.println ("Gaji Kotor : " +gajikotor_3093);
        System.out.println ("Potongan : " +potongan);
        System.out.println ("Gaji Bersih : " +gajibersih_3093);
     
        return gajibersih_3093;
    } 
}
