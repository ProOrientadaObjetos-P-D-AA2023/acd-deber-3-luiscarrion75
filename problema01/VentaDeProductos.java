/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ventadeproductos;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class VentaDeProductos {

    public static void main(String[] args) {
        System.out.println("VENTA DE PRODUCTOS");
        
        String  nombreproducto;
        double precioproducto;
        int cantidadproducto;
        
        Scanner teclado = new Scanner(System.in);
        
        
        System.out.println("Ingrese nombre del producto: ");
        nombreproducto = teclado.nextLine();
        System.out.println("Ingrese precio del producto: ");
        precioproducto = teclado.nextDouble();
        System.out.println("Ingrese la cantidad de productos: ");
        cantidadproducto = teclado.nextInt();
        
        Datos d = new Datos(nombreproducto, precioproducto, cantidadproducto);

        System.out.println("DATOS DEL PRODUCTO");
        System.out.println("Su producto es: " + d.getNombrepro());
        System.out.println("Su precio es: " + d.getPreciopro() + "$");
        System.out.println("Cantidad de productos: " + d.getCantidadpro());
        System.out.println("Descuento asignado: " + d.darDescuento(cantidadproducto) + "%");
        System.out.println("Descuento aplicado: " + d.calcularDescuento(precioproducto, cantidadproducto));
        System.out.println("Precio final: " + d.calcularPrecioFinal() + "$");
        
        
        
        
        
        
        
        
        
    }
}
