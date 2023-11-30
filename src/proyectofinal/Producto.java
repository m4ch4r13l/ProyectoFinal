/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.util.Date;

/**
 *
 * @author tikis
 */
public class Producto {
    public Producto pro[] = new Producto[30];
    int id;
    String nombre;
    float precio;
    int stock;
public int cant =0;
    public Producto(int id, String nombre, float precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public Producto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
public void add(int ID, String nom, float pre, int stok){
pro[cant] = new Producto(0,null,0,0);

   pro[cant].setId(ID);
   pro[cant].setNombre(nom);
   pro[cant].setPrecio(pre);
   pro[cant].setStock(stok);
   cant++;
    
}
   
}
