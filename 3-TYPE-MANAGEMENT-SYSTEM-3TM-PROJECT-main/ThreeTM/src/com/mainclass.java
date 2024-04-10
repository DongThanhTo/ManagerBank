/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com;
import javax.swing.*;
/**
 *
 * @author mssrs
 */
public class mainclass {
      public static void main(String args[]){
         
          splash mj = new splash();
          mj.setVisible(true);
          try{
        for(int i=0;i<=100;i++){
            Thread.sleep(50);
         mj.loadbar.setValue(i);
         
        }
        new mainJframe().setVisible(true);
        mj.setVisible(false);
          }catch (Exception e){
              
          }}
      }



