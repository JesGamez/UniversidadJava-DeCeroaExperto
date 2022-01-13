/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Seccion4_Operadores;

import java.util.Scanner;

/**
 *
 * @author Jesus
 */
public class AreaRectangulo_33 {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Halle el área y perímetro del rectangulo");
        System.out.println("Ingrese la base");
        var numero1 = Integer.parseInt(consola.nextLine());
        System.out.println("Ingrese la altura");
        var numero2 = Integer.parseInt(consola.nextLine());
        var area = (numero1 * numero2);
        System.out.println("area = " + area);
        var perimetro = ((numero1 + numero2) * 2);
        System.out.println("perimetro = " + perimetro);

    }
}
