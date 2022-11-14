/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio19;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author usuario-mañana
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.println("Escribe la ruta de un archivo");
        String nombre = new Scanner(System.in).nextLine();
        
        File ruta = new File(nombre);
        
        System.out.println("El peso del archivo es "+ruta.length()+(" bytes"));
        System.out.println("El peso del archivo es "+(ruta.length()*1.0/1024)/1024+(" Megabytes"));
        
    }
    
}
