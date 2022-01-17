/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

/**
 *
 * @author Jesus
 */
public class Operaciones {
    
    // sobrecarga de metodos es cuando hay mas de un metodo con un mismo nombre
    // tienen el mismo nombre, cambian sus argumentos
    
    public static int sumar(int a, int b) {
        System.out.println("int ");
        return a + b;
    }
    
    public static double sumar(double a, double b){
        System.out.println("double ");
        return a + b;
    }
}
