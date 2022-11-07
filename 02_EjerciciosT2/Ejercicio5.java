/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;
import bpc.daw.mario.*;
/**
 *
 * @author usuario-mañana
 */
public class Ejercicio5 {
public static void main(String[] args) {

Cañon c1 = null;

c1 = new Cañon (100,320);
c1.disparar(200,350);
c1.disparar(350,400);
System.out.println("El cañon 1 ha disparado " + c1.getTotalDisparosRealizados());
c1= new Cañon(150,300);
c1.disparar(200,350);
c1.disparar(200, 300);
c1.disparar(200, 350);
System.out.println("El cañon 2 ha disparado " + c1.getTotalDisparosRealizados());
}}
