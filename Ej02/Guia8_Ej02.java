/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8_ej02;

import Entidad.Cafetera;
import Servicio.CafeteraServicio;
import java.util.Scanner;



/**
 *
 * @author nacho
 */
public class Guia8_Ej02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
       Cafetera cafe = new Cafetera();
        CafeteraServicio c1 = new CafeteraServicio();
        Scanner leer = new Scanner(System.in);
        System.out.println("bienvenido a su cxafetera Nespresso");
        System.out.println("           what else?");
        System.out.println("configurando sistema");
        System.out.println("ingrese la capacidad maxima de la cafetera que indica en la caja");
        cafe.setCantidadMaxima(leer.nextInt());
        System.out.println("cafetera configurada exitosamente");
        System.out.println("===========");
        int eleccion = 0;

        do {
            System.out.println("elija opcion");
            System.out.println("1.Llenar cafetera");
            System.out.println("2. Servir taza");
            System.out.println("3. Vaciar Cafetera");
            System.out.println("4. Agregar Cafe");
            System.out.println("5. Apagar Cafetera");
            eleccion=leer.nextInt();
            switch (eleccion) {
                case 1:
       c1.llenarCafetera(cafe);
          
     
                    System.out.println("cap maxima"+ cafe.getCantidadMaxima());
                   
                    break;
                case 2:
                    c1.servirTaza(cafe);
                     
                    break;
                case 3:
                    c1.vaciarCafetera(cafe);
                   
                    break;
                case 4:
                  c1.agregarCafe(cafe);
                
                    break;
                case 5:
                    System.out.println("gracias por elegirnos");
                    System.out.println("apagando");
                    break;
            }
        } while (eleccion != 5);
        
        
        

    }
}
