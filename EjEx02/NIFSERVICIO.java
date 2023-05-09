/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.NIF;
import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class NIFSERVICIO {

    private final Scanner leer = new Scanner(System.in);

    public NIF crearNif() {
        NIF n1 = new NIF();
        // char Letra[] = new char[23];
        char Letra[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        System.out.println("Ingrese su DNI");
        n1.setDNI(leer.nextLong());
        int aux = (int) n1.getDNI() % 23;
        n1.setLetra(Letra[aux]);
        return n1;
    }

    public void mostrar(NIF n2) {
        System.out.printf("%08d-%s\n",n2.getDNI(), n2.getLetra());
    }

}

