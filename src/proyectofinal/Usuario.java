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
public class Usuario {
    int registro;
    String nombre;
    String contrasena;
    public int cant = 0;
    boolean disponible;
    boolean admin;

    public Usuario(int registro, String nombre, String contrasena, boolean admin, boolean disponible) {
        this.registro = registro;
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.admin= admin;
        this.disponible = disponible;
        this.cant++;
    }

    public int getCant() {
        return cant;
    }

    public Usuario() {
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

    public boolean getAdmin() {
        return admin;
    }

    public void setaAdmin(boolean admin) {
        this.admin = admin;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
}
