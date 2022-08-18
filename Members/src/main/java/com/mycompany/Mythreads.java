/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.members;

/**
 *
 * @author shri shivay
 */
public class Mythreads implements Runnable {
@Override
public void run(){
    for(int i=0;i<100;i++)
    
    System.out.print("This is runnable thread");
    }
public static void main (String [] args) throws InterruptedException{
    
    Mythreads mythreads=new Mythreads();
    Thread thread = new Thread(mythreads);
    thread.start();
    thread.sleep(3);
    
    
}

    }