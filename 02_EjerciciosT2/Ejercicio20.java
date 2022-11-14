/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio20;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author usuario-mañana
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Di la ruta de un archivo");
        String nombre = new Scanner(System.in).nextLine();
        
        File ruta = new File(nombre);
        
        if (ruta.exists()&& ruta.isDirectory()){
            System.out.println("La ruta corresponde a un directorio");
        }else{
            if(ruta.exists()&& ruta.isFile()){
                System.out.println("El tamaño es  "+ruta.length()+" bytes");
                System.out.println("¿Quiere borrarlo? (si/no");
                String validacion = new Scanner(System.in).nextLine();
                if( validacion.equals("si")){
                    ruta.delete();
                    if(ruta.delete()){
                        System.out.println("No se ha podido borrar el archivo.");
                    }else{
                       System.out.println("Se ha borrado"); 
                    }
                }else{
                    System.out.println("Se ha cancelado la accion de borrar el archivo.");
                }
            }
        }
        
          
    }
    }
    

