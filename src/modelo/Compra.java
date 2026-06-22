/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author USUARIO
 */
public class Compra {

    private int idCompra;
    private Date fecha;
    private double subtotal;
    private double igv;
    private double total;

    private Proveedor proveedor; // Asociación
    private ArrayList<DetalleCompra> listaDetalleCompra; // Composición

    public Compra() {
        listaDetalleCompra = new ArrayList<>();
    }

    public Compra(int idCompra, Date fecha,
            double subtotal, double igv,
            double total, Proveedor proveedor) {

        this.idCompra = idCompra;
        this.fecha = fecha;
        this.subtotal = subtotal;
        this.igv = igv;
        this.total = total;
        this.proveedor = proveedor;
        this.listaDetalleCompra = new ArrayList<>();
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getIgv() {
        return igv;
    }

    public void setIgv(double igv) {
        this.igv = igv;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public ArrayList<DetalleCompra> getListaDetalleCompra() {
        return listaDetalleCompra;
    }

    public void setListaDetalleCompra(ArrayList<DetalleCompra> listaDetalleCompra) {
        this.listaDetalleCompra = listaDetalleCompra;
    }

    public void registrarCompra() {
        System.out.println("Compra registrada correctamente.");
    }

    public void agregarDetalle(DetalleCompra detalle) {
        this.listaDetalleCompra.add(detalle);
        calcularTotal();

        // Aumenta stock automáticamente
        if (detalle.getProducto() != null) {
            detalle.getProducto().aumentarStock(
                    detalle.getCantidad()
            );
        }
    }

    public void eliminarDetalle(int posicion) {
        if (posicion >= 0 &&
                posicion < listaDetalleCompra.size()) {

            listaDetalleCompra.remove(posicion);
            calcularTotal();
        }
    }

    public double calcularTotal() {
        this.subtotal = 0;
        for (int i = 0; i < listaDetalleCompra.size(); i++) {
            this.subtotal +=
                    listaDetalleCompra.get(i).getSubtotal();
        }
        this.igv = this.subtotal * 0.18;
        this.total = this.subtotal + this.igv;
        return this.total;
    }

    public void mostrarCompra() {
        System.out.println("COMPRA");
        System.out.println("ID Compra: " + this.idCompra);
        System.out.println("Fecha: " + this.fecha);
        if (this.proveedor != null) {
            System.out.println("Proveedor: "
                    + this.proveedor.getEmpresa());

        } else {
            System.out.println("Proveedor: No asignado");
        }
        System.out.println("Subtotal: " + this.subtotal);
        System.out.println("IGV: " + this.igv);
        System.out.println("Total: " + this.total);
    }
}
