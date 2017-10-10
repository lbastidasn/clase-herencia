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
public class Automovil extends Vehiculo {

    private int cantidadDePuertas;
     public Automovil(int caballosDeFuerza, int cantidasDePuertas) {
        super(caballosDeFuerza);
        int cp = 0;
        this.cantidadDePuertas=cp;
    }

   
    public void acelerar(int cuanto){
        System.out.println("Acelerar");
        
    }
     @Override
    public void arrancar(){
        System.out.println("Arrancar en hijo");
    }
     public abstract void detener();/*{
       //* System.out.println("Arrancar en hijo");
    }

   */
}
