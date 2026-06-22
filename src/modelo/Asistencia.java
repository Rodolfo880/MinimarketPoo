/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.sql.Time;
import java.util.Date;
/**
 *
 * @author USUARIO
 */
public class Asistencia {
    private int idAsistencia;
    private Date fecha;
    private Time horaEntrada;
    private Time horaSalida;
    private String observacion;

    private Empleado empleado; // Asociacion con Empleado
    
     public Asistencia() {
    }

    public Asistencia(int idAsistencia, Date fecha,
                      Time horaEntrada, Time horaSalida,
                      String observacion, Empleado empleado) {

        this.idAsistencia = idAsistencia;
        this.fecha = fecha;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.observacion = observacion;
        this.empleado = empleado;
    }

    public int getIdAsistencia() {
        return idAsistencia;
    }

    public void setIdAsistencia(int idAsistencia) {
        this.idAsistencia = idAsistencia;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(Time horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public Time getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Time horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    //Metodos
    public void registrar() {
        System.out.println("Asistencia registrada correctamente.");
    }

    public double calcularHorasTrabajadas() {
        if (this.horaEntrada == null || this.horaSalida == null) {
            return 0;
        }

        long diferencia = this.horaSalida.getTime() - this.horaEntrada.getTime();
        double horas = diferencia / (1000.0 * 60 * 60);
        return horas;
    }

    public void consultar() {
        System.out.println("DATOS ASISTENCIA");
        System.out.println("ID Asistencia: " + this.idAsistencia);
        System.out.println("Fecha: " + this.fecha);
        System.out.println("Hora Entrada: " + this.horaEntrada);
        System.out.println("Hora Salida: " + this.horaSalida);
        System.out.println("Horas Trabajadas: " + calcularHorasTrabajadas());
        System.out.println("Observación: " + this.observacion);

        if (this.empleado != null) {
            System.out.println("Empleado: " + this.empleado.getNombre());
        } else {
            System.out.println("Empleado: No asignado");
        }
    }
}
