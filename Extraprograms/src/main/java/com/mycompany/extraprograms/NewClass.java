/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.extraprograms;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author shri shivay
 */
public class NewClass {
    public static void main(String [] args){
        File file = new File("java.txt");
        try{
            
            if(file.exists()==false){
                file.createNewFile();
                FileWriter fw= new FileWriter("java.txt");
                fw.write("This is my javafile");
                fw.close();
            }
            
            Scanner sc=new Scanner(file);
            while(sc.hasNextLine()){
                
                System.out.println(sc.nextLine());
                
            }
            
    
        }catch(Exception ex){}
    }
    
}
