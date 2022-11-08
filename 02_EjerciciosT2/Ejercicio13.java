/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;
import java.util.Scanner;
/**
 *
 * @author usuario-mañana
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Escribe tu nombre");
        String nombre = new Scanner(System.in).nextLine();
        System.out.println(nombre);
        System.out.println("Tu nombre en mayusculas:"+nombre.toUpperCase());
        System.out.println("Tu nombre en minusculas:"+nombre.toLowerCase());
        System.out.println("Total de caracteres de tu nombre:"+nombre.length());
        
        

        
        
            
    }
    
}
