/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author Ruben Camero
 */
public class Libro {
    final int codigo;
    final String autor;
    final String nombre;
    Clasificacion clasificacion;

    public Libro(int codigo, String autor, String nombre, Clasificacion clasificacion) {
        this.codigo = codigo;
        this.autor = autor;
        this.nombre = nombre;
        this.clasificacion = clasificacion;
    }
    
    
}
