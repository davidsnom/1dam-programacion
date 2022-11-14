/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17;

import java.util.Scanner;

/**
 *
 * @author usuario-mañana
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      System.out.println("Dime tu nombre");
        String n = new Scanner(System.in).nextLine();
        
        System.out.println("dime tu dominio?");
        String d = new Scanner(System.in).nextLine();
        
       if( d.endsWith(".es") || d.endsWith(".com")){
           String correo = n+"@"+d;
           System.out.println("Tu correo es: "+correo);
       }else{
           System.out.println("El dominio es incorrecto");
       }
    }
    
}
