/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author usuario
 */
public class Pregunta {
    
    public int id;
    public String nacionalidad;
    public String deporte;
    public String apodo;

    public Pregunta(int id, String nacionalidad, String deporte, String apodo) {
        this.id = id;
        this.nacionalidad = nacionalidad;
        this.deporte = deporte;
        this.apodo = apodo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    @Override
    public String toString() {
        return "Pregunta{" + "id=" + id + ", nacionalidad=" + nacionalidad + ", deporte=" + deporte + ", apodo=" + apodo + '}';
    }
    
    
}
