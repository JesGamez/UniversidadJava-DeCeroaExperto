/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import domain.*;

/**
 *
 * @author Jesus
 */
public class TestSobreescritura {
    public static void main(String[] args) {
        // para hacer polimorfismo hay que haber hecho una sobreescritura de un metodo desde una clase hija
        // es necesario para la sobeescritura en java haber heredado de una clase
        
        Empleado empleado = new Empleado("Jesus" , 5000);
        // System.out.println("empleado = " + empleado.obtenerDetalles());
        imprimir(empleado);
        
        Gerente gerente = new Gerente("Carlos", 1000, "DEV");
        // System.out.println("gerente = " + gerente.obtenerDetalles());
        imprimir(gerente);

    }
    
    // polimorfismo
    // multiples comportamiento dependiendo del cual se esta haciendo referencia
    // deben de tener una relacion de padre a hijo para que puedan cambiar su valor
    // se puede ejecutar con un mismo metodo diferentes tipos
    public static void imprimir(Empleado empleado){
        String detalles = empleado.obtenerDetalles();
        System.out.println("empleado = " + detalles);
    }
    
}
