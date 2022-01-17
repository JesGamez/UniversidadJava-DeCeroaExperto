/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import domain.Persona;

/**
 *
 * @author Jesus
 */
public class TestArreglosObject {
    public static void main(String[] args) {
        // los arreglos y colecciones se debe de declarar en plural
        Persona personas[] = new Persona[2];
        
        personas[0] = new Persona("Jesus");
        personas[1] = new Persona("Arturo");
        
        System.out.println("personas 0 = " + personas[0].toString());
        System.out.println("personas 1 = " + personas[1].toString());
        
        for(int i=0; i < personas.length; i++){
            System.out.println("personas " + i +": "+ personas[i]);
        }
    }
}
