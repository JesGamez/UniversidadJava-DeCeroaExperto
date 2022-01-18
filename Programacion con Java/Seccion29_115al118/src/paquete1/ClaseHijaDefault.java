/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author Jesus
 */
public class ClaseHijaDefault extends Clase1{
    
    public ClaseHijaDefault(){
        //llamar desde la clase hija al constructor privado de clase1
        super("Llamar");
        //super();
        //System.out.println("atributoDefault" + this.atributoDefault);
        //this.metodoDefault();
    }
    
}
