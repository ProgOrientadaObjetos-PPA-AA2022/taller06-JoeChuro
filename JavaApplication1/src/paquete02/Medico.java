/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author SALA I
 */
public class Medico {
    private String nombre;
    private String especialidad;
    private double sueldo;
    
    public Medico(String n, String es, double s) {
        nombre = n;
        especialidad = es;
        sueldo = s;
    }
    
    public void establecerNombre(String n) {
        nombre = n;
    }
    
    public void establecerEspecialidad(String es) {
        especialidad = es;
    }
    
    public void establecerSueldo(double s) {
        sueldo = s;
    }
    
    public String obtenerNombre() {
        return nombre;
    }
    
    public String obtenerEspecialidad() {
        return especialidad;
    }
    
    public double obtenerSueldo() {
        return sueldo;
    }
}
