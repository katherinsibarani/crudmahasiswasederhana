/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.katherin.projectphonetrial;
import java.util.Scanner 
/**
 *
 * @author Katherin
 */
public class ProjectPhoneTrial {

    public static void main(String[] args) {
       private Phone phone;

    public ProjectPhoneTrial(Phone phone){
        this.phone = phone;
    }

    void turnOnThePhone(){
        this.phone.powerOn();
    }
    void turnOffThePhone(){
        this.phone.powerOff();
    }
    void makePhoneLouder(){
        this.phone.volumeUp();
    }
    void makePhoneSilent(){
        this.phone.volumeDown();
    }
}
