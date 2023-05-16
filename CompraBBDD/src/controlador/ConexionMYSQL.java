package controlador;

import java.sql.*;
import java.util.Calendar;
import java.util.TimeZone;

public class ConexionMYSQL {

    private String BD;
    private String USUARIO;
    private String PASS;
    private Connection connection;
    private String HOST;
    private TimeZone zonahoraria;

    public ConexionMYSQL(String usuario, String pass, String bd) {
        this.HOST = "localhost";
        this.USUARIO = usuario;
        this.PASS = pass;
        this.BD = bd;
        this.connection = null;
    }

    public void conectar() throws SQLException, ClassNotFoundException {
        if (connection == null || connection.isClosed()) {

        }
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Calendar now = Calendar.getInstance();
            zonahoraria = now.getTimeZone();
            connection = (Connection) DriverManager.getConnection("jdbc:mysql://" + HOST + "/"
                    + BD + "?user=" + USUARIO + "&password=" + PASS + "&userLegacyDateTimeCode = false&serverTimeZone="
                    + zonahoraria.getID());
        } catch (SQLException sql) {
            sql.printStackTrace();
        }
    }

    public void desconectar() throws SQLException {
        if (connection != null && !connection.isClosed()) {
            connection.close();
        }
    }

    public ResultSet ejecutarSelect(String consulta) throws SQLException {
        Statement stmt = connection.createStatement();
        ResultSet rset = stmt.executeQuery(consulta);
        return rset;
    }

    //EJECUTAR UNA CONSULTA INSERT,DELETE O UPDATE
    public int ejecutarInsertDeleteUpdate(String consulta) throws SQLException {
        Statement stmt = connection.createStatement();
        int fila = stmt.executeUpdate(consulta);
        return fila;
    }

}
