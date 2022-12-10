/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.katherin.cobapolimorpic;

/**
 *
 * @author Katherin
 */
public class Kambing extends Binatang {
 Kambing(String nama)
{
super("Kambing");
this.nama=nama;
}
public void suara()
{
System.out.println("mengembik");
}
public String toString()
{
return super.toString()+" "+nama;
}
private String nama;
    
}
