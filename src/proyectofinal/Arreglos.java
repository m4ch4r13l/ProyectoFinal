/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

/**
 *
 * @author tikis
 */
public class Arreglos {
    int registro;
    String nombre;
    String contrasena;
    String nivel;
    public int cant = 0;
    boolean disponible;

    public Arreglos(int registro, String nombre, String contrasena, String nivel, boolean disponible) {
        this.registro = registro;
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.nivel = nivel;
        this.disponible = disponible;
        this.cant++;
    }

    public int getCant() {
        return cant;
    }

    public Arreglos() {
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
}
