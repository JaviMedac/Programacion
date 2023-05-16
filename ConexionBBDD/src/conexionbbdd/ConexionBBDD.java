package conexionbbdd;

import java.sql.*;
import java.util.Calendar;
import java.util.TimeZone;

public class ConexionBBDD {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String BD = "Peliculas";
        String USUARIO = "root";
        String PASS = "";
        String HOST = "localhost";

        //CARGAR DRIVER JDBC
        Class.forName("com.mysql.cj.jdbc.Driver");

        //INICIAR CONEXION
        Calendar now = Calendar.getInstance();
        TimeZone zonaHoraria = now.getTimeZone();
        Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://" + HOST + "/"
                + BD + "?user=" + USUARIO + "&password=" + PASS + "&userLegacyDateTimeCode = false&serverTimeZone="
                + zonaHoraria.getID());

        //CREAR TABLA
        PreparedStatement st = null;
        try {
            st = connection.prepareStatement("CREATE TABLE PELICULAS  (nombre varchar(50) not null, year int(5), director varchar(20))");
            st.execute();
            st.close();
        } catch (SQLException sql) {
            System.out.println("Error");
        }

        //EJECUTAR UN INSERT
        /*insert(connection,"Wall-e",1995,"WaltDisney");*/
        //EJECUTAR CONSULTA
        /*select(connection);
        delete(connection,"Wall-e");*/
        select(connection);
        

    }

    public static void insert(Connection connection, String nombre, int year, String director) {
        String consulta = "INSERT INTO peliculas(nombre,year,director) VALUES ('" + nombre + "','" + year + "','" + director + "');";

        try {
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(consulta);
        } catch (SQLException e) {
            e.printStackTrace();

        }
    }

    public static void select(Connection connection) throws SQLException {
        String consulta = "SELECT * FROM peliculas ORDER BY nombre";

        Statement stm = connection.createStatement();
        ResultSet rset = stm.executeQuery(consulta);
        while (rset.next()) {
            String nombre = rset.getString("nombre");
            System.out.println(nombre);
        }

    }
    
    public static void delete(Connection connection,String nombre) throws SQLException{
        String consulta = "DELETE FROM peliculas WHERE nombre= '"+nombre+"'";
        Statement stm = connection.createStatement();
        stm.executeUpdate(consulta);
        
    }

}
