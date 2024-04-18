/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_14_vehiculos;

/**
 *
 * @author rener
 */
public class EVA2_14_VEHICULOS {

    public static void main(String[] args) {
   Vehiculo flota[] = new Vehiculos[10];
   
   flota[0] = new Automovil(4,0);
   flota[1] = new Automovil(2,0);
   flota[2] = new Automovil(6,0);
   flota[3] = new Automovil(4,0);
   flota[4] = new Automovil(4,0);
   flota[5] = new Motocicleta(125,0);
   flota[6] = new Motocicleta(125,0);
   flota[7] = new Motocicleta(1000,0);
   flota[8] = new Motocicleta(200,0);
   flota[9] = new Motocicleta(1000,0);
    
   Automovil auto = (Automovil) flota[0];
   System.out.println("Numero de puertas: " + auto.getNoPuertas());
   Motocicleta moto = (Motocicleta) flota[5];
   System.out.println("Capacidad (CC): " + moto.getCapacidad());
   
   if(flota[1] instanceof (Automovil) flota[1];
   System.out.println("Numero de puertas: " + auto.getpuertas();
    
    } 
  acelerar (auto, 50);
  acelerar(auto, 50);
  System.out.println("Velocidad auto: " + auto.getVelocidad());
  acelerar(moto, 100);
  System.out.println("Velocidad auto: " + auto.getVelocidad());
  acelerar(moto, 300);
  System.out.println("Velocidad auto: " + auto.getVelocidad());
  acelerar(moto, 250);
  System.out.println("Velocidad auto: " + auto.getVelocidad());
  acelerar(moto, 300)
}
    
    
    
    public static void acelerar(Vehiculo vehiculo, int ajuste){
    Vehiculo.acelerar(ajuste);
}



}
