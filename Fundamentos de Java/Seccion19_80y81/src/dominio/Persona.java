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
 public final class Persona {
// public class Persona {
    
     //esto es una constante en java, siempre en mayuscula
     public final static int MI_CONSTANTE = 1;
     
     private String nombre;
     
     
             
    // si le añadimos final a nuestro metodo no puede ser sobreescrito
     public final void imprimir() { 
    // public void imprimir() {
        System.out.println("Metodo imprimir");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
