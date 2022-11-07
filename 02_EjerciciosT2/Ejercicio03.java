/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01;

import bpc.daw.mario.*;
/**
 *
 * @author usuario-maÃ±ana
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
Mario m1 = null;
Luigi l1 = null;
Seta s1 = null;
Cañon c1 = null;
Planta p1 =null;

m1 = new Mario (100,100);
m1.saltar();
m1 = new Mario(640,320);
m1.saltar();
s1= new Seta (0,0);
s1.andarHacia(0, 0);
c1= new Cañon (100,320);
c1.disparar(200,200);
p1=new Planta(400,500);
p1.comer(true);
p1= new Planta (450,500);
p1.comer(true);
p1= new Planta (500,500);
p1.comer(true);
l1 = new Luigi(200,200);
m1=new Mario(250,200);
m1.correrHacia(250, 1000);
c1= new Cañon (800,380);
c1.disparar(100,380);



















}
    
}
