/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio07;
import bpc.daw.objetos.*;
/**
 *
 * @author usuario-mañana
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DepositoAgua d1 = null;
         d1 = new DepositoAgua(15,50);
         d1.dibujar();
        int max = (50);
        int ini = (15);
        float porcentage;
         porcentage = ((ini*100)/max);
        System.out.println("El tanto por ciento de ocupacion es "+porcentage+"%");
       
    }
    
}
