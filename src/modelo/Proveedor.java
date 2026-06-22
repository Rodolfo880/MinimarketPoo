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
public class Proveedor extends Persona{
    private String idProveedor;
    private String codigoProveedor;
    private String empresa;
    private String ruc;
    private String correoEmpresa;
    private String telefonoEmpresa;
    private String direccionEmpresa;
    private boolean estadoProveedor;

    public Proveedor() {
    }

    public Proveedor(String idProveedor, String codigoProveedor, String empresa,
            String ruc, String correoEmpresa, String telefonoEmpresa,
            String direccionEmpresa, boolean estadoProveedor) {
        
        this.idProveedor = idProveedor;
        this.codigoProveedor = codigoProveedor;
        this.empresa = empresa;
        this.ruc = ruc;
        this.correoEmpresa = correoEmpresa;
        this.telefonoEmpresa = telefonoEmpresa;
        this.direccionEmpresa = direccionEmpresa;
        this.estadoProveedor = estadoProveedor;
    }
    
    public Proveedor(int idPersona, String tipoDocumento,
        String nroDocumento, String apPaterno,
        String apMaterno, String nombre,
        Date fechaNacimiento, String sexo,
        String telefono, String correo,
        String direccion, boolean estado,

        String idProveedor,
        String codigoProveedor,
        String empresa,
        String ruc,
        String correoEmpresa,
        String telefonoEmpresa,
        String direccionEmpresa,
        boolean estadoProveedor) {

    super(idPersona, tipoDocumento, nroDocumento,
            apPaterno, apMaterno, nombre,
            fechaNacimiento, sexo, telefono,
            correo, direccion, estado);

        this.idProveedor = idProveedor;
        this.codigoProveedor = codigoProveedor;
        this.empresa = empresa;
        this.ruc = ruc;
        this.correoEmpresa = correoEmpresa;
        this.telefonoEmpresa = telefonoEmpresa;
        this.direccionEmpresa = direccionEmpresa;
        this.estadoProveedor = estadoProveedor;
    }    

    public String getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(String idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getCodigoProveedor() {
        return codigoProveedor;
    }

    public void setCodigoProveedor(String codigoProveedor) {
        this.codigoProveedor = codigoProveedor;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getCorreoEmpresa() {
        return correoEmpresa;
    }

    public void setCorreoEmpresa(String correoEmpresa) {
        this.correoEmpresa = correoEmpresa;
    }

    public String getTelefonoEmpresa() {
        return telefonoEmpresa;
    }

    public void setTelefonoEmpresa(String telefonoEmpresa) {
        this.telefonoEmpresa = telefonoEmpresa;
    }

    public String getDireccionEmpresa() {
        return direccionEmpresa;
    }

    public void setDireccionEmpresa(String direccionEmpresa) {
        this.direccionEmpresa = direccionEmpresa;
    }

    public boolean isEstadoProveedor() {
        return estadoProveedor;
    }

    public void setEstadoProveedor(boolean estadoProveedor) {
        this.estadoProveedor = estadoProveedor;
    }
    
    //METODOS
    public void registrarProveedor() {
        System.out.println("Proveedor registrado correctamente.");
    }

    public void actualizarProveedor() {
        System.out.println("Proveedor actualizado correctamente.");
    }

    @Override
    public void mostrarDatos() {

        System.out.println("DATOS PROVEEDOR");
        System.out.println("Código: " + this.codigoProveedor);
        System.out.println("Empresa: " + this.empresa);
        System.out.println("RUC: " + this.ruc);
        System.out.println("Correo Empresa: " + this.correoEmpresa);
        System.out.println("Teléfono Empresa: " + this.telefonoEmpresa);
        System.out.println("Dirección Empresa: " + this.direccionEmpresa);
    }

    @Override
    public void registrar() {
        System.out.println("Registrando proveedor...");
    }
}
