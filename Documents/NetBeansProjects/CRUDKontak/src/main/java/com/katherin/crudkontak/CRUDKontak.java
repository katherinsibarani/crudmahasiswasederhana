/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.katherin.crudkontak;

import com.katherin.crudkontak.Frame.FrameKontak;

/**
 *
 * @author Katherin
 */
public class CRUDKontak {

    public static void main(String[] args) {
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               FrameKontak form =  new FrameKontak();
               form.setLocationRelativeTo(null);
               form.setVisible(true);
            }
        });
    }
}
