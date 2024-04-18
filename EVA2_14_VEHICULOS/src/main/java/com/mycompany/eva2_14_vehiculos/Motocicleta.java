/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_14_vehiculos;

/**
 *
 * @author rener
 */
public class Motocicleta extends Vehiculo{
  private int capacidad;
public Motocicleta(int velocidad, int capacidad){
    super(velocidad);
    this.capacidad = capacidad;
    }  

    public Motocicleta(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}
