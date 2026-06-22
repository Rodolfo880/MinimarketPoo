package modelo;
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
public class Cliente extends Persona {
    private int idCliente;
    private String codigoCliente;
    private Date fechaRegistro;
    private int puntosAcumulados;
    private String tipoCliente;

    public Cliente() {
    }

    public Cliente(int idCliente, String codigoCliente, Date fechaRegistro,
            int puntosAcumulados, String tipoCliente) {
        
        this.idCliente = idCliente;
        this.codigoCliente = codigoCliente;
        this.fechaRegistro = fechaRegistro;
        this.puntosAcumulados = puntosAcumulados;
        this.tipoCliente = tipoCliente;
    }    
    
    public Cliente(int idPersona, String tipoDocumento, String nroDocumento,
                   String apPaterno, String apMaterno, String nombre,
                   Date fechaNacimiento, String sexo, String telefono,
                   String correo, String direccion, boolean estado,
                   int idCliente, String codigoCliente,
                   Date fechaRegistro, int puntosAcumulados,
                   String tipoCliente) {

        super(idPersona, tipoDocumento, nroDocumento, apPaterno,
                apMaterno, nombre, fechaNacimiento, sexo,
                telefono, correo, direccion, estado);

        this.idCliente = idCliente;
        this.codigoCliente = codigoCliente;
        this.fechaRegistro = fechaRegistro;
        this.puntosAcumulados = puntosAcumulados;
        this.tipoCliente = tipoCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public int getPuntosAcumulados() {
        return puntosAcumulados;
    }

    public void setPuntosAcumulados(int puntosAcumulados) {
        this.puntosAcumulados = puntosAcumulados;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
    
    //METODOS 
     public void registrarCliente() {
        System.out.println("Cliente registrado correctamente.");
    }

    public void actualizarCliente() {
        System.out.println("Cliente actualizado correctamente.");
    }

    public void agregarVenta() {
        this.puntosAcumulados = this.puntosAcumulados + 10;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("DATOS CLIENTE");
        System.out.println("Código Cliente: " + this.codigoCliente);
        System.out.println("Documento: " + this.tipoDocumento + " - " + this.nroDocumento);
        System.out.println("Nombre completo: " + this.nombre + " " + this.apPaterno + " " + this.apMaterno);
        System.out.println("Teléfono: " + this.telefono);
        System.out.println("Correo: " + this.correo);
        System.out.println("Tipo Cliente: " + this.tipoCliente);
        System.out.println("Puntos acumulados: " + this.puntosAcumulados);
    }

    @Override
    public void registrar() {
        System.out.println("Registrando cliente...");
    }
}
