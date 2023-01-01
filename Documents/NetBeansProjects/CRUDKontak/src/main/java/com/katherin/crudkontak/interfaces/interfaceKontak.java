/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.katherin.crudkontak.interfaces;

import com.katherin.crudkontak.models.Kontak;
import com.mysql.cj.x.protobuf.MysqlxCrud.Insert;
import java.util.List;
import java.sql.SQLException;

/**
 *
 * @author Katherin
 */
public interface interfaceKontak {
    //Operasi Add/Insert/Tambah data
    Kontak insert(Kontak k) throws SQLException;
    
    //Operasi Update/Ubah data
    void update(Kontak k) throws SQLException;
    
    //Operasi Delete/Hapus data
    void delete(int id) throws SQLException;
    
    //Operasi getAll/Tampilkan seluruh data
    List<Kontak> getAll() throws  SQLException;  
}
