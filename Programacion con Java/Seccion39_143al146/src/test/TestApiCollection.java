/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.*;

/**
 *
 * @author Jesus
 */
public class TestApiCollection {

    //interfaces collection (hashset y List hereda de la interface e implementamos un objeto tipo Arraylist)
    // interface map (hashmap)
    public static void main(String[] args) {
        // Lista tipo List
        // se pueden duplicar
        // Devuelve en orden
        //        List miLista = new ArrayList();
        //        miLista.add("Lunes");
        //        miLista.add("Martes");
        //        miLista.add("Miercoles");
        //        miLista.add("Jueves");
        //        miLista.add("Viernes");
        //        miLista.add("Viernes");
        //        imprimir(miLista);
        //        
        //        // forEach
        //        for (Object elemento:miLista) {
        //            System.out.println("elemento = " + elemento);
        //        }
        //        
        //        // funcion lambda
        //        miLista.forEach(elemento -> {
        //            System.out.println("elemento = " + elemento);
        //        });

        // Lista tipo set
        // no se pueden duplicar elementos
        // set no devuelve en orden
        // es mas rapido un set que un list por no ser ordenado
        //        Set miSet = new HashSet();
        //        miSet.add("Lunes");
        //        miSet.add("Martes");
        //        miSet.add("Miercoles");
        //        miSet.add("Jueves");
        //        miSet.add("Viernes");
        //        miSet.add("Viernes");
        //        imprimir(miSet);
        //        
        
        // se puede decir que es un diccionario
        //llave valor
        Map miMapa = new HashMap();
        miMapa.put("Valor1", "Juan");
        miMapa.put("Valor2", "Carlos");
        miMapa.put("Valor3", "Rosario");

        String elemento = (String) miMapa.get("Valor1");
        System.out.println("elemento = " + elemento);

        imprimir(miMapa.keySet());
        imprimir(miMapa.values());

    }

    public static void imprimir(Collection coleccion) {
//        // foreach habitual
//        for (Object elemento: coleccion) {
//            System.out.println("elemento = " + elemento);
//        }

        // operacion funcional con lambda
        coleccion.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });
    }

}
