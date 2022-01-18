/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import domain.*;

/**
 *
 * @author Jesus
 */
public class TestInstanceOf {

    public static void main(String[] args) {
        // instance of nos permite determinar el tipo en tiempo de ejecucion en memoria
        Empleado empleado = new Empleado("Jesus", 5000);
        determinarTipo(empleado);
        Gerente gerente = new Gerente("Carlos", 1000, "DEV");
        // determinarTipo(gerente);
    }

    public static void determinarTipo(Empleado empleado) {
        // primero debemos de preguntar por las clases hijas y 
        // luego por las mas genericas hasta llegar al padre y ultimo al object 
        if (empleado instanceof Gerente) {
            System.out.println("Es de tipo gerente");
            // no podemos acceder a la variable departamento
            // ((Gerente) empleado).getDepartamento();

            // convertimos nuestra variable a tipo gerente
            Gerente gerente = (Gerente) empleado;
            // ahora si podemos acceder a departamento sin problemas
            System.out.println("gerente = " + gerente.getDepartamento());

        } else if (empleado instanceof Empleado) {
            System.out.println("Es de tipo empleado");

            // error en tiempo de compilacion
            // estamos conviritendo obligatoriamente un padre a un hijo
            // debemos tener certeza de las conversiones que vayamos a hacer
            /*
            Gerente gerente = (Gerente)empleado;
            System.out.println("gerente = " + gerente.getDepartamento());
             */
            System.out.println("empleado = " + empleado.getNombre());
            
        } else if (empleado instanceof Object) {
            System.out.println("Es de tipo Object");
            empleado.toString();
        }
    }

}
