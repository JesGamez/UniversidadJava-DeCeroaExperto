/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aritmetica;

import excepciones.OperacionExcepcion;

/**
 *
 * @author Jesus
 */
public class Aritmetica {

    // throws significa que posiblemente arroje una excepcion
    public static int division(int numerador, int denominador) {
        // public static int division(int numerador, int denominador) throws OperacionExcepcion{
        if (denominador == 0) {
            // throw significa arrojar en ingles
            throw new OperacionExcepcion("Division entre cero");
        }
        return numerador / denominador;
    }
}
