/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.Principal;

import ec.edu.ups.clases.Perro;

/**
 *
 * @author Carmen Bravo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    
        Perro perro = new Perro("Scay", 3, 25, "Macho");
        Perro perro1 = new Perro("Estrella", 4, 28, "Hembra");

        //Imprimir los metodos 
        perro.comer();
        perro.dormir();
        perro.mover();
        perro.jugar();
        perro.reproducirse();

        System.out.println("");

        perro1.comer();
        perro1.dormir();
        perro1.mover();
        perro1.jugar();
        perro1.reproducirse();
    }
}



