/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author Jesus
 */
// Persona al ser final no se puede heredar (extends  Persona)
public class Empleado {
// public class Empleado extends Persona {
    
    // con @Override estamos indicando una sobreescritura del metodo imprimir()
    // @Override
    public void imprimir() {
        System.out.println("Metodo imprimir desde clase hija");
    }

}
