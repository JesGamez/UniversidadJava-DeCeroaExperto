/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Jesus
 */
public class TestArgumentosVariables {
    public static void main(String[] args) {
        // se trabajan con metodos obligatoriamente
        imprimirNumeros(3,4,5,6,7);
        imprimirNumeros(1,2,3,4);
        variosParametros("jesus",9,8,7,6);
    }
    
    // argumentos variables quiere decir que no sabemos cuantos argumentos vamos a recibir
    // es como un arreglo pero la diferencia esta en que si lo declaramos como un arreglo
    // deberiamos saber cuantos elementos vamos a recibir
    
    private static void variosParametros(String nombre, int... numeros){
        System.out.println("nombre = " + nombre);
        imprimirNumeros(numeros);
    }
    
    private static void imprimirNumeros(int... numeros){
        for (int i = 0; i < numeros.length ; i++) {
            System.out.println("elementos = " + numeros[i]);
        }
    }
    
}
