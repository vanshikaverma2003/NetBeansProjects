/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.members;

/**
 *
 * @author shri shivay
 */
public class Myclass {
public static void main(String[] args) {
    try{
        throw new Myexception("This is Exception");
        
    }
catch(Myexception myexception)
{
    System.out.println("Exception" +myexception.getMessage());

}
}



    
}
