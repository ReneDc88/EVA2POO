/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_11_has_a;

/**
 *
 * @author rener
 */
public class EVA2_11_HAS_A {

    public static void main(String[] args) {
     Direccion direc = new Direccion("5ta", "55", "valles", "cdmx", "cdmx");
        Persona perso = new Persona("juan", "perez", 50, direc);
        System.out.println(perso);
       
    }
    }
}
