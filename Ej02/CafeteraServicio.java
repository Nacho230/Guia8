/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;


import Entidad.Cafetera;
import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class CafeteraServicio {
    Scanner leer = new Scanner(System.in);
    Cafetera cafe = new Cafetera();

    public void llenarCafetera(Cafetera cafe) {
        System.out.println("LLENAR CAFETERA");
        int variable=cafe.getCantidadMaxima();
        cafe.setCapacidadActual(variable);
        System.out.println("llenando.....");
        System.out.println("cafetera llena");
        System.out.println(" usted tiene " + cafe.getCapacidadActual() + " cm3 de cafe");
    }

    public void servirTaza(Cafetera cafe){
        System.out.println("ingrese tamaño de la taza");
        int taza = leer.nextInt();
        if (taza < cafe.getCapacidadActual()) {
            System.out.println("sirviendo...");

            System.out.println("3");

            System.out.println("2");

            System.out.println("1");

            System.out.println("taza llena");
            cafe.setCapacidadActual(cafe.getCapacidadActual()-taza);
        } else {
            System.out.println("sirviendo...");

            System.out.println("3");

            System.out.println("2");

            System.out.println("....");

            System.out.println("cafe insuficiente");
            System.out.println("se sirvio: " + cafe.getCapacidadActual() + " cm3 de cafe");
            cafe.setCapacidadActual(0);
        }
    }

    public void vaciarCafetera(Cafetera cafe) {
        System.out.println("se vacia la cafetera");
        System.out.println("vaciando....");
        cafe.setCapacidadActual(0);
        System.out.println("se vacio la cafetera usted tiene : " + cafe.getCapacidadActual() + " cm3 de cafe");
    }

    public void agregarCafe(Cafetera cafe) {
        System.out.println("ingrese la cantidad de cafe que desea agregar");
        int llenar = leer.nextInt();
        int faltaLlenar = cafe.getCantidadMaxima() - cafe.getCapacidadActual();

        if (llenar <=faltaLlenar) {
            System.out.println("la cafetera solo tiene disponible " + faltaLlenar + " cm3 de cafe, se cargara solo esa cantidad");
            System.out.println("llenando...");
            
            System.out.println("3");
        
            System.out.println("2");
   
            System.out.println("1");
          
            System.out.println("proceso exitoso");
        } else {
            System.out.println("llenando...");
             
            System.out.println("3");
         
            System.out.println("2");
       
            System.out.println("....");
           
            cafe.setCapacidadActual(cafe.getCantidadMaxima());
            System.out.println("cafetera llena");
            System.out.println("usted tiene : " + cafe.getCapacidadActual() + " cm3 de cafe");

        }
  
   
}
}
