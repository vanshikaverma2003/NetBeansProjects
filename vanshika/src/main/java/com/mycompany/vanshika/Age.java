/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.vanshika;

/**
 *
 * @author shri shivay
 */
public class Age{
    int a;
    public void    display()
            

    {
        System.out.println("Value of a + 18 ");
        
    }
    @SuppressWarnings("empty-statement")
    public static void main (String args[])
{
    int age=18;
    try{
        
        if(age>18)
        throw new Myexception("true");
        
        else 
        { 
            throw new Myexception ("false");
        }
    }
    catch (Myexception myexception)
    {
     System.out.println("my exception"+myexception);
     System.out.println("my exception with get message"+myexception.getMessage);
    }}
}
