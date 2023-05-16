/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ventadeproductos;

/**
 *
 * @author DELL
 */
public class Datos {
    private String nombrepro;
    private double preciopro;
    private int cantidadpro;
    private double descuento;
    private double totaldescuento;
    private int vdescuento;

    public Datos(String nombreprod, double precioprod, int cantidadprod) {
        nombrepro = nombreprod;
        preciopro = precioprod;
        cantidadpro = cantidadprod;
    }

    public String getNombrepro() {
        return nombrepro;
    }

    public void setNombrepro(String nombreprodu) {
        nombrepro = nombreprodu;
    }

    public double getPreciopro() {
        return preciopro;
    }

    public void setPreciopro(double precioprodu) {
        preciopro = precioprodu;
    }

    public int getCantidadpro() {
        return cantidadpro;
    }

    public void setCantidadpro(int cantidadprodu) {
        cantidadpro = cantidadprodu;
    }
    
   public double darDescuento(int vdescuento){
       if (preciopro >= 1000 && cantidadpro >= 10){
        vdescuento = 10;
       }else{
           if(preciopro < 1000){
              vdescuento = 5;
       }
       }
        return vdescuento;
   }
    public double calcularDescuento(double preciopro, int cantidadpro){
        if (preciopro >= 1000 && cantidadpro >= 10){
           descuento = preciopro * 0.1;
           totaldescuento = preciopro - descuento;
        vdescuento = 10;
       }else{
           if(preciopro < 1000){
               descuento = preciopro * 0.05;
              totaldescuento = preciopro - descuento;
              vdescuento = 5;
       }
        }
    return totaldescuento;
    
    }
    public double calcularPrecioFinal(){
    return totaldescuento;
    }
}