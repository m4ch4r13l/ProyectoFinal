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
    
    public void cargarProductos(){
        add(1, "Arroz", 70.00f, 100);
        add(2, "Aceite de oliva", 140.00f, 50);
        add(3, "Pasta", 250.00f, 80);
        add(4, "Lentejas 1Kg", 385.00f, 120);
        add(5, "Galletas", 30.00f, 60);
        add(6, "Jabón en barra", 24.00f, 150);
        add(7, "Leche 2L", 50.00f, 90);
        add(8, "Azúcar 1Kg", 32.00f, 110);
        add(9, "Sopa enlatada", 68.00f, 70);
        add(10, "Cepillo de dientes", 40.00f, 100);
    }
}
