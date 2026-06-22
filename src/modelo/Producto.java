/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author USUARIO
 */
public class Producto {
    private int idProducto;
    private String codigoProducto;
    private String nomProducto;
    private String marca;
    private double precioCompra;
    private double precioVenta;
    private int stock;
    private int stockMinimo;
    private boolean estado;
    private Categoria categoria; // Asociación con Categoria

    public Producto() {
    }

    public Producto(int idProducto, String codigoProducto, String nomProducto,
            String marca, double precioCompra, double precioVenta, int stock, 
            int stockMinimo, boolean estado, Categoria categoria) {
        
        this.idProducto = idProducto;
        this.codigoProducto = codigoProducto;
        this.nomProducto = nomProducto;
        this.marca = marca;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.stock = stock;
        this.stockMinimo = stockMinimo;
        this.estado = estado;
        this.categoria = categoria;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNomProducto() {
        return nomProducto;
    }

    public void setNomProducto(String nomProducto) {
        this.nomProducto = nomProducto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getStockMinimo() {
        return stockMinimo;
    }

    public void setStockMinimo(int stockMinimo) {
        this.stockMinimo = stockMinimo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    //Metoods
     public void registrarProducto() {
        System.out.println("Producto registrado correctamente.");
    }

    public void actualizarProducto() {
        System.out.println("Producto actualizado correctamente.");
    }

    public void eliminarProducto() {
        this.estado = false;
        System.out.println("Producto eliminado correctamente.");
    }

    public void mostrarProducto() {
        System.out.println("DATOS PRODUCTO");
        System.out.println("Código: " + this.codigoProducto);
        System.out.println("Nombre: " + this.nomProducto);
        System.out.println("Marca: " + this.marca);
        System.out.println("Precio Compra: " + this.precioCompra);
        System.out.println("Precio Venta: " + this.precioVenta);
        System.out.println("Stock: " + this.stock);
        System.out.println("Stock mínimo: " + this.stockMinimo);

        if (this.categoria != null) {
            System.out.println("Categoría: " + this.categoria.getNombre());
        } else {
            System.out.println("Categoría: No asignada");
        }
    }

    public void aumentarStock(int cantidad) {
        this.stock = this.stock + cantidad;
    }

    public boolean disminuirStock(int cantidad) {
        if (cantidad <= this.stock) {
            this.stock = this.stock - cantidad;
            return true;
        } else {
            return false;
        }
    }

    public boolean verificarStockMinimo() {
        return this.stock <= this.stockMinimo;
    }
}
