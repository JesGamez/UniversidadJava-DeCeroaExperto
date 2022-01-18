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
public class TestClasesAbstractas {
    public static void main(String[] args) {
        // no se puede crear instancias de una clase abstracta
        // FiguraGeometrica figuraGeometrica = new FiguraGeometrica();
        
        FiguraGeometrica figura = new Rectangulo("Rectangulo");
        figura.dibujar();
    }
}
