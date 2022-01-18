package paquete1;

import paquete1.Clase1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jesus
 */
public class TestModificadoresAccesoDefault {

    public static void main(String[] args) {
        // default o package
        // usando la clase hija para acceder a la clase padre
//        Clase1 clase1 = new ClaseHijaDefault();
//        clase1.atributoDefault = "Cambio desde la prueba";
//        System.out.println("clase1 = " + clase1.atributoDefault);
//        clase1.metodoDefault();
        
        // llamar a los atributos privados
        // modificador de acceso private
        Clase1 clase1 = new ClaseHijaDefault();
        // sin cambiar el valor
        System.out.println("clase1 = " + clase1.getAtributoPrivado());
        
        //cambiando el valor
        clase1.setAtributoPrivado("Cambio desde la prueba");
        System.out.println("clase1 = " + clase1.getAtributoPrivado());
        
    }
}
