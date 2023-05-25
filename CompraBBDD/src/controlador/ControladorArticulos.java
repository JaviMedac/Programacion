/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Articulo;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class ControladorArticulos {

    private ConexionMySQL conexion;

    public ControladorArticulos(ConexionMySQL conexion) {
        this.conexion = conexion;
    }

    public ConexionMySQL getConexion() {
        return conexion;
    }

    public void setConexion(ConexionMySQL conexion) {
        this.conexion = conexion;
    }

    public ArrayList<Articulo> obtenerTodosArticulos() throws SQLException {
        ArrayList<Articulo> lista = new ArrayList<>();
        String consulta = "Select * from compra";
        ResultSet rset = conexion.ejecutarSelect(consulta);
        while (rset.next()) {
            String nombre = rset.getString("nombre");
            int unidades = rset.getInt("unidades");
            Articulo articulo = new Articulo(nombre, unidades);
            lista.add(articulo);
        }
        return lista;
    }
}
