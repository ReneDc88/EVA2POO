/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_13_polimorfismo_2;

/**
 *
 * @author rener
 */
public class Estudiante extends Persona{
  private String noControl;
    public Estudiante(){
        super();
        noControl = "";
    }

    public Estudiante(String noControl) {
        this.noControl = noControl;
    }

    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }
   public String tooString(){
       return super.toString() + "" + noControl;
   }   
}
