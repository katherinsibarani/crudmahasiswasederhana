/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.katherin.cobapolimorpic;

/**
 *
 * @author Katherin
 */
public class Anjing extends Binatang {
Anjing(String nama)
{
super("Anjing");
this.nama=nama;
}
public void suara()
{
System.out.println("menggongong");
}
public String toString()
{
return super.toString()+" "+nama;
}
private String nama;  
}
