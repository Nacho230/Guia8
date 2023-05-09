/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8_ejex02;

import Entidad.NIF;
import Servicio.NIFSERVICIO;
import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class Guia8_EjEx02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le corresponderá. 
Una vez calculado, le asigna la letra que le corresponde según
Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra en mayúscula;
por ejemplo: 00395469-F).
La letra correspondiente al dígito verificador se calculará a traves de un método que funciona de 
la siguiente manera: Para calcular la letra se toma el resto de dividir el número de DNI por 23 
(el resultado debe ser un número entre 0 y 22). El método debe buscar en un array (vector) de 
caracteres la posición que corresponda al resto de la división para obtener la letra correspondiente. 
La tabla de caracteres es la siguiente:
 */
    Scanner leer = new Scanner(System.in);
    NIFSERVICIO S1 = new NIFSERVICIO();
    NIF N1 = S1.crearNif();
       S1.mostrar(N1);


    }
    }