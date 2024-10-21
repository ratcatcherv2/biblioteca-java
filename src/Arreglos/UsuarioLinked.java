/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arreglos;

import Clases.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class UsuarioLinked {
    private Usuario cabecera;
    
    public UsuarioLinked(){
        this.cabecera = null;
    }
    
    public List<Usuario> obtenerUsuarios(){
        List<Usuario> lista_usuarios = new ArrayList<>();
        
        if (cabecera == null){
            System.out.println("Lista vacia.");
            return null;
        }
        
        Usuario temp = cabecera;
        while (temp != null){
            lista_usuarios.add(temp);
            temp = temp.siguiente;
        }
        
        return lista_usuarios;
    }
    
    
    // agregar usuario al final
    public void agregar(String nombre, String numero_socio, String libros_prestados){
        Usuario nuevo_usuario = new Usuario(nombre,numero_socio,libros_prestados);
        if (cabecera == null){
            cabecera = nuevo_usuario;
        }else {
            Usuario temporal = cabecera;
            while (temporal.siguiente != null){
                temporal = temporal.siguiente;
            }
            temporal.siguiente = nuevo_usuario;
        }
    }
    
    public void eliminar(String numero_socio){
        if (cabecera == null){
            System.out.println("No se encontraron registros de usuarios.");
            return;
        }
        
        if (cabecera.getNumero_socio() == numero_socio){
            cabecera = cabecera.siguiente;
            return;
        }
        
        Usuario actual = cabecera;
        while (actual.siguiente != null && actual.siguiente.getNumero_socio() != numero_socio){
            actual = actual.siguiente;
        }
        
        if (actual.siguiente == null){
            System.out.println("Usuario no encontrado");
        }else {
            actual.siguiente = actual.siguiente.siguiente;
        }
        
    }
    
    
}
