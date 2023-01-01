/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.katherin.crudkontak.controllers;

import com.katherin.crudkontak.Conection.Koneksi;
import com.katherin.crudkontak.interfaces.interfaceKontak;
import com.katherin.crudkontak.models.Kontak;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Katherin
 */
public class ControllerKontak implements interfaceKontak {
   PreparedStatement ps;

//    public ControllerKontak() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
    
    @Override
    public Kontak insert(Kontak kontak) throws SQLException {
        ps=Koneksi.getConnection().prepareStatement("INSERT INTO kontak (nama, telepon, alamat) VALUES (?,?,?)");
        ps.setString(1, kontak.getNama());
        ps.setString(2, kontak.getTelepon());
        ps.setString(3, kontak.getAlamat());
        ps.executeUpdate();
        ps.close();
        
        return kontak; 
    }
    
//    @Override
    @Override
    public void update(Kontak kontak) throws SQLException {
        ps=Koneksi.getConnection().prepareStatement("UPDATE kontak SET nama=?, telepon=?, alamat=? WHERE id=?");
        ps.setString(1, kontak.getNama());
        ps.setString(2, kontak.getTelepon());
        ps.setString(3, kontak.getAlamat());
        ps.setInt(4, kontak.getId());
        ps.executeUpdate();
        ps.close();
        
         
    }
    
    @Override
    public void delete(int id) throws SQLException{
        
        ps = Koneksi.getConnection().prepareStatement("DELETE FROM kontak WHERE id=?");
        ps.setInt(1, id);
        ps.executeUpdate();
        ps.close();
    }
    
    
    @Override
    public List<Kontak> getAll() throws SQLException {
        
        Statement st = Koneksi.getConnection().createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM kontak");
        List<Kontak> dataKontak = new ArrayList<>();
        
        while(rs.next()) {
            
            Kontak kontak = new Kontak();
            kontak.setId(rs.getInt("ID"));
            kontak.setNama(rs.getString("Nama"));
            kontak.setTelepon(rs.getString("Telepon"));
            kontak.setAlamat(rs.getString("Alamat"));
            dataKontak.add(kontak);
        }
        return dataKontak;
    } 
}
