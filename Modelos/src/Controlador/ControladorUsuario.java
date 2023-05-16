/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.TimeZone;
import java.sql.*;

/**
 *
 * @author usuario
 */
public class ControladorUsuario {

    public Connection conexion;
    public Statement sentencia;
    public ResultSet resultado;

    private String BD;
    private String USUARIO;
    private String PASS;
    private String HOST;
    private Connection connection;
    private TimeZone zonahoraria;

    public ControladorUsuario(String usuario, String pass, String bd) {
        this.HOST = "localhost";
        this.USUARIO = usuario;
        this.PASS = pass;
        this.BD = bd;
        this.connection = null;

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

    public ResultSet ejecutarSelect(String consulta) throws SQLException {
        Statement stmt = connection.createStatement();
        ResultSet rset = stmt.executeQuery(consulta);
        return rset;
    }

//set
    public void setBD(String BD) {
        this.BD = BD;
    }

    public void setUSUARIO(String USUARIO) {
        this.USUARIO = USUARIO;
    }

    public void setPASS(String PASS) {
        this.PASS = PASS;
    }

    public void setHOST(String HOST) {
        this.HOST = HOST;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public void setZonahoraria(TimeZone zonahoraria) {
        this.zonahoraria = zonahoraria;
    }

//get
    public String getBD() {
        return BD;
    }

    public String getUSUARIO() {
        return USUARIO;
    }

    public String getPASS() {
        return PASS;
    }

    public String getHOST() {
        return HOST;
    }

    public Connection getConnection() {
        return connection;
    }

    public TimeZone getZonahoraria() {
        return zonahoraria;
    }

}
