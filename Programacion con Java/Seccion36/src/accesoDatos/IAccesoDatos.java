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
public interface IAccesoDatos {
    // todos los atributos de una interfaz son constantes
    int MAX_REGISTROS = 10;
    
    void insertar();
    void listar();
    void actualizar();    
    void eliminar();
    
}
