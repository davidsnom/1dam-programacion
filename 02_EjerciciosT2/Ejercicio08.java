/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio08;
import bpc.daw.objetos.*;
/**
 *
 * @author usuario-mañana
 */
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       DepositoAgua d1 = null;
       DepositoAgua d2 =null;
       d1 = new DepositoAgua(15,20);
       d1.dibujar();
       d2= new DepositoAgua(5,20);
       d2.dibujar();
       d1.retirarLitro();
       d1.retirarLitro();
       d1.retirarLitro();
       d1.retirarLitro();
       d1.retirarLitro();
       d2.añadirLitro();
       d2.añadirLitro();
       d2.añadirLitro();
       d2.añadirLitro();
       d2.añadirLitro();
       d1.dibujar();
       d2.dibujar();
    }
    
}
