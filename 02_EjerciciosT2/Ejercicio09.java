/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio09;
import bpc.daw.objetos.*;
/**
 *
 * @author usuario-mañana
 */
public class Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caja c1 = null;
        c1= new Caja("Bienvenidos al instituto");
        c1.cerrarCaja();
        System.out.println(c1.getMensaje());
        c1.abrirCaja();
        System.out.println(c1.getMensaje());
        
        
    }
    
}
