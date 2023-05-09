/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Cuenta_Bancaria;
import java.util.Scanner;

/**
 *
 * @author nacho
 */
public class CuentaBancariaServicio {
    //Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
//Método para crear cuenta pidiéndole los datos al usuario.
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Cuenta_Bancaria crearCuenta(){
        Cuenta_Bancaria n1 = new Cuenta_Bancaria();
        System.out.println("Ingrese su DNI");
        n1.setDniCliente(leer.nextLong());
        
        System.out.println("Ingrese numero de cuenta: ");
        n1.setNumeroCuenta(leer.nextInt());
        
        System.out.println("Ingrese su saldo actual: ");
        n1.setSaldoActual(leer.nextFloat());
        
        return n1;
    }
            
    //Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
    
    public void ingresar(Cuenta_Bancaria n1){
        System.out.println("Ingrese la cantidad a depositar: ");
        float saldo = leer.nextFloat();
        n1.setSaldoActual(n1.getSaldoActual() + saldo);
        System.out.println("Su nuevo saldo es: " + n1.getSaldoActual());
    }
    
    //Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual. 
    //Si la cuenta no tiene la cantidad de dinero a retirar se retirará el máximo posible hasta dejar la cuenta en 0.
    public void retirar(Cuenta_Bancaria n1){
        System.out.println("Ingrese la cantidad a retirar: ");
        float retirar = leer.nextFloat();
        if (n1.getSaldoActual() > retirar ) {
            System.out.println("Saldo retirado");
           n1.setSaldoActual(n1.getSaldoActual() - retirar);
        }else{
            System.out.println("El monto ingresado supera tu saldo");
            //n1.setSaldoActual(n1.getSaldoActual() - retirar);
            n1.setSaldoActual(n1.getSaldoActual()- n1.getSaldoActual());
            System.out.println("Tu saldo actual es : "  + n1.getSaldoActual());
        }
    }
    //Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
    
    public void extraccionRapida(Cuenta_Bancaria n1){
        
        float maximoRetirar = (float) (n1.getSaldoActual() * 0.2);
        System.out.println(maximoRetirar);
        System.out.println("Ingrese la cantidad a retirar: (Solo el 20%) ");
        float retirar = leer.nextFloat();
        if (retirar > maximoRetirar) {
            System.out.println("Solo puede retirar hasta " + maximoRetirar);
        }else{
            n1.setSaldoActual(n1.getSaldoActual() - retirar);
            System.out.println("Se retiró su saldo");
        }
    }
    
     //Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.

    
    public void consultarSaldo(Cuenta_Bancaria n1){
        System.out.println("Su saldo actual es: ");
        System.out.println(n1.getSaldoActual());
    }
    
    //Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
    /**
     * private int numeroCuenta;
    private long dniCliente;
    private float saldoActual;
     * @param n1 
     */
    public void consultarDatos(Cuenta_Bancaria n1){
        System.out.println("Sus datos son: ");
        System.out.println(n1.getDniCliente());
        System.out.println(n1.getNumeroCuenta());
        System.out.println(n1.getSaldoActual());
    }
    
    
        
}
   
    
    

