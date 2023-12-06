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
    String id;
    String nombre;
    float precio;
    int stock;
    public int cant =0;
    public Producto(String id, String nombre, float precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public Producto() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
    
    public void add(String ID, String nom, float pre, int stok){
    pro[cant] = new Producto(null,null,0,0);

       pro[cant].setId(ID);
       pro[cant].setNombre(nom);
       pro[cant].setPrecio(pre);
       pro[cant].setStock(stok);
       cant++;
    }
    
    public void cargarProductos(){
        add("7500478022540", "Emperador Nuz", 18.00f, 100);
        add("7500810021927", "Mini Barritas Frs", 20.00f, 50);
        add("7500478024568", "Chokis Brwn", 22.00f, 80);
        add("7500478025343", "Sabritas Org", 18.00f, 120);
        add("7501011104099", "Rufles Qso", 19.00f, 60);
        add("7501030419020", "ChocoRoles Pña", 12.00f, 150);
        add("7501030419099", "Pingüinos", 12.00f, 90);
        add("7500810011157", "Polvorones", 18.00f, 110);
        add("7503001250656", "Alpezzi 500g", 66.00f, 70);
        add("7500478014569", "Chokis 76g", 20.00f, 100);
    }
}
