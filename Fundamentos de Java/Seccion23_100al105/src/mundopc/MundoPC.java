/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundopc;

import com.gm.mundopc.*;

/**
 *
 * @author Jesus
 */
public class MundoPC {

    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP", 13);
        Teclado tecladoHP = new Teclado("cable", "HP");
        Raton ratonHP = new Raton("bluetooth", "HP");

        //relacion de agregacion, lo estamos agregando a la clase computadora
        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP);

        Monitor monitorGamer = new Monitor("Gamer", 13);
        Teclado tecladoGamer = new Teclado("bluetooth", "Gamer");
        Raton ratonGamer = new Raton("bluetooth", "Gamer");

        //relacion de agregacion, lo estamos agregando a la clase computadora
        Computadora computadoraGamer = new Computadora("Computadora Gamer", monitorGamer, tecladoGamer, ratonGamer);
        
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraGamer);
        
        orden1.mostrarOrden();
    }
}
