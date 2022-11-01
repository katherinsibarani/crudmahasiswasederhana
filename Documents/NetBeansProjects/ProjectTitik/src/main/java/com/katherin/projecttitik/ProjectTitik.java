/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.katherin.projecttitik;

import java.util.Scanner;

/**
 *
 * @author Katherin
 */
public class ProjectTitik {

    public static void main(String[] args) {
        // TODO code application logic here
        Titik t1 = new Titik();
        t1.setX(1);
        t1.setY(6);
        
        Scanner keyboard = new Scanner(System.in); //scanner 
        
        System.out.println("Menampilkan info kelas titik t1 :");
        System.out.println(t1.getKoordinat());
        
        Titik t2 = new Titik(10, 6);
        System.out.println("Menampilkan info kelas titik t2 :");
        System.out.println(t2.getKoordinat());
        
        System.out.println("Jarak dua titik P: " + Titik.hitJarak(t1, t2));
        
     
 
        
    }
}
