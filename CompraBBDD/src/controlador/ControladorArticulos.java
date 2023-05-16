package controlador;

import java.util.ArrayList;
import modelo.Articulo;
import java.sql.*;

public class ControladorArticulos {

    private ConexionMYSQL conexion;

    public ControladorArticulos(ConexionMYSQL conexion) {
        this.conexion = conexion;
    }

    public ArrayList<Articulo> ObtenerTodosArticulos() throws SQLException {
        ArrayList<Articulo> lista = new ArrayList();
        String consulta = "SELECT * FROM compra";
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
