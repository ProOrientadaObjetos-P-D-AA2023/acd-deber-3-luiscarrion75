/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empleadosempresa;

/**
 *
 * @author DELL
 */
public class Empleado {
    private String nomem;
    private double salario;
    private int edad;
    

    public Empleado(String nomemp, double sueldo, int edadd) {
        nomem = nomemp;
        salario = sueldo;
        edad = edadd;
    }

    public String getNomem() {
        return nomem;
    }

    public void setNomem(String nomempl) {
        nomem = nomempl;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double suel) {
        salario = suel;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int eda) {
        edad = eda;
    }
    
}
