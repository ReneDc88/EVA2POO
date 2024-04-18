/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_14_vehiculos;

/**
 *
 * @author rener
 */
public class Automovil extends Vehiculo {
    private int noPuertas;
    super();
    public Automovil(int noPuertas, int velocidad) {
        super(velocidad);
        this.noPuertas = noPuertas;
    }

    public Automovil(int noPuertas) {
        this.noPuertas = noPuertas;
    }

    public int getNoPuertas() {
        return noPuertas;
    }

    public void setNoPuertas(int noPuertas) {
        this.noPuertas = noPuertas;
    }
    
}
