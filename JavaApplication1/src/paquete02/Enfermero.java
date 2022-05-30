/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author SALA I
 */
public class Enfermero {
    private String nombre;
    private String tipo;
    private double sueldo;
    
    public Enfermero(String n, String t, double s) {
        nombre = n;
        tipo = t;
        sueldo = s;
    }
    
    public void establecerNombre(String n) {
        nombre = n;
    }
    
    public void establecerTipo(String t) {
        tipo = t;
    }
    
    public void establecerSueldo(double s) {
        sueldo = s;
    }
    
    public String obtenerNombre() {
        return nombre;
    }
    
    public String obtenerTipo() {
        return tipo;
    }
    
    public double obtenerSueldo() {
        return sueldo;
    }
}

