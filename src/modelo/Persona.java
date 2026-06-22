/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.util.Date;

/**
 *
 * @author USUARIO
 */
public class Persona {
    protected int idPersona;
    protected String tipoDocumento;
    protected String nroDocumento;
    protected String apPaterno;
    protected String apMaterno;
    protected String nombre;
    protected Date fechaNacimiento;
    protected String sexo;
    protected String telefono;
    protected String correo;
    protected String direccion;
    protected boolean estado;

    public Persona() {
    }

    public Persona(int idPersona, String tipoDocumento, String nroDocumento,
            String apPaterno, String apMaterno, String nombre,
            Date fechaNacimiento, String sexo, String telefono,
            String correo, String direccion, boolean estado) {
        
        this.idPersona = idPersona;
        this.tipoDocumento = tipoDocumento;
        this.nroDocumento = nroDocumento;
        this.apPaterno = apPaterno;
        this.apMaterno = apMaterno;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.estado = estado;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNroDocumento() {
        return nroDocumento;
    }

    public void setNroDocumento(String nroDocumento) {
        this.nroDocumento = nroDocumento;
    }

    public String getApPaterno() {
        return apPaterno;
    }

    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    public String getApMaterno() {
        return apMaterno;
    }

    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    //METODOS
    public void mostrarDatos() {
        System.out.println("Datos de Persona:");
        System.out.println("Documento: " + this.tipoDocumento + " - " + this.nroDocumento);
        System.out.println("Nombre completo: " + this.nombre + " " + this.apPaterno + " " + this.apMaterno);
        System.out.println("Teléfono: " + this.telefono);
        System.out.println("Correo: " + this.correo);
        System.out.println("Dirección: " + this.direccion);
    }
     
    public void registrar() {
        System.out.println("Registrando persona...");
    }

    public int calcularEdad() {
        if (this.fechaNacimiento == null) {
            return 0;
        }

        Date fechaActual = new Date();

        int anioActual = fechaActual.getYear() + 1900;
        int anioNacimiento = this.fechaNacimiento.getYear() + 1900;

        return anioActual - anioNacimiento;
    }

    public boolean validarDocumento() {
        if (this.tipoDocumento == null || this.nroDocumento == null) {
            return false;
        }

        if (this.tipoDocumento.equalsIgnoreCase("DNI")) {
            return this.nroDocumento.length() == 8;
        }

        if (this.tipoDocumento.equalsIgnoreCase("RUC")) {
            return this.nroDocumento.length() == 11;
        }

        return this.nroDocumento.length() > 0;
    }
}
