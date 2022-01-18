/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import enumeracion.Continentes;
import enumeracion.EnumeracionDias;

/**
 *
 * @author Jesus
 */
public class TestEnumeraciones {

    public static void main(String[] args) {
//        System.out.println("dia 1 de la semana: " + EnumeracionDias.LUNES);
//        indicarDiaSemana(EnumeracionDias.MARTES);
          
          System.out.println("Continente no. 4: " + Continentes.AMERICA);
          System.out.println("no. paises 4 continente: " + Continentes.AMERICA.getPaises());
          
          System.out.println("Continente no. 1: " + Continentes.AFRICA);
          System.out.println("no. paises 1 continente: " + Continentes.AFRICA.getPaises());
    }

    private static void indicarDiaSemana(EnumeracionDias dias) {
        switch (dias) {
            case LUNES:
                System.out.println("dia 1");
                break;
            case MARTES:
                System.out.println("dia 2");
                break;
        }
    }

}
