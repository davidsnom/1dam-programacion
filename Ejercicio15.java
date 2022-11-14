/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;
import java.util.Scanner;
/**
 *
 * @author usuario-mañana
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String clave ="123";
        
        System.out.println("introduce contraseña: ");
        String Entrada = new Scanner(System.in).nextLine();
        
        System.out.println("¿Es la misma clave? "+Entrada.equals(clave));
    }
    
}
