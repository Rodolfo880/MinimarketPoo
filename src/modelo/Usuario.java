/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author USUARIO
 */
public class Usuario {
    private int idUsuario;
    private String username;
    private String contraseña;
    private String rol;
    private boolean estado;
    private Empleado empleado; //Asosicion con empleado

    public Usuario() {
    }

    public Usuario(int idUsuario, String username, String contraseña, 
            String rol, boolean estado, Empleado empleado) {
        
        this.idUsuario = idUsuario;
        this.username = username;
        this.contraseña = contraseña;
        this.rol = rol;
        this.estado = estado;
        this.empleado = empleado;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    
    //Metodos
    public boolean iniciarSesion(String usuario, String clave) {
        return this.username.equals(usuario)
                && this.contraseña.equals(clave)
                && this.estado == true;
    }

    public void cerrarSesion() {
        System.out.println("Sesión cerrada correctamente.");
    }

    public void mostrarDatosUsuario() {
        System.out.println("DATOS USUARIO");
        System.out.println("Usuario: " + this.username);
        System.out.println("Rol: " + this.rol);
        System.out.println("Estado: " + this.estado);

        if (this.empleado != null) {
            System.out.println("Empleado: " + this.empleado.getNombre());
        } else {
            System.out.println("Empleado: No asignado");
        }
    }
}
