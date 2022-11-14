/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio18;

import java.util.Scanner;

/**
 *
 * @author usuario-mañana
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           System.out.println("Dime tu correo electronico");
        String c = new Scanner(System.in).nextLine();
        
       int numero = c.indexOf("@");
       String nombre = c.substring(0,numero);
       String dominio = c.substring(numero+1,c.length());
       
       System.out.println("El nombre es; "+nombre);
       System.out.println("El dominio es; "+dominio);
    }
    
}
