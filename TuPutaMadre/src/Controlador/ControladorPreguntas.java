/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Pregunta;
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
    
    public ArrayList <Pregunta> ObtenerTodasPreguntas() throws SQLException{
        ArrayList <Pregunta> lista = new ArrayList <>();
        String consulta = "SELECT * FROM respuestas";
        ResultSet rset = conexion.ejecutarSelect(consulta);
        while(rset.next()){
            String id = rset.getString("id");
            String nacionalidad = rset.getString("nacionalidad");
            String deporte = rset.getString("deporte");
            String apodo = rset.getString("apodo");
            Pregunta pregunta = new Pregunta(id,nacionalidad,deporte,apodo);
            lista.add(pregunta);
        }
        return lista;
    }
}
