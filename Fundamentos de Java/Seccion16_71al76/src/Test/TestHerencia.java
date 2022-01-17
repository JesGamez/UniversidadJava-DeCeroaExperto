/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import domain.Cliente;
import domain.Empleado;
import java.util.Date;

/**
 *
 * @author Jesus
 */
public class TestHerencia {

    public static void main(String[] args) {
//        Empleado empleado1 = new Empleado("Jesus",5000.0);
//        System.out.println("empleado1 = " + empleado1);
        var fecha = new Date();
        Cliente cliente1 = new Cliente(fecha, true, "Jesus", 'M', 21, "San Jose");
        System.out.println("cliente1 = " + cliente1);
    }
}
