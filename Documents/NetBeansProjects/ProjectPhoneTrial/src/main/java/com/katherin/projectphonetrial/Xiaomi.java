/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.katherin.projectphonetrial;

/**
 *
 * @author Katherin
 */
public class Xiaomi implements Phone {
   private int volume;
    private boolean IspowerOn;
    public Xiaomi(){
    this.volume = 25;
    }
    @Override
    public void powerOn(){
        IspowerOn = true;
        System.out.println("selamat datang");
    }
    @Override
    public void powerOff(){
        IspowerOn = false;
        System.out.println("selamat tinggal");
    }
    @Override
    public void volumeUp(){
        if (IspowerOn){
            if (this.volume == MAX_VOLUME){
                System.out.println("volume sudah full");
  } else{
                this.volume += 10;
                System.out.println("volume sekarang " + this.getvolume());
            }
        }else{
            System.out.println("error");
        }
 }