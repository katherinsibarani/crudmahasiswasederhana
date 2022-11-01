/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.katherin.projecttitik;

import java.util.Scanner;

/**
 *
 * @author Katherin
 */
public class Titik {
     private double x;
    private double y;
    
    public Titik() {
    }

    public Titik(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public String getKoordinat() {
        return "("+x+","+y+")";
    }
    
    public static double hitJarak(Titik t1, Titik t2) {
        double dx = t1.x - t2.x;
        double dy = t1.y - t2.y;
        return Math.sqrt(dx * dx + dy * dy);
        
    }
    
    public Titik(Titik t1, Titik t2) {
        x = (t1.x + t2.x) / 2;
        y = (t1.y + t2.y) / 2;
    }
}
