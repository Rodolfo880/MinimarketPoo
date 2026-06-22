/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.util.Date;
import java.sql.Time;
import java.util.ArrayList;

/**
 *
 * @author USUARIO
 */
public class Venta {
    private int idVenta;
    private Date fecha;
    private Time hora;
    private double subtotal;
    private double igv;
    private double total;
    
    private Cliente cliente; // Asociacion con Cliente
    private Empleado cajero; // Asociacion con Empleado
    private ArrayList<DetalleVenta> listaDetalleVenta; //Composición con DetalleVenta
    
    public Venta() {
       listaDetalleVenta = new ArrayList<>();
    }
    
    public Venta(int idVenta, Date fecha, Time hora,
                 double subtotal, double igv, double total,
                 Cliente cliente, Empleado cajero) {

        this.idVenta = idVenta;
        this.fecha = fecha;
        this.hora = hora;
        this.subtotal = subtotal;
        this.igv = igv;
        this.total = total;
        this.cliente = cliente;
        this.cajero = cajero;
        this.listaDetalleVenta = new ArrayList<>();
    }
    
    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Empleado getCajero() {
        return cajero;
    }

    public void setCajero(Empleado cajero) {
        this.cajero = cajero;
    }

    public ArrayList<DetalleVenta> getListaDetalleVenta() {
        return listaDetalleVenta;
    }

    public void setListaDetalleVenta(ArrayList<DetalleVenta> listaDetalleVenta) {
        this.listaDetalleVenta = listaDetalleVenta;
    }
    
    //Metodos
    public void registrarVenta() {
        System.out.println("Venta registrada correctamente.");
    }

    public void agregarDetalle(DetalleVenta detalle) {
        this.listaDetalleVenta.add(detalle);
        calcularTotal();
    }

    public void eliminarDetalle(int posicion) {
        if (posicion >= 0 && posicion < listaDetalleVenta.size()) {
            this.listaDetalleVenta.remove(posicion);
            calcularTotal();
        }
    }

    public double calcularTotal() {
        this.subtotal = 0;

        for (int i = 0; i < listaDetalleVenta.size(); i++) {
            this.subtotal = this.subtotal + listaDetalleVenta.get(i).getSubtotal();
        }

        this.igv = this.subtotal * 0.18;
        this.total = this.subtotal + this.igv;

        return this.total;
    }

    public void imprimirVenta() {
        System.out.println("===== VENTA =====");
        System.out.println("ID Venta: " + this.idVenta);
        System.out.println("Fecha: " + this.fecha);
        System.out.println("Hora: " + this.hora);

        if (this.cliente != null) {
            System.out.println("Cliente: " + this.cliente.getNombre());
        } else {
            System.out.println("Cliente: No asignado");
        }

        if (this.cajero != null) {
            System.out.println("Cajero: " + this.cajero.getNombre());
        } else {
            System.out.println("Cajero: No asignado");
        }

        System.out.println("Subtotal: " + this.subtotal);
        System.out.println("IGV: " + this.igv);
        System.out.println("Total: " + this.total);
    }
}
