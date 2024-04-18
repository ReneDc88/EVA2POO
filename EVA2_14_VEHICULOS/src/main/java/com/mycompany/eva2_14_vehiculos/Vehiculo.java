/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_14_vehiculos;

/**
 *
 * @author rener
 */
public abstract class Vehiculo {
  private int velocidad;
  velocidad = 0;
    public Vehiculo(int velocidad) {
        this.velocidad = velocidad;
    }
  public vehiculo()(int velocidad);

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
 public void acelerar(int ajuste){
     velocidad += ajuste;
 }





}
