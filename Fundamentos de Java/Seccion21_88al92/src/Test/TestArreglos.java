/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

/**
 *
 * @author Jesus
 */
public class TestArreglos {
    public static void main(String[] args) {
        // los arreglos solo tienen un numero definido de elementos
        // pueden hacerse dinamicos pero eso se hara despues :)
        int edades[] = new int[3];
        System.out.println("edades = " + edades);
        
        edades[0] = 10;
        System.out.println("edades 0 = " + edades[0]);
        
        edades[1] = 20;
        System.out.println("edades 1 = " + edades[1]);
        
        edades[2] = 30;
        System.out.println("edades 2 = " + edades[2]);
        
        for(int i = 0; i < edades.length; i++) {
            System.out.println("edades elemento " + i + ": "+ edades[i]);
        }
        
        // sintaxis resumida podemos definir un arreglo desde un inicio
        String frutas[] = {"Naranja","Platano","Uva"};
        
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("frutas " + i + ": " + frutas[i]);
        }
    }
}
