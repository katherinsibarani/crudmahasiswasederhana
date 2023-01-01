/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.katherin.crudkontak.models;

/**
 *
 * @author Katherin
 */
public class Kontak {
  private int Id;
    private String Nama;
    private String Telepon;
    private String Alamat;
    
    public Kontak(){
        
    }
    
    public Kontak(int Id, String Nama, String Telepon, String Alamat){
        this.Id = Id;
        this.Nama = Nama;
        this.Telepon = Telepon;
        this.Alamat = Alamat;
    }

    public int getId() {
        return Id;
    }

    public String getNama() {
        return Nama;
    }

    public String getTelepon() {
        return Telepon;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public void setNama(String nama) {
        this.Nama = nama;
    }

    public void setTelepon(String telepon) {
        this.Telepon = telepon;
    }

    public void setAlamat(String alamat) {
        this.Alamat = alamat;
    }  
}
