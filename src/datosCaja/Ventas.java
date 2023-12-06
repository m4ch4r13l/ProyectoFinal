/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datosCaja;

/**
 *
 * @author macha
 */
public class Ventas {
    public Ventas ventasList[] = new Ventas[100];
    int idPedido = 0;
    String productos[];
    int cantidades[];
    float precios[];
    float total;

    public Ventas(String[] productos, int[] cantidades, float[] precios, float total) {
        this.productos = productos;
        this.cantidades = cantidades;
        this.precios = precios;
        this.total = total;
    }
    
    public Ventas(){ }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public String[] getProductos() {
        return productos;
    }

    public void setProductos(String[] productos) {
        this.productos = productos;
    }

    public int[] getCantidades() {
        return cantidades;
    }

    public void setCantidades(int[] cantidades) {
        this.cantidades = cantidades;
    }

    public float[] getPrecios() {
        return precios;
    }

    public void setPrecios(float[] precios) {
        this.precios = precios;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }
    
    public void add(String[] productos, int[] cantidades, float[] precios, float total){
        ventasList[idPedido] = new Ventas(productos, cantidades, precios, total);
        ventasList[idPedido].setProductos(productos);
        ventasList[idPedido].setCantidades(cantidades);
        ventasList[idPedido].setPrecios(precios);
        ventasList[idPedido].setTotal(total);
        idPedido++;
    }
    
    
}
