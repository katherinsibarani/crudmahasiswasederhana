/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.katherin.cobapolimorpic;

/**
 *
 * @author Katherin
 */
public class Burung extends Binatang{
 Burung(String nama)
{
super("Burung");
this.nama=nama;
}
public void suara()
{
System.out.println("berkicau");
}
public String toString()
{
return super.toString()+" "+nama;
}
private String nama;  
}
