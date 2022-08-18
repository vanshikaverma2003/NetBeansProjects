/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.project1;

import java.util.Scanner;

/**
 *
 * @author shri shivay
 */
public class Project1 implements Calculate {
    int a;
    int r;
    int b;

    public static void main(String[] args) {
        Project1 project=new Project1();
               project.getValues();
               project.calculateArea();

    }

    @Override
    public void calculateArea() {
        System.out.println("Area of reactangle=  "+(a*b));
        System.out.println("Area of square= " +(a*a));
        System.out.println("Area of Circle=  " +(pie*r*r));
    }

    @Override
    public void getValues() {
   Scanner sc=new Scanner (System.in);
   System.out.print("Enter a= ");
           a=sc.nextInt();
   System.out.print("Enter b= ");
           b=sc.nextInt();
   System.out.print("Enter r= ");
    r=sc.nextInt();
    }
    
}
