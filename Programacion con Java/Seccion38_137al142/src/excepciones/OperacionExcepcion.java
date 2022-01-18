/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author Jesus
 */

// se usa RuntimeException para usar menos lineas de codigo
// pero el programa termina de manera abrupta es de tipo
// unchecked ya que no es necesario reportar el error
public class OperacionExcepcion extends RuntimeException {
    
// Exception es de tipo checked ya que debe de estar en un trycatch
// es necesario reportar el problema, pero el programa no termina de manera abrupta
// public class OperacionExcepcion extends Exception{

    public OperacionExcepcion(String mensaje) {
        super(mensaje);
    }
}
