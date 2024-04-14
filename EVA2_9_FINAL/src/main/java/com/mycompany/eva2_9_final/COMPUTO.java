/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_9_final;

/**
 *
 * @author rener
 */
public class COMPUTO {
    public final class Computo extends Electronica {
    private int ram;
    private String hd;
    private String procesador;

    public Computo() {
        this.ram = 0;
        this.hd = "---";
        this.procesador = "----";
    }

    public Computo(int ram, java.lang.String hd, java.lang.String procesador) {
        this.ram = ram;
        this.hd = hd;
        this.procesador = procesador;
    }
    

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public java.lang.String getHd() {
        return hd;
    }

    public void setHd(java.lang.String hd) {
        this.hd = hd;
    }

    public java.lang.String getProcesador() {
        return procesador;
    }

    public void setProcesador(java.lang.String procesador) {
        this.procesador = procesador;
    }
    
    @Override
    public String toString(){
    String cade = super.toString() + "\n";
        cade += "ram " + ram + "\n" + "hd " + hd + "\n" + "Procesador" + procesador;
        return cade;
}
