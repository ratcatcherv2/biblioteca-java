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
    private String num_socio;
    private String libros_prestados;
    Usuario next;

    public Usuario(String nombre, String num_socio, String libros_prestados, Usuario next) {
        this.nombre = nombre;
        this.num_socio = num_socio;
        this.libros_prestados = libros_prestados;
        this.next = null;
    }
    
    
    
    
}
