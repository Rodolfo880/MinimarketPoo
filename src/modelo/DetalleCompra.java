/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author USUARIO
 */
public class DetalleCompra {
    private int idDetalleCompra;
    private int cantidad;
    private double precioCompra;
    private double subtotal;
    private Producto producto; // Asociación con Producto
    
    public DetalleCompra() {
    }

    public DetalleCompra(int idDetalleCompra, int cantidad,
                         double precioCompra, double subtotal,
                         Producto producto) {

        this.idDetalleCompra = idDetalleCompra;
        this.cantidad = cantidad;
        this.precioCompra = precioCompra;
        this.subtotal = subtotal;
        this.producto = producto;
    }

    public int getIdDetalleCompra() {
        return idDetalleCompra;
    }

    public void setIdDetalleCompra(int idDetalleCompra) {
        this.idDetalleCompra = idDetalleCompra;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
   
    //Metodos
    public double calcularSubtotal() {
        this.subtotal = this.cantidad * this.precioCompra;
        return this.subtotal;
    }
}
