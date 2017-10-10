/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculo;

/**
 *
 * @author Estudiante
 */
public abstract class Vehiculo {
protected int caballosDeFuerza;

    public Vehiculo(int caballosDeFuerza) {
        System.out.println("Constructor padre");  
    }
    public void arrancar(){
        System.out.println("arrancar");}

   /*public void detener() {
        System.out.println("detener");
    }*/
public abstract void detener();
}
