/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import ec.edu.ups.interfaces.Acciones;

/**
 *
 * @author Carmen Bravo
 */
public class Perro extends Animal  implements Acciones{

    public Perro(String nombre, int edad, double peso, String sexo) {
        super(nombre, edad, peso, sexo);
    }

    @Override
    public void comer() {
        System.out.println("El perro:" +  this.getNombre() +"esta comiendo");
    }

    @Override
    public void dormir() {
        System.out.println("El perro duerme mucho porque ya tiene:" + this.getEdad() +"años");
    }

    @Override
    public void mover() {
        System.out.println("El perro ya no se puede mover bien porque tiene: " + this.getEdad() +"años");
    }
        
    

    @Override
    public void jugar() {
        System.out.println("El perro no puede jugar mucho porque pesa:" + this.getPeso() +"Kg");
    }

    @Override
    public void reproducirse() {
        System.out.println("El perro es :"+this.getSexo() +"");
    }
       
  
    
    
}
