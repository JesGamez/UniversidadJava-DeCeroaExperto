/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Jesus
 */
public class Persona {

    private final int idPersona;
    private static int contadorPersonas;

    // bloque de codigo de inicializacion estatico
    // se ejecutan antes del constructor
    // se ejecuta acada vez que se carga en memoria esta clase
    // se ejecuta una vez
    static {
        System.out.println("Ejecucion bloque estatico");
        ++Persona.contadorPersonas;
        // no podemos acceder al id ya que no es estatico
        // idPersona = 10;
    }

    // bloque de inicializacion no estatico
    // se ejecuta despues de crear un objeto
    // se ejecuta varias veces
    {
        System.out.println("Ejecucion de bloque no estatico");
        this.idPersona = Persona.contadorPersonas++;
    }

    public Persona() {
        System.out.println("Ejecucion del constructor");
    }

    public int getIdPersona() {
        return idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }

}
