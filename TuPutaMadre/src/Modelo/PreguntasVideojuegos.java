/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author usuario
 */
public class PreguntasVideojuegos {
    
    public int id;
    public String categoria;
    public int año_lanzamiento;
    public String consola;

    public PreguntasVideojuegos(int id, String categoria, int año_nacimiento, String consola) {
        this.id = id;
        this.categoria= categoria;
        this.año_lanzamiento = año_nacimiento;
        this.consola = consola;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getAño_nacimiento() {
        return año_lanzamiento;
    }

    public void setAño_nacimiento(int año_nacimiento) {
        this.año_lanzamiento = año_nacimiento;
    }

    public String getConsola() {
        return consola;
    }

    public void setConsola(String consola) {
        this.consola = consola;
    }

    @Override
    public String toString() {
       return "PreguntasVideojuegos{" + "id=" + id + ", categoria=" + categoria + ", a\u00f1o_nacimiento=" + año_lanzamiento + ", consola=" + consola + '}';
    }

   
    
    
}
