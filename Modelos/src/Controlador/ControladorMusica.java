/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.TimeZone;

/**
 *
 * @author usuario
 */
public class ControladorMusica {

    private String BD;
    private String USUARIO;
    private String PASS;
    private String HOST;
    private Connection connection;
    private TimeZone zonahoraria;

    public ControladorMusica(String usuario, String pass, String bd) {
        this.HOST = "localhost";
        this.USUARIO = usuario;
        this.PASS = pass;
        this.BD = bd;
        this.connection = null;

    }

    public String getBD() {
        return BD;
    }

    public void setBD(String BD) {
        this.BD = BD;
    }

    public String getUSUARIO() {
        return USUARIO;
    }

    public void setUSUARIO(String USUARIO) {
        this.USUARIO = USUARIO;
    }

    public String getPASS() {
        return PASS;
    }

    public void setPASS(String PASS) {
        this.PASS = PASS;
    }

    public String getHOST() {
        return HOST;
    }

    public void setHOST(String HOST) {
        this.HOST = HOST;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public TimeZone getZonahoraria() {
        return zonahoraria;
    }

    public void setZonahoraria(TimeZone zonahoraria) {
        this.zonahoraria = zonahoraria;
    }

    //CONECTAR A LA BASE DE DATOS
    public void conectar() throws SQLException {
        if (connection == null || connection.isClosed()) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Calendar now = Calendar.getInstance();
                zonahoraria = now.getTimeZone();
                connection = (java.sql.Connection) DriverManager.getConnection(
                        "jdbc:mysql://" + HOST + "/" + BD + "?user=" + USUARIO + "&password=" + PASS
                        + "&useLegacyDatetimeCode=false&serverTimezone=" + zonahoraria.getID());
            } catch (ClassNotFoundException e) {
                System.out.println(e.getMessage());
            } catch (SQLException a) {
                System.out.println(a.getMessage());
            }
        }
    }

    //METODO PARA DESCONECTARSE DE LA BASE DE DATOS
    public void desconectar() throws SQLException {
        if (connection != null && connection.isClosed()) {
            connection.close();
        }
    }

    //METODO PARA INSERTAR EN LA TABLA
    public void insert(java.sql.Connection c, String consulta) throws SQLException {
        Statement stmt = c.createStatement();
        stmt.executeUpdate(consulta);
    }

    public ResultSet ejecutarSelect(String consulta) throws SQLException {
        Statement stmt = connection.createStatement();
        ResultSet rset = stmt.executeQuery(consulta);
        return rset;
    }

    public int ejecutarInsertDeleteUpdate(String consulta) throws SQLException {
        Statement stmt = connection.createStatement();
        int fila = stmt.executeUpdate(consulta);
        return fila; //devuelve el numero de filas de mi consulta (insertada, actualizada o elminidada)
    }

    public void borrarFila(java.sql.Connection conecction, String consulta) {
        try {

            Statement stmt = conecction.createStatement();

            stmt.executeUpdate(consulta);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
