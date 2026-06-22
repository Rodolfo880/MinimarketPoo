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
public class Empleado extends Persona {
    private String idEmpleado;
    private String codigoEmpleado;
    private Date fechaIngreso;
    private String cargo;
    private double sueldo;
    private Empleado jefe;
    private ArrayList<Empleado> subordinados;
    private boolean estadoEmpleado;

    public Empleado() {
    }

    public Empleado(String idEmpleado, String codigoEmpleado, Date fechaIngreso,
            String cargo, double sueldo, Empleado jefe,
            ArrayList<Empleado> subordinados, boolean estadoEmpleado) {
        
        this.idEmpleado = idEmpleado;
        this.codigoEmpleado = codigoEmpleado;
        this.fechaIngreso = fechaIngreso;
        this.cargo = cargo;
        this.sueldo = sueldo;
        this.jefe = jefe;
        this.subordinados = subordinados;
        this.estadoEmpleado = estadoEmpleado;
    }

    public Empleado(int idPersona, String tipoDocumento, String nroDocumento,
                    String apPaterno, String apMaterno, String nombre,
                    Date fechaNacimiento, String sexo, String telefono,
                    String correo, String direccion, boolean estado,
                    String idEmpleado, String codigoEmpleado, Date fechaIngreso,
                    String cargo, double sueldo, Empleado jefe,
                    ArrayList<Empleado> subordinados, boolean estadoEmpleado) {
    
        super(idPersona, tipoDocumento, nroDocumento, apPaterno, apMaterno,
                nombre, fechaNacimiento, sexo, telefono, correo, direccion, estado);

        this.idEmpleado = idEmpleado;
        this.codigoEmpleado = codigoEmpleado;
        this.fechaIngreso = fechaIngreso;
        this.cargo = cargo;
        this.sueldo = sueldo;
        this.jefe = jefe;
        this.subordinados = subordinados;
        this.estadoEmpleado = estadoEmpleado;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public Empleado getJefe() {
        return jefe;
    }

    public void setJefe(Empleado jefe) {
        this.jefe = jefe;
    }

    public ArrayList<Empleado> getSubordinados() {
        return subordinados;
    }

    public void setSubordinados(ArrayList<Empleado> subordinados) {
        this.subordinados = subordinados;
    }

    public boolean isEstadoEmpleado() {
        return estadoEmpleado;
    }

    public void setEstadoEmpleado(boolean estadoEmpleado) {
        this.estadoEmpleado = estadoEmpleado;
    }
    
    //METODOS
    public void agregarSubordinado(Empleado empleado) {
        this.subordinados.add(empleado);
    }

    public void registrarAsistencia() {
        System.out.println("Asistencia registrada para el empleado: " + this.nombre);
    }

    public double calcularSueldo() {
        return this.sueldo;
    }

    public void mostrarDatosEmpleado() {
        mostrarDatos();
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Datos del Empleado:");
        System.out.println("Código: " + this.codigoEmpleado);
        System.out.println("Nombre: " + this.nombre + " " + this.apPaterno + " " + this.apMaterno);
        System.out.println("Cargo: " + this.cargo);
        System.out.println("Sueldo: " + this.sueldo);

        if (this.jefe != null) {
            System.out.println("Jefe: " + this.jefe.getNombre());
        } else {
            System.out.println("Jefe: No asignado");
        }
    }

    @Override
    public void registrar() {
        System.out.println("Registrando empleado...");
    }    
}