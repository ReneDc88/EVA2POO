/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_9_final;

/**
 *
 * @author rener
 */
public abstract class Productos {
 private String nombre;
    private Double precio;

    public Productos() {
        this.nombre = "---";
        this.precio = 0.0;
    }

    public Productos(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    
    @Override
    public String toString(){
        String cade = "";
        cade += "Nombre: " + nombre + "\n" + "Precio:"  + precio;
        return cade;    
}
}