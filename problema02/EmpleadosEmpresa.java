/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.empleadosempresa;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class EmpleadosEmpresa {

    public static void main(String[] args) {
        System.out.println("NOMINA DE EMPLEADOS");
        Scanner teclado = new Scanner(System.in);
        String nombre;
        double salario;
        int edad;
        int opcion;
        boolean bandera = true;
        
       

        while(bandera){
            System.out.println("Ingresar nombre de empleado: ");
            nombre = teclado.nextLine();
            System.out.println("Ingresar salario de empleado: ");
            salario = teclado.nextDouble();
            System.out.println("Ingresar edad de empleado: ");
            edad = teclado.nextInt();
            
           
         Empleado e = new Empleado(nombre, salario, edad); 
                     e.setNomem(nombre);
                     e.setSalario(salario);
                     e.setEdad(edad);
        
                    System.out.println("¿Desea ingresar un nuevo empleado?\n"
                    + "Digite 1 ");
                     
                    System.out.println("¿Desea mostrar el total de empleados registrados?\n"
                    + "Digite 2 ");
                   
                    opcion = teclado.nextInt();
                if (opcion == 1) {
                bandera = true;
            }else{
                if(opcion == 2){
                    System.out.println("NOMINA TOTAL DE EMPLEADOS: ");   
                     System.out.println("Nombre: " + e.getNomem());
                     System.out.println("Salario: " + e.getSalario());
                    System.out.println("Edad: " + e.getEdad());
                    bandera = false;

                }else{
                    System.out.println("Opcion incorrecta");
                    bandera = false;
                }
                }
                    teclado.nextLine();   
        }
        } 
    }

