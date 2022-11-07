/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio01;

import bpc.daw.mario.Cañon;
import bpc.daw.mario.Luigi;
import bpc.daw.mario.Mario;
import bpc.daw.mario.Planta;
import bpc.daw.mario.Seta;

/**
 *
 * @author usuario-maÃ±ana
 */
public class Ejercicio04 {
      public static void main(String[] args) {
          Mario m1 = null;
Luigi l1 = null;
Seta s1 = null;
Cañon c1 = null;
Planta p1 =null;

m1 = new Mario (540,500);
double distancia = m1.getDistanciaOrigen();
System.out.println("Mario esta en " + distancia);
l1 = new Luigi(500,500);
double distanciaa = l1.getDistanciaOrigen();
System.out.println("luigi esta en " + distanciaa);

}
}