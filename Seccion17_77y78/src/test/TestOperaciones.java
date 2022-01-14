/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import operaciones.Operaciones;

/**
 *
 * @author Jesus
 */
public class TestOperaciones {
    public static void main(String[] args) {
        var resultado = Operaciones.sumar(5, 3);
        System.out.println("resultado = " + resultado);
        
        var resultado2 = Operaciones.sumar(2.0, 3);
        System.out.println("resultado2 = " + resultado2);
        
        // el metodo que soporta un long es un double
        var resultado3 = Operaciones.sumar(2.0, 3L);
        System.out.println("resultado2 = " + resultado3);
    }
}
