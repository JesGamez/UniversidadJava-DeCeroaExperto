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
public class TestMatrices {
    public static void main(String[] args) {
        // el orden va primero [fila][columna]
        int edades[][] = new int[3][2];
        System.out.println("edades = " + edades);
        
        edades[0][0] = 5;
        edades[0][1] = 10;
        edades[1][0] = 9;
        edades[1][1] = 8;
        edades[2][0] = 8;
        edades[2][1] = 8;
        
        System.out.println("edades 0-0 = " + edades[0][0]);
        System.out.println("edades 0-1 = " + edades[0][1]);
        System.out.println("edades 1-0 = " + edades[1][0]);
        System.out.println("edades 1-1 = " + edades[1][1]);
        System.out.println("edades 2-0 = " + edades[2][0]);
        System.out.println("edades 2-1 = " + edades[2][1]);
        
        for (int filas = 0; filas < edades.length; filas++) {
            
            for (int columnas = 0; columnas < edades[filas].length; columnas++) {
                System.out.println("edades "+ filas + " " + columnas + ": " + edades[filas][columnas]);
            }
            
        }
        
        String frutas[][] = {{"Naranja","Limon"},{"Fresa","zarzamora","Mora"}};
        
//        for (int filas = 0; filas < frutas.length; filas++) {
//            for (int columnas = 0; columnas < frutas[filas].length; columnas++) {
//                System.out.println("frutas "+ filas + " " + columnas + ": " + frutas[filas][columnas]);
//            }
//        }
        imprimir(frutas);
        
        Persona personas[][] = new Persona[2][3];
        personas[0][0] = new Persona("Juan");
        personas[0][1] = new Persona("Jesus");
        imprimir(personas);
    }
    
    public static void imprimir(Object matriz[][]){
        
        for (int filas = 0; filas < matriz.length; filas++) {
            for (int columnas = 0; columnas < matriz[filas].length; columnas++) {
                System.out.println("matriz "+ filas + " " + columnas + ": " + matriz[filas][columnas]);
            }
        }
        
    }
    
}