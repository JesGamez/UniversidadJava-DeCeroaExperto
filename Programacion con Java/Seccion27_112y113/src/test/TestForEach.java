/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import domain.Persona;

/**
 *
 * @author Jesus
 */
public class TestForEach {

    public static void main(String[] args) {
        int edades[] = {1, 2, 3, 4};
//        for (int i = 0; i < edades.length; i++) {
//        }

// no tenemos acceso al contador cuando usamos foreach
        for (int edad : edades) {
            System.out.println("edad = " + edad);
        }
        
        Persona personas[] = {new Persona("Jesus"),new Persona("Carlos"),new Persona("Pedro")};
        for(Persona persona: personas){
            System.out.println("persona = " + persona);
        }
    }
}
