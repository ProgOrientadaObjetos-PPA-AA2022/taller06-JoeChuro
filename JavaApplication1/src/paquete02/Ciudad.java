/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author SALA I
 */
public class Ciudad {
    private String nombre;
    private String provincia;
    
    public Ciudad(String n, String p) {
        nombre = n;
        provincia = p;
    }
    
    public void establecerNombre(String n) {
        nombre = n;
    }
    
    public void establcerProvincia(String p) {
        provincia = p;
    }
    
    public String obtenerNombre() {
        return nombre;
    }
    
    public String obtenerProvincia() {
        return provincia;
    }
}
