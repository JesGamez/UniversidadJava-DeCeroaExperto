/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import domain.Gerente;

/**
 *
 * @author Jesus
 */
public class TestSobreescritura {
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente("Jesus", 200, "dev");
        // no muestra el departamento
        // sobreescribimos obtenerDetalles() desde la clase gerente que es la clase hija
        System.out.println("gerente1 = " + gerente1.obtenerDetalles());
    }
}
