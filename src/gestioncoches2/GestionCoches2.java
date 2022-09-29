/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestioncoches2;

import dominio.Vehiculo;

/**
 *
 * @author loren
 */
public class GestionCoches2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehiculo veh1 = new Vehiculo("1263HSP", "Mercedes", "A45 AMG", "Negro", 60000.00, true);
        Vehiculo veh2 = new Vehiculo("6563QRT", "Audi", "RS7", "Rojo", 120000.00, true);
        System.out.println(veh1);
        System.out.println(veh2);
    }
    
}
