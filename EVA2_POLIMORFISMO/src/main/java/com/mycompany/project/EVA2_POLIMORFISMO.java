/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.project;

/**
 *
 * @author rener
 */
public class EVA2_POLIMORFISMO {

    public static void main(String[] args) {
    Estudiante estudiante = new Estudiante("0011", "Juan","Pérez");
    System.out.println(estudiante);
    //PODEMOS CONVERTIR UN OBJETO DE UNA SUBCLASE A UNA SUPERCLASE
    Persona persona = estudiante;
    System.out.println("Nombre:" + persona.getNombre());
    System.outPrintln("Apellidos:" + persona.getApellido());
    
    
    }
}
