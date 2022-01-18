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
public class TestAutoBoxing_Unboxing {
    public static void main(String[] args) {
        // clases Wrapper de tipos primitivos
        /*
        int - Integer
        long - Long
        float - Float
        double - Double
        boolean - Boolean
        byte - Byte
        char - Character
        short - Short
        */
        
        // Autoboxing
        // volvemos a un tipo object un valor
        Integer entero = 10;
        System.out.println("entero = " + entero);
        System.out.println("entero = " + entero.doubleValue());
        
        // Unboxing
        // se le extrae la literal a eso se le refiere el unboxing
        // se vuelve un tipo primitivo
        int entero2 = entero;
        System.out.println("entero2 = " + entero2);
        
        
    }
}
