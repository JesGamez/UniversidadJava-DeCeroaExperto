/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import domain.Empleado;

/**
 *
 * @author Jesus
 */
public class TestClaseObject {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Jesus", 50);
        Empleado empleado2 = new Empleado("Jesus", 50);

        if (empleado1 == empleado2) {
            System.out.println("tienen la misma referencia en memoria");
        } else {
            System.out.println("tienen distinta referencia en memoria");
        }

        if (empleado1.equals(empleado2)) {
            System.out.println("Los objetos son iguales en contenido");
        } else {
            System.out.println("Los objetos son distintos en contenido");
        }

        if (empleado1.hashCode() == empleado2.hashCode()) {
            System.out.println("Son iguales los hash");
        } else {
            System.out.println("Son diferentes hash");
        }

    }
}
