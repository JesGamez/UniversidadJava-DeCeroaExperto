/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author Jesus
 */

// modificador de acceso default o package (default o package si a todo clases,variables,atributos,metodos,constructores)  
// La clase solo se puede usar si esta en el mismo paquete, si esta fuera no lo reconoce
class Clase1 {
    // default quiere decir ausencia de modificador de acceso    
//    String atributoDefault = "Valor de atributo Default";
//
//    Clase1() {
//        System.out.println("Constructor Default");
//    }
//    
//    // metodo protected
//    void metodoDefault() {
//        System.out.println("Metodo Default");
//    }
    
     // modificadores de acceso (private no a las clases lo demas si,variables,atributos,metodos,constructores)
    private String atributoPrivado = "Valor de atributo Privado";

    private Clase1() {
        System.out.println("Constructor Privado");
    }
    
    public Clase1(String argumento){
        this();
        System.out.println("Constructor publico para llamar al privado");
    }
    
    // metodo protected
    private void metodoPrivado() {
        System.out.println("Metodo Privado");
    }
    
    // tenemos que encapsular para poder acceder a sus atributos privados
    public String getAtributoPrivado() {
        return atributoPrivado;
    }

    public void setAtributoPrivado(String atributoPrivado) {
        this.atributoPrivado = atributoPrivado;
    }
  
    
    
    
    
//public class Clase1 {

    // modificadores de acceso (public si a todo clases,variables,atributos,metodos,constructores)  
    // public String atributoPublico = "Valor de atributo publico";
    /*
    public Clase1() {
        System.out.println("Constructor publico");
    }

    // metodo publico
    public void metodoPublico() {
        System.out.println("Metodo publico");
    }
     */
    
    // modificadores de acceso (protected no a las clases lo demas si,variables,atributos,metodos,constructores)
   /* protected String atributoProtected = "Valor de atributo protected";

    protected Clase1() {
        System.out.println("Constructor protected");
    }
    
    public Clase1(String arg) {
        System.out.println("Constructor publico");
    }

    // metodo protected
    protected void metodoProtected() {
        System.out.println("Metodo protected");
    }
    */

}
