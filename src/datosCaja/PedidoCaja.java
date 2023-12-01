/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datosCaja;

/**
 *
 * @author macha
 */
public class PedidoCaja {
    ProductoCaja producto;
    float precioTotal;
    String nombreProducto;

    public PedidoCaja(ProductoCaja producto){
        this.producto = producto;
        precioTotal = producto.getPrecio() * producto.getCantidad();
        nombreProducto = producto.getProducto();
    }

    public ProductoCaja getProducto() {
        return producto;
    }

    public void setProducto(ProductoCaja producto) {
        this.producto = producto;
    }

    public float getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(float precioTotal) {
        this.precioTotal = precioTotal;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
    
    
}
