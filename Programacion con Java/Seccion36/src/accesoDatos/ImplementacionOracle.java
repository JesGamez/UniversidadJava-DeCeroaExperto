/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoDatos;

/**
 *
 * @author Jesus
 */
public class ImplementacionOracle implements IAccesoDatos{

    @Override
    public void insertar() {
        System.out.println("Insertar desde ORACLE");
    }

    @Override
    public void listar() {
        System.out.println("listar desde ORACLE");
    }

    @Override
    public void actualizar() {
        System.out.println("actualizar desde ORACLE");
    }

    @Override
    public void eliminar() {
       System.out.println("eliminar desde ORACLE");
    }
    
}
