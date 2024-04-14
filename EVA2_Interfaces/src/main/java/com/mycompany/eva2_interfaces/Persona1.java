package com.mycompany.eva2_interfaces;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rener
 */
public class Persona1 extends Persona implements Datos {
    private String numControl;

    public Estudiante(String numControl) {
        
        this.numControl = numControl;
    }

    public Estudiante() {
        super();
        this.numControl = "----";
        
    }

    public String getNumControl() {
        return numControl;
    }

    public void setNumControl(String numControl) {
        this.numControl = numControl;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Nmbre" + getNombre());
        System.out.println("Apellidos" + getApellido());
        System.out.println("Edad" + getEdad());
        
    }

    @Override
    public String generarNombreCom() {
        return getNombre() + " " + getApellido();
    }
    @Override
    public int CalcularAnnioNac
}
