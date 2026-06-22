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
public class Reporte {
    private int idReporte;
    private Date fechaInicio;
    private Date fechaFin;
    private String tipoReporte;
    
    private ArrayList<Venta> listaVentas;
    private Inventario inventario;
    
    public Reporte() {
        listaVentas = new ArrayList<>();
    }
    
    public Reporte(int idReporte, Date fechaInicio,
                   Date fechaFin, String tipoReporte) {

        this.idReporte = idReporte;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.tipoReporte = tipoReporte;
        this.listaVentas = new ArrayList<>();
    }
    
    public int getIdReporte() {
        return idReporte;
    }

    public void setIdReporte(int idReporte) {
        this.idReporte = idReporte;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getTipoReporte() {
        return tipoReporte;
    }

    public void setTipoReporte(String tipoReporte) {
        this.tipoReporte = tipoReporte;
    }

    public ArrayList<Venta> getListaVentas() {
        return listaVentas;
    }

    public void setListaVentas(ArrayList<Venta> listaVentas) {
        this.listaVentas = listaVentas;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    //Metodos
    public void reporteVentas() {
        System.out.println("REPORTE DE VENTAS");

        if (listaVentas.isEmpty()) {
            System.out.println("No hay ventas registradas.");
        } else {
            for (int i = 0; i < listaVentas.size(); i++) {
                listaVentas.get(i).imprimirVenta();
            }
        }
    }

    public void reporteInventario() {
        System.out.println("REPORTE DE INVENTARIO");

        if (inventario != null) {
            inventario.listarProductos();
        } else {
            System.out.println("No hay inventario asignado.");
        }
    }

    public void exportarReporte() {
        System.out.println("Reporte exportado correctamente.");
    }

    public void visualizarReporte() {
        System.out.println("VISUALIZAR REPORTE");
        System.out.println("ID Reporte: " + this.idReporte);
        System.out.println("Fecha Inicio: " + this.fechaInicio);
        System.out.println("Fecha Fin: " + this.fechaFin);
        System.out.println("Tipo Reporte: " + this.tipoReporte);
    }

    public void agregarVenta(Venta venta) {
        this.listaVentas.add(venta);
        System.out.println("Venta agregada al reporte.");
    }
}
