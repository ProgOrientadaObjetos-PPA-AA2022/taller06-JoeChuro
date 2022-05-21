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
    private String ciudad;
    private int nEspecialidades;
    private int[] cMedicos;
    private int[] cEnfermeros;
    private double totalSueldos;
    private String dirHospital;

    public Hospital(String n) {
        nombre = n;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerCiudad(Ciudad n) {
        ciudad = n;
    }

    public void establecerNumeroEspecialidades(int n) {
        nEspecialidades = n;
    }

    public void establecerContuntoMedicos(Medico n) {
        cMedicos[] = n;
    }

    public void establecerContuntoEnfermeros(Enfermero n) {
        cEnferos[] = n;
    }

    public void establecerSueldoTotal(double n) {
        totalSueldos = n;
    }

}
