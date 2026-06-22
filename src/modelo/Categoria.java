/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
/**
 *
 * @author USUARIO
 */
public class Categoria {
    private int idCategoria;
    private String nombre;
    private String descripcion;
    private boolean estado;

    public Categoria() {
    }

    public Categoria(int idCategoria, String nombre, String descripcion, boolean estado) {
        this.idCategoria = idCategoria;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    //METODOS
    public void registrarCategoria() {
        System.out.println("Categoría registrada correctamente.");
    }

    public void actualizarCategoria() {
        System.out.println("Categoría actualizada correctamente.");
    }

    public void eliminarCategoria() {
        this.estado = false;
        System.out.println("Categoría eliminada correctamente.");
    }

    public void consultarCategoria() {
        System.out.println("DATOS CATEGORÍA");
        System.out.println("ID Categoría: " + this.idCategoria);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Descripción: " + this.descripcion);
        System.out.println("Estado: " + this.estado);
    }

    public void agregarProducto() {
        System.out.println("Producto agregado a la categoría.");
    }
}
