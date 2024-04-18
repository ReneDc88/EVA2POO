/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_15_clasesabstractas;

/**
 *
 * @author rener
 */
public class EVA2_15_CLASESABSTRACTAS {

    public static void main(String[] args) {
//Prueba prueba = new Prueba(); no se puede crear un objeto
//No se pueden crear objetos de interfaces
//los metodos de la interfaz
//la asignamos a un identificador de tipo prueba

Prueba prueba = new Prueba(){
    @override
    public void mostrarmensaje(){
        System-out-println("Hola mundo ");
    }
        
    }   interface prueba{
    public void mostrarmensaje();
}
abstract class claseabstracta{
    public abstract void otroMensaje();
    System.out.println("AHora con clase abstracta");
}
    };
    prueba2.mensaje();
    prueba2.otromensaje();
}
