/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datosCaja;

/**
 *
 * @author macha
 */
public class ProductoCaja {
    public ProductoCaja aptSiguiente;
    String nombre;
    float precio;
    int cant =0;
    
    public ProductoCaja(String nombre, float precio, int cant) {
        this(nombre, precio, cant, null);
    }
    
    public ProductoCaja(String nombre, float precio, int cant, ProductoCaja aptSiguiente) {
        this.nombre = nombre;
        this.precio = precio;
        this.cant = cant;
        this.aptSiguiente = aptSiguiente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public ProductoCaja getAptSiguiente() {
        return aptSiguiente;
    }

    public void setAptSiguiente(ProductoCaja aptSiguiente) {
        this.aptSiguiente = aptSiguiente;
    }
    
    
}
