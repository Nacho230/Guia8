/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entidad.Raices;
import Servicio.RaizServicio;
import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class Guia8EjEx01 {

    /**
     * Vamos a realizar una clase llamada Raices, donde representaremos los valores de una ecuación de 2º grado. 
         * Tendremos los 3 coeficientes como atributos, llamémosles a, b y c. Hay que insertar estos 3 valores para construir el objeto a través de un método constructor. 
         * Luego, en RaicesServicio las operaciones que se podrán realizar son las siguientes:
Método getDiscriminante(): devuelve el valor del discriminante (double). El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra, el discriminante debe ser mayor o igual que 0.
Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para que esto ocurra, el discriminante debe ser igual que 0.
Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2 posibles soluciones.
Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz. Es en el caso en que se tenga una única solución posible.
Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por pantalla las posibles soluciones que tiene nuestra ecuación 
* con los métodos obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso de no existir solución, se mostrará un mensaje.
Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía el signo delante de -b
     * @param args
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leerMain = new Scanner(System.in);

        RaizServicio a1 = new RaizServicio();

        //Raices aux = a1.init();
        //Raices aux2 = a1.init();
        System.out.println("Ingrese cuantos datos quiere ingresar? ");
        int cantidad = leerMain.nextInt();
        Raices aux3[] = new Raices[cantidad];
        for (int i = 0; i < cantidad; i++) {
            aux3[i] = a1.init();
        }

        //System.out.println("El valor del metodo discriminante es:  " +  a1.getDiscriminante(aux));
        //System.out.println("Tiene dos soluciones = " + a1.tieneRaices(aux));
        //Calculamos el valor de las raices
        //a1.obtenerRaices(aux);
        //Calculamos el valor de una sola raiz
        //a1.obtenerRaiz(aux);
        //Hace todo
        for (int i = 0; i < cantidad; i++) {
            System.out.println(aux3[i]);
            a1.calcular(aux3[i]);
        }

    }
}
