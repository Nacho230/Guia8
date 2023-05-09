/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author nacho
 */
public class Cuenta_Bancaria {
    //Realizar una clase llamada CuentaBancaria en el paquete Entidades con los siguientes atributos: 
    //numeroCuenta(entero), dniCliente(entero largo), saldoActual. Agregar constructor vacío, con parámetros, getters y setters
    
    private int numeroCuenta;
    private long dniCliente;
    private float saldoActual;
    
    public Cuenta_Bancaria(){
}

    public Cuenta_Bancaria(int numeroCuenta, long dniCliente, float saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public float getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(float saldoActual) {
        this.saldoActual = saldoActual;
    }
    
}



