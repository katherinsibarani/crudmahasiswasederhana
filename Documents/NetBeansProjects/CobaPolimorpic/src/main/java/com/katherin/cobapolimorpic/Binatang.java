/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.katherin.cobapolimorpic;

/**
 *
 * @author Katherin
 */
public abstract class Binatang {
Binatang(String jenis)
{
this.jenis=jenis;
}
protected abstract void suara(); //Deklarasi,tidak didefisikan
public String toString()
{
return "Seekor "+jenis;
}
private String jenis; 
}
