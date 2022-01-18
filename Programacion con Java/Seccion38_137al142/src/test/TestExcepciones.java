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
import static aritmetica.Aritmetica.division;
import excepciones.OperacionExcepcion;

public class TestExcepciones {

    public static void main(String[] args) {
        int resultado = 0;

//        //try {
//        resultado = division(10, 0);
////        } catch (Exception e) {
////            System.out.println("ocurrio un error :'v");
////            e.printStackTrace(System.out);
////            System.out.println(e.getMessage());
////        }
//        System.out.println("resultado = " + resultado);
        
        
        try {
        resultado = division(10, 0);
        
        } catch(OperacionExcepcion e){
            System.out.println("Ocurrio un error de tipo operacionExcepcion");
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            System.out.println("ocurrio un error :'v de tipo exception");
            e.printStackTrace(System.out);
            System.out.println(e.getMessage());
        }
        // siempre se va a ejecutar
        // sirve para cerrar el espacio en memoria
        finally{
            System.out.println("Se reviso la division entre cero");
        }
        System.out.println("resultado = " + resultado);

    }
}
