/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;
import bpc.daw.objetos.*;
import java.util.*;
/**
 *
 * @author usuario-mañana
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("dime una frase.");
        String frase = new Scanner(System.in).nextLine();
        
        System.out.println("La letra que esta en medio de la frase. "+frase.charAt(frase.length()/2));
    
    }
    
}
