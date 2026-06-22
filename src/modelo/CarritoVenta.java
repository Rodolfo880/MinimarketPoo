/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class CarritoVenta {
    private String idCarritoVenta;
    private int cantidadProductos;
    private ArrayList<DetalleVenta> listaDetalleVenta; // Agregacion con DetalleVenta
    
    public CarritoVenta() {
        listaDetalleVenta = new ArrayList<>();
        cantidadProductos = 0;
    }
    
    public CarritoVenta(String idCarritoVenta, int cantidadProductos) {
        this.idCarritoVenta = idCarritoVenta;
        this.cantidadProductos = cantidadProductos;
        this.listaDetalleVenta = new ArrayList<>();
    }
    
     public String getIdCarritoVenta() {
        return idCarritoVenta;
    }

    public void setIdCarritoVenta(String idCarritoVenta) {
        this.idCarritoVenta = idCarritoVenta;
    }

    public int getCantidadProductos() {
        return cantidadProductos;
    }

    public void setCantidadProductos(int cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
    }

    public ArrayList<DetalleVenta> getListaDetalleVenta() {
        return listaDetalleVenta;
    }

    public void setListaDetalleVenta(ArrayList<DetalleVenta> listaDetalleVenta) {
        this.listaDetalleVenta = listaDetalleVenta;
        this.cantidadProductos = listaDetalleVenta.size();
    }

    //Metodos
    public void agregarProducto(DetalleVenta detalle) {
        this.listaDetalleVenta.add(detalle);
        this.cantidadProductos = this.listaDetalleVenta.size();

        System.out.println("Producto agregado al carrito.");
    }

    public void eliminarProducto(int posicion) {
        if (posicion >= 0 && posicion < listaDetalleVenta.size()) {
            this.listaDetalleVenta.remove(posicion);
            this.cantidadProductos = this.listaDetalleVenta.size();

            System.out.println("Producto eliminado del carrito.");
        } else {
            System.out.println("Posición inválida.");
        }
    }

    public double calcularTotal() {
        double total = 0;

        for (int i = 0; i < listaDetalleVenta.size(); i++) {
            total = total + listaDetalleVenta.get(i).getSubtotal();
        }

        return total;
    }

    public void vaciarCarrito() {
        this.listaDetalleVenta.clear();
        this.cantidadProductos = 0;

        System.out.println("Carrito vacío.");
    }
}
