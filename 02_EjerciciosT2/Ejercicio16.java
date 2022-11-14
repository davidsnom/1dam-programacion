/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;

import java.util.Scanner;

/**
 *
 * @author usuario-mañana
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Escribe una frase. ");
         String f1 = new Scanner(System.in).nextLine();
        
        System.out.println("Escribe otra frase. ");
        String f2 = new Scanner(System.in).nextLine();
        
       int numero = f1.indexOf(f2);
       
       if(numero == -1){
           System.out.println("¿El texto 2 está incluido en el texto 1? False");
       }else{
           System.out.println("¿El texto 2 está incluido en el texto 1? True");
    }
    
    }
}

    
    

