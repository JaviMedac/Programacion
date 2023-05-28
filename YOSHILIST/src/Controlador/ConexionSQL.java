/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.sql.*;
import java.util.*;

/**
 *
 * @author usuario
 */
public class ConexionSQL {

    private String BD;
    private String USUARIO;
    private String PASS;
    private Connection conexion;
    private String HOST;
    private TimeZone zonahoraria;

    public ConexionSQL(String usuario, String pass, String bd) {
        this.BD = bd;
        this.USUARIO = usuario;
        this.PASS = pass;
        this.conexion = null;
        this.HOST = "localhost";
    }
    
    //Este metodo sera utilizado para realizar una conexion a nuestra base de datos
    public void conectar() throws SQLException, ClassNotFoundException {
        if (conexion == null || conexion.isClosed()) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Calendar now = Calendar.getInstance();
                zonahoraria = now.getTimeZone();
                conexion = (Connection) DriverManager.getConnection("jdbc:mysql://" 
                        + this.HOST + "/" + BD + "?user=" + this.USUARIO + "&password=" + this.PASS
                        + "&userLegacyDateTimeCode=false&ServerTimeZone=" + this.zonahoraria.getID());
            } catch (Exception e) {
            }
        }
    }
    
    //Cierra la conexion de la base de datos
    public void desconectar() throws SQLException, ClassNotFoundException {
        if (conexion != null || !conexion.isClosed()) {
            conexion.close();
        }
    }
    
    //Este metodo lo utilizaremos cuando queramos realizar un select en nuestra base de datos
    public ResultSet ejecutarSelect(String consulta) throws SQLException{
        Statement stmt = conexion.createStatement();
        ResultSet res = stmt.executeQuery(consulta);
        return res;
    }
    
    public int ejecutarInsDelUpd(String consulta) throws SQLException{
        Statement stmt = conexion.createStatement();
        int fila = stmt.executeUpdate(consulta);
        return fila;
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

    public Connection getConexion() {
        return conexion;
    }

    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }

    public String getHOST() {
        return HOST;
    }

    public void setHOST(String HOST) {
        this.HOST = HOST;
    }

    public TimeZone getZonahoraria() {
        return zonahoraria;
    }

    public void setZonahoraria(TimeZone zonahoraria) {
        this.zonahoraria = zonahoraria;
    }

    
}
