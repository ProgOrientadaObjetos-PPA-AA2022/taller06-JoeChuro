/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;
import paquete02.Ciudad;
import paquete02.Enfermero;
import paquete02.Hospital;
import paquete02.Medico;

/**
 *
 * @author SALA I
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String nombre; 
        String nHospital;
        String provincia; 
        String ciudad;
        String especialidad;
        String tipo;
        String direccion;
        double sueldo;
        int nEspecialidades;
        System.out.println("Ingrese el nombre del Hospital");
        nHospital = entrada.nextLine();
        System.out.println("Ingrese la ciudad del Hospital");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese la direccion del Hospital");
        direccion = entrada.nextLine();
        System.out.println("Ingrese la Provincia del Hospital");
        provincia = entrada.nextLine();
        System.out.println("Ingrese el numero de especialidades del Hospital");
        nEspecialidades = entrada.nextInt();
        entrada.nextLine(); 
        Ciudad c = new Ciudad(ciudad, provincia);
        int nM;
        int nE;
        System.out.println("Ingrese cuantos doctores tiene el hospital");
        nM = entrada.nextInt();
        entrada.nextLine();
        Medico[] m = new Medico[nM];
        for (int i = 0; i < m.length; i++) {
            System.out.printf("Ingrese el nombre del doctor %d\n", i + 1);
            nombre = entrada.nextLine();
            System.out.printf("Ingrese la especialidad del doctor %d\n", i + 1);
            especialidad = entrada.nextLine();
            System.out.printf("Ingrese el sueldo del doctor %d\n", i + 1);
            sueldo = entrada.nextDouble();
            entrada.nextLine();
            m[i] = new Medico(nombre, especialidad, sueldo);
        }
        System.out.println("Ingrese cuantos enfermeros tiene el hospital");
        nE = entrada.nextInt();
        entrada.nextLine();
        Enfermero[] e = new Enfermero[nE];
        for (int i = 0; i < e.length; i++) {
            System.out.printf("Ingrese el nombre del enfermero %d\n", i + 1);
            nombre = entrada.nextLine();
            System.out.printf("Ingrese el tipo de contrato del enfermero %d\n", i + 1);
            tipo = entrada.nextLine();
            System.out.printf("Ingrese el sueldo del enfermero %d\n", i + 1);
            sueldo = entrada.nextDouble();
            entrada.nextLine();
            e[i] = new Enfermero(nombre, tipo, sueldo);
        }

        Hospital h = new Hospital(
                nHospital, c, nEspecialidades, m, e, direccion);
        System.out.printf("%s", h);

    }

}
