/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11;
import bpc.daw.objetos.*;
/**
 *
 * @author usuario-mañana
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caja c1 = null;
        Caja c2 = null;
        c1= new Caja("Hola que tal?");
        c2 = new Caja("Hola a todos");
       c1.abrirCaja();
       c2.abrirCaja();
       String m1 = c1.getMensaje();
       String m2 = c2.getMensaje();
       System.out.println("El mensaje de la primera caja es "+m1);
       System.out.println("El mensaje de la segunda caja es "+m2);
        boolean Cambio = c1.cambiarMensaje(m2);
       boolean Cambiob = c2.cambiarMensaje(m1);
       m1=c1.getMensaje();
       m2=c2.getMensaje();
       System.out.println("El mensaje de la caja 1 ahora es "+m1);
       System.out.println("El mensaje de la caja 2 ahora es "+m2);
       
    }
    
}
