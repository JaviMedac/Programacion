package Controlador;

import Modelo.Musica;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ControladorM {

    private ControladorMusica conexion;

    public ControladorM(ControladorMusica conexion) {
        this.conexion = conexion;
    }

    public ArrayList<Musica> ObtenerTodasCanciones() throws SQLException {
        ArrayList<Musica> lista = new ArrayList();
        String consulta = "SELECT * FROM musica1";
        ResultSet rset = conexion.ejecutarSelect(consulta);
        while (rset.next()) {
            String titulo = rset.getString("titulo");
            String album = rset.getString("album");
            String artista = rset.getString("artista");
            String duracion = rset.getString("duracion");
            Musica cancion = new Musica(titulo,album,artista,duracion);
            lista.add(cancion);
        }
        return lista;
    }
}

