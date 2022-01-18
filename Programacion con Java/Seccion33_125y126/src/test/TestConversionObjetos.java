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
public class TestConversionObjetos {
    public static void main(String[] args) {
        Empleado empleado;
        empleado = new Escritor("Jesus", 9000, TipoEscritura.CLASICO);
        // System.out.println("empleado = " + empleado);
       // System.out.println("empleado tipo padre: " + empleado.obtenerDetalles());
        
        // no se puede acceder ya que solo existe en la clase hija escritor
        // empleado.getTipoEscritura();
        
        // estamos convirtiendo una referencia de tipo padre a un tipo hijo
        // downcasting
        // ((Escritor) empleado).getTipoEscritura();
        
        Escritor escritor = (Escritor) empleado;
        System.out.println("escritor = " + escritor.getTipoEscritura());
        
        
        // de tipo hijo a padre
        // upcasting
        Empleado empleado2 = escritor;
        System.out.println("empleado tipo padre: " + empleado2.obtenerDetalles());
    }
}
