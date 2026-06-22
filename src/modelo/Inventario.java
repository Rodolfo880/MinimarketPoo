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
public class Inventario {
    private int idInventario;
    private int cantidadProductos;
    private ArrayList<Producto> listaProductos; // Agregación con Producto

    public Inventario() {
        listaProductos = new ArrayList<>();
        cantidadProductos = 0;
    }

    public Inventario(int idInventario, int cantidadProductos) {
        this.idInventario = idInventario;
        this.cantidadProductos = cantidadProductos;
        this.listaProductos = new ArrayList<>();
    }

    public int getIdInventario() {
        return idInventario;
    }

    public void setIdInventario(int idInventario) {
        this.idInventario = idInventario;
    }

    public int getCantidadProductos() {
        return cantidadProductos;
    }

    public void setCantidadProductos(int cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
        this.cantidadProductos = listaProductos.size();
    }
    
    //Metodos
    public void agregarProducto(Producto producto) {
        Producto encontrado = buscarProducto(producto.getCodigoProducto());

        if (encontrado != null) {
            encontrado.aumentarStock(producto.getStock());
            System.out.println("El producto ya existía. Stock actualizado.");
        } else {
            this.listaProductos.add(producto);
            this.cantidadProductos = this.listaProductos.size();
            System.out.println("Producto agregado al inventario.");
        }
    }

    public void eliminarProducto(String codigoProducto) {
        Producto producto = buscarProducto(codigoProducto);

        if (producto != null) {
            producto.setEstado(false);
            System.out.println("Producto eliminado lógicamente del inventario.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    public Producto buscarProducto(String codigoProducto) {
        for (int i = 0; i < listaProductos.size(); i++) {
            Producto producto = listaProductos.get(i);

            if (producto.getCodigoProducto().equalsIgnoreCase(codigoProducto)) {
                return producto;
            }
        }

        return null;
    }

    public void listarProductos() {
        System.out.println("LISTA DE PRODUCTOS EN INVENTARIO");

        if (listaProductos.isEmpty()) {
            System.out.println("No hay productos en el inventario.");
        } else {
            for (int i = 0; i < listaProductos.size(); i++) {
                listaProductos.get(i).mostrarProducto();
            }
        }
    }

    public void verificarStock() {
        System.out.println("VERIFICACIÓN DE STOCK");

        for (int i = 0; i < listaProductos.size(); i++) {
            Producto producto = listaProductos.get(i);

            if (producto.verificarStockMinimo()) {
                System.out.println("Stock bajo: " + producto.getNomProducto());
            }
        }
    }  
}
