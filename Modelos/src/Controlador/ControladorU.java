package Controlador;


import Modelo.Usuarios;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author usuario
 */
public class ControladorU {


    private ControladorUsuario conexion;

    public ControladorU(ControladorUsuario conexion) {
        this.conexion = conexion;
    }

    public ArrayList<Usuarios> ObtenerTodosUsuarios() throws SQLException {
        ArrayList<Usuarios> lista = new ArrayList();
        String consulta = "SELECT * FROM usuarios";
        ResultSet rset = conexion.ejecutarSelect(consulta);
        while (rset.next()) {
            String usuario1 = rset.getString("usuario");
            String contraseña = rset.getString("contraseña");
            String respuesta = rset.getString("respuesta");
            Usuarios usuario = new Usuarios(usuario1,contraseña,respuesta);
            lista.add(usuario);
        }
        return lista;
    }

}
