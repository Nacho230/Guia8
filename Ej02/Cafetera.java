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
public class Cafetera {
    private int CantidadMaxima;
    private int CapacidadActual;
    
    public Cafetera() {
    }

    public int getCantidadMaxima() {
        return CantidadMaxima;
    }

    public void setCantidadMaxima(int CantidadMaxima) {
        this.CantidadMaxima = CantidadMaxima;
    }

    public int getCapacidadActual() {
        return CapacidadActual;
    }

    public void setCapacidadActual(int CapacidadActual) {
        this.CapacidadActual = CapacidadActual;
    }
}

