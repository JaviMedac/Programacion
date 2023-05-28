/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Articulo;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author usuario
 */
public class ControladorArticulos {

    private ConexionSQL conexion;

    public ControladorArticulos(ConexionSQL conexion) {
        this.conexion = conexion;
    }

    public ArrayList<Articulo> obtenerArticulos() throws SQLException {
        ArrayList<Articulo> lista = new ArrayList<>();
        String consulta = "SELECT * FROM compra";
        ResultSet rset = conexion.ejecutarSelect(consulta);
        while (rset.next()) {

            String nombre = rset.getString("nombre");
            int unidades = parseInt(rset.getString("unidades"));
            Articulo articulos = new Articulo(nombre, unidades);
            lista.add(articulos);
        }
        return lista;
    }

 
}
