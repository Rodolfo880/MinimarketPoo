/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author USUARIO
 */
public class DetalleVenta {
    private int idDetalleVenta;
    private int cantidad;
    private double precioUnitario;
    private double subtotal;
    private Producto producto; // Asociación con Producto

    public DetalleVenta() {
    }

    public DetalleVenta(int idDetalleVenta, int cantidad, double precioUnitario,
            double subtotal, Producto producto) {
        
        this.idDetalleVenta = idDetalleVenta;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.subtotal = subtotal;
        this.producto = producto;
    }
    
    public int getIdDetalleVenta() {
        return idDetalleVenta;
    }

    public void setIdDetalleVenta(int idDetalleVenta) {
        this.idDetalleVenta = idDetalleVenta;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
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
        this.subtotal = this.cantidad * this.precioUnitario;
        return this.subtotal;
    }

    public void mostrarDetalle() {
        System.out.println("DETALLE DE VENTA");

        if (this.producto != null) {
            System.out.println("Producto: " + this.producto.getNomProducto());
        } else {
            System.out.println("Producto: No asignado");
        }

        System.out.println("Cantidad: " + this.cantidad);
        System.out.println("Precio Unitario: " + this.precioUnitario);
        System.out.println("Subtotal: " + this.subtotal);
    }
}
