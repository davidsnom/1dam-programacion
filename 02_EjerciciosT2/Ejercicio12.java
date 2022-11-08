/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;
import bpc.daw.objetos.*;
/**
 *
 * @author usuario-mañana
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MarcadorBaloncesto m1=null;
        m1= new MarcadorBaloncesto("Estudiantes","CB Granada");
        
        
        m1.anotarCanasta('L', 2);
        m1.anotarCanasta('V', 3);
        m1.anotarCanasta('L', 2);
        m1.anotarCanasta('V', 2);
        m1.anotarCanasta('V', 3);
        m1.anotarCanasta('L', 1);
        m1.anotarCanasta('L', 1);
        m1.anotarCanasta('V', 2);
        
        
        
        String e="Estudiantes";
        String g= "CB Granada";
        System.out.println(m1);
        System.out.println("El equipo ganador es "+g);
        System.out.println("El equipo perdedor es "+e);
    }
    
}
