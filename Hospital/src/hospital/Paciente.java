package hospital;

import java.util.Scanner;

public class Paciente {

    private String nombre;
    private int numero_paciente;
    private String dni;
    private String fecha;
    private String malestar;
    private String[] listaEmpleados;
    private String[] Paciente = new String[100];
    private boolean estado = false;

    public Paciente(String nombre, int numero_paciente, String dni, String fecha, String malestar) {
        this.nombre = nombre;
        this.numero_paciente = numero_paciente;
        this.dni = dni;
        this.fecha = fecha;
        this.malestar = malestar;
        this.estado = true;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero_paciente() {
        return numero_paciente;
    }

    public void setNumero_paciente(int numero_paciente) {
        this.numero_paciente = numero_paciente;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getMalestar() {
        return malestar;
    }

    public void setMalestar(String malestar) {
        this.malestar = malestar;
    }

    public String[] getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(String[] listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public String[] getPaciente() {
        return Paciente;
    }

    public void setPaciente(String[] Paciente) {
        this.Paciente = Paciente;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public static void consultarAlta(Paciente paciente) {
        System.out.println(paciente.isEstado());
    }

}
