/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.PreguntasDeportes;
import Modelo.PreguntasVideojuegos;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author usuario
 */
public class ControladorPreguntas {
    
    private ConexionMySQL conexion;
    
    public ControladorPreguntas (ConexionMySQL conexion){
        this.conexion = conexion;
    }
    
    public ArrayList <PreguntasDeportes> ObtenerTodasPreguntas() throws SQLException{
        ArrayList <PreguntasDeportes> lista = new ArrayList <>();
        String consulta = "SELECT * FROM respuestas";
        ResultSet rset = conexion.ejecutarSelect(consulta);
        while(rset.next()){
            int id = parseInt(rset.getString("id"));
            String nacionalidad = rset.getString("nacionalidad");
            String deporte = rset.getString("deporte");
            String apodo = rset.getString("apodo");
            PreguntasDeportes pregunta = new PreguntasDeportes(id,nacionalidad,deporte,apodo);
            lista.add(pregunta);
        }
        return lista;
    }
    public ArrayList <PreguntasVideojuegos> ObtenerTodasVideojuegos() throws SQLException{
        ArrayList <PreguntasVideojuegos> lista = new ArrayList <>();
        String consulta = "SELECT * FROM videojuegos";
        ResultSet rset = conexion.ejecutarSelect(consulta);
        while(rset.next()){
            int id = parseInt(rset.getString("id"));
            String categoria = rset.getString("categoria");
            int año_lanzamiento= parseInt(rset.getString("año_lanzamiento"));
            String consola = rset.getString("consola");
            PreguntasVideojuegos pregunta = new PreguntasVideojuegos(id,categoria,año_lanzamiento,consola);
            lista.add(pregunta);
        }
        return lista;
    }
}
