/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import accesoDatos.*;

/**
 *
 * @author Jesus
 */
public class TestInterfaces {

    // interfaz tienen metodos abstractos
    // si agregamos atributos a una interfaz va a ser una constante
    // clase abstracta se usa cuando se tiene una relacion de herencia
    // Interfaz se usa cuando se tiene una relacion en comportamiento
    public static void main(String[] args) {
        IAccesoDatos datos = new ImplementacionMysql();
        //datos.listar();
        imprimir(datos);

        datos = new ImplementacionOracle();
        // datos.listar();
        imprimir(datos);

    }

    public static void imprimir(IAccesoDatos datos) {
        datos.listar();
    }
}
