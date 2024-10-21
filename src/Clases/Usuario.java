/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 */
public class Usuario {
    private int codigo;
    private String nombre;
    private String numero_socio;
    private String libros_prestados;
    public Usuario siguiente;

    public Usuario(String nombre, String numero_socio, String libros_prestados) {
        this.nombre = nombre;
        this.numero_socio = numero_socio;
        this.libros_prestados = libros_prestados;
        this.siguiente = null;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumero_socio() {
        return numero_socio;
    }

    public void setNumero_socio(String numero_socio) {
        this.numero_socio = numero_socio;
    }

    public String getLibros_prestados() {
        return libros_prestados;
    }

    public void setLibros_prestados(String libros_prestados) {
        this.libros_prestados = libros_prestados;
    }

    public Usuario getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Usuario siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
    
}
