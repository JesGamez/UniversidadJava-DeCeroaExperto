/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gm.ventas;

/**
 *
 * @author Jesus
 */
public class Orden {

    private int idOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    // es para saber cuantos productos iran en la orden
    private int contadorProductos;

    //constante para el maximo de productos para nuestro arreglo
    private final static int MAX_PRODUCTOS = 10;

    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }

    public void agregarProducto(Producto producto) {
        if (this.contadorProductos < Orden.MAX_PRODUCTOS) {
            this.productos[this.contadorProductos++] = producto;
        } else {
            System.out.println("Se ha superado el maximo de : " + Orden.MAX_PRODUCTOS + "productos");
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < this.contadorProductos; i++) {
            // Producto producto = this.productos[i];
            // total += producto.getPrecio();
            total += this.productos[i].getPrecio();
        }
        return total;
    }

    public void mostrarOrden() {
        System.out.println("id Orden: " + this.idOrden);
        
        double totalOrden = this.calcularTotal();
        System.out.println("total de la orden: S/" + totalOrden);
        
        System.out.println("productos de la orden ");
        for (int i = 0; i < this.contadorProductos; i++) {
            System.out.println(this.productos[i]);
        }
    }

}
