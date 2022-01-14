/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dominio.Persona;

/**
 *
 * @author Jesus
 */
public class TestFinal {
    // el uso de la palabra final en:
    // variables: evita el cambio de valor que almacena la variable
    // metodos: evita que se modifique la definicion de un método desde una subclase(clase hija)
    // clases: evita que se cree una subclase(clase hija)
    // cuando una variable estatica se le añade el final, esto la convierte en una constante ya que
    // se puede acceder directamente desde otra clase, como la clase Math

    public static void main(String[] args) {
        final int laVariable = 10;
        System.out.println("laVariable = " + laVariable);

        // al declararlo como final no se puede modificar la variable
        // laVariable = 15;
        System.out.println("Mi constante " + Persona.MI_CONSTANTE);

        // final con objetos
        final Persona persona1 = new Persona();
        // no podemos cambiar la referencia del objeto pero si su valor
        // persona1 = new Persona();
        persona1.setNombre("Jesus");
        System.out.println("persona1 = " + persona1.getNombre());
        persona1.setNombre("Carlos");
        System.out.println("persona1 = " + persona1.getNombre());
    }

}
