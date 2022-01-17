/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gm.ventas.test;

import com.gm.ventas.*;

/**
 *
 * @author Jesus
 */
public class VentasTest {
    public static void main(String[] args) {
        Producto producto1 = new Producto("camisa",50.00);
        Producto producto2 = new Producto("short",20.00);
        Producto producto3 = new Producto("polo",40.00);
        
        Orden orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.mostrarOrden();
        
        Orden orden2 = new Orden();
        orden2.agregarProducto(producto1);
        orden2.agregarProducto(producto2);
        orden2.agregarProducto(producto3);
        orden2.mostrarOrden();
    }
}
