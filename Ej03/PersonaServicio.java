/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class PersonaServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    
    
    //Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al usuario y 
//después se le asignan a sus respectivos atributos para llenar el objeto Persona. 
//Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje
    
   public Persona crearPersona(){
        Persona p1 = new Persona();
       boolean verificar = false;
       //String genero = "";
       System.out.println("Ingrese el nombre de la persona: ");
       p1.setNombre(leer.next());
       
       System.out.println(" Ingrese la edad de la persona: ");
       p1.setEdad(leer.nextInt());
       
       do{
       System.out.println("Ingrese el genero de la persona: ");
        String genero = leer.next();
       if(genero.equalsIgnoreCase("h") || genero.equalsIgnoreCase("m") || genero.equalsIgnoreCase("o")){
           p1.setSexo(genero);
           //System.out.println("Correcto");
           verificar = true;
       }else{
           System.out.println("Ingresaste un genero incorrecto");
       }
       }while(!verificar); 
       
       System.out.println("Ingrese el peso de la persona : ");
       p1.setPeso(leer.nextDouble());
       //System.out.println("El peso de la persona es: " + p1.getPeso());
       
        System.out.println("Ingrese la altura de la persona : ");
       p1.setAltura(leer.nextDouble());
       //System.out.println("La altura de la persona es: " + p1.getAltura());
       return p1;
       
   }
   
//Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.
   //Creamos una variable local Personita para invocar o traer los atributos de mi clase PERSONA
   public boolean esMayorDeEdad(Persona personita){
        return personita.getEdad() >= 18;
    }
       
       //Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)). 
 //Si esta fórmula da por resultado un valor menor que 20, significa que la persona está por debajo de su peso ideal y la función devuelve un -1. 
 //Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona está en su peso ideal y la función devuelve un 0. 
 //Finalmente, si el resultado de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la función devuelve un 1.
       
     public int calcularPeso(Persona personita){
     double imc = personita.getPeso() / Math.pow(personita.getAltura(), 2);
    if (imc < 20) {
    return -1;
    } else if (imc >= 20 && imc <= 25) {
    return 0;
    } else {
    return 1;
    }
    }
           
           
       }
       
       
       
       
       
       
       
   
    
    
    

    
    
    
    
    
   
