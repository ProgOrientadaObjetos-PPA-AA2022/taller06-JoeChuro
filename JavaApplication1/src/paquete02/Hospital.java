/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author SALA I
 */
public class Hospital {
    private String nombre;
    private Ciudad ciudad;
    private int especialidades;
    private Medico[] cMedicos;
    private Enfermero[] cEnfermeros;
    private int sueldos;
    private String direccion;
    
    public Hospital(String n, Ciudad c, int es, Medico[] m, Enfermero[] e, String d) {
        nombre = n;
        ciudad = c;
        especialidades = es;
        cMedicos = m;
        cEnfermeros = e;
        direccion = d;
                        
    }
    
    public void establecerNombre(String n) {
        nombre = n;
    }
    
    public void establecerCiudad(Ciudad c) {
        ciudad= c;
    }
    
    public void establecerEspecialidades(int es) {
        especialidades = es;
    }
    
    public void establecerDoctores(Medico[] m) {
        cMedicos = m;
    }
    
    public void establecerEnfermeros(Enfermero[] e) {
        cEnfermeros = e;
    }
    
    public void calcularSueldos() {
        sueldos = cMedicos.length + cEnfermeros.length;
    }
    
    public void establecerDireccion(String d) {
        direccion = d;
    }
    
    public String obtenerNombre() {
        return nombre;
    }
    
    public Ciudad obtenerCiudad() {
        return ciudad;
    }
    
    public int obtenerEspecialidades() {
        return especialidades;
    }
    
    public Medico[] obtenerDoctores() {
        return cMedicos;
    }
    
    public Enfermero[] obtenerEnfermeros() {
        return cEnfermeros;
    }
    
    public int obtenerSueldos() {
        return sueldos;
    }
    
    public String obtenerDireccion() {
        return direccion;
    }
    
    public String toString() {
        String cadena = String.format("Nombre: %s\n"
                + "Direccion: %s\n"
                + "Ciudad: %s\n"
                + "Provincia: %s\n"
                + "Numero de Especialidades: %d\n"
                + "Listado de Medicos\n", 
                nombre,
                direccion,
                ciudad.obtenerNombre(),
                ciudad.obtenerProvincia(),
                especialidades);
        for (int i = 0; i < cMedicos.length; i++) {
            cadena = String.format("%s%s - sueldo: %.2f - %s\n",
                    cadena, 
                    cMedicos[i].obtenerNombre(),
                    cMedicos[i].obtenerSueldo(),
                    cMedicos[i].obtenerEspecialidad());
        }
        cadena = String.format("%sListado de Enfermeros\n", cadena);
        for (int i = 0; i < cEnfermeros.length; i++) {
            cadena = String.format("%s%s - sueldo: %.2f - %s\n",
                    cadena, 
                    cEnfermeros[i].obtenerNombre(),
                    cEnfermeros[i].obtenerSueldo(),
                    cEnfermeros[i].obtenerTipo());
        }   
        return cadena;
    }
    
   
}

