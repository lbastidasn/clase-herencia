/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculo;
/**
 *
 * @author Estudiante
 */public class Herenci{

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        // TODO code application logic here
Vehiculo v=new Vehiculo(10);
v.arrancar();
v.detener();

Automovil a= new Automovil(10,10);
a.acelerar(10);

    }
    
 }
