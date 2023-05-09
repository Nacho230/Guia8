/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8_ej01;

import Entidad.Cuenta_Bancaria;
import Servicios.CuentaBancariaServicio;
import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class Guia8_Ej01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Realizar una clase llamada CuentaBancaria en el paquete Entidades con los siguientes atributos: 
         * numeroCuenta(entero), dniCliente(entero largo), saldoActual. Agregar constructor vacío, con parámetros, getters y setters.
Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
Método para crear cuenta pidiéndole los datos al usuario.
Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual. 
* Si la cuenta no tiene la cantidad de dinero a retirar se retirará el máximo posible hasta dejar la cuenta en 0.
Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
         * 
         */
        
        int menu = 1;
        Scanner leer = new Scanner(System.in);
        
        
        CuentaBancariaServicio m1 = new CuentaBancariaServicio();
        Cuenta_Bancaria cuenta = new Cuenta_Bancaria();
        
        do{
               System.out.println();
            System.out.println();
            System.out.println("== Quiroga Banko ==");
            System.out.println("");
            System.out.println("1. Crear cuenta");
            System.out.println("2. Ingresar Money");
            System.out.println("3. Retirar Money");
            System.out.println("4. Extraccion Rapida (Max 20% del saldo)");
            System.out.println("5. Consultar Saldo");
            System.out.println("6. Consultar Datos");
            System.out.println("7. SALIR");
            System.out.println("Ingrese su opcion: ");
        menu = leer.nextInt();
        switch (menu) {
            case 1:
                cuenta = m1.crearCuenta();
                System.out.println("Creaste la cuenta satisfactoriamente");
                break;
            case 2:
                m1.ingresar(cuenta);
                break;
            case 3:
                m1.retirar(cuenta);
                break;
            case 4:
                m1.extraccionRapida(cuenta);
                break;
            case 5:
                m1.consultarSaldo(cuenta);
                break;
            case 6:
                m1.consultarDatos(cuenta);
                break;
            default:
        }
        }while(menu != 7);
       
        }
        }
    

        
        
        
    
    

