/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Raices;
import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class RaizServicio {
    //Luego, en RaicesServicio las operaciones que se podrán realizar son las siguientes:

    Scanner leer = new Scanner(System.in);
    
    public Raices init(){
        Raices r1 = new Raices();
        System.out.println("Ingrese los valores de: A, B, C ");
        r1.setA(leer.nextDouble());
        r1.setB(leer.nextDouble());
        r1.setC(leer.nextDouble());
        return r1;

}
    ////Método getDiscriminante(): devuelve el valor del discriminante (double). El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
    public double getDiscriminante(Raices r2){
        return (Math.pow(r2.getB(), 2) - 4 * r2.getA() * r2.getC());
    } 
    
    //Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra, el discriminante debe ser mayor o igual que 0.
    public boolean tieneRaices(Raices r2){
        return getDiscriminante(r2) > 0;
    }
    
    //Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para que esto ocurra, el discriminante debe ser igual que 0.
    public boolean tieneRaiz(Raices r2){
        return getDiscriminante(r2) == 0;
    }
    
    
    //Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz. Es en el caso en que se tenga una única solución posible.
    public void obtenerRaiz(Raices r2){
    if(tieneRaiz(r2)){
        double x1 =  (-r2.getB()+Math.sqrt((Math.pow(r2.getB(), 2) - (4 * r2.getA() * r2.getC()))) / (2*r2.getA()));
        System.out.println("La raiz es: " + x1);
    }
    }
    //Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2 posibles soluciones.
    public void obtenerRaices(Raices r2){
        double x1;
        if (tieneRaices(r2)){
           x1 =  (-r2.getB()+Math.sqrt((Math.pow(r2.getB(), 2) - (4 * r2.getA() * r2.getC()))) / (2*r2.getA()));
            System.out.print("La raiz x1 es: " + x1);
            x1 =  (-r2.getB()-Math.sqrt((Math.pow(r2.getB(), 2) - (4 * r2.getA() * r2.getC()))) / (2*r2.getA()));
            System.out.println(" " + " y la raiz x2 es: " + x1);
        }
    }
    
  //Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por pantalla las posibles soluciones que tiene nuestra ecuación 
//con los métodos obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso de no existir solución, se mostrará un mensaje.
    public void calcular(Raices r2){
        if (tieneRaiz(r2)){
            obtenerRaiz(r2);
        }else if (tieneRaices(r2)){
            obtenerRaices(r2);
        }else{
        System.out.println("No tiene raices");
    }
    }   
    
    
    
    
    
    
    
    
    
    
    
    
}
    
