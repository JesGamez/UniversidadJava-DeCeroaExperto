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
public class TestJavaBeans {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Jesus");
        persona.setApellido("Gamez");
        
        System.out.println("persona = " + persona);
        System.out.println("persona get = " + persona.getNombre());
        System.out.println("persona get = " + persona.getApellido());
    }
}
