/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.members;

/**
 *
 * @author shri shivay
 */
public class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println("Thread is running");
        
    }

public static void main(String [] args)    {
    MyThread mythread=new MyThread();
    mythread.start();
    
}
}