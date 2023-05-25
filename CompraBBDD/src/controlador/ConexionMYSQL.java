/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.sql.*;
import java.util.Calendar;
import java.util.TimeZone;

/**
 *
 * @author usuario
 */
public class ConexionMySQL {

    private String BD;
    private String USUARIO;
    private String PASS;
    private String HOST;
    private Connection connection;
    private TimeZone zonahoraria;

    public ConexionMySQL(String usuario, String pass, String bd) {
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

    //METODO PARA DESCONECTAR DE LA BASE DE DATOS
    public void desconectar() throws SQLException {
        if (connection != null && connection.isClosed()) {
            connection.close();
        }
    }

    //METODO QUE HE PERSONALIZADO PARA INSERTAR EN LA TABLA
    public void insert(java.sql.Connection c, String consulta) {

        try {
            Statement stmt = c.createStatement();
            stmt.executeUpdate(consulta);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

//METODO QUE HE PERSONALIZADO PARA REALIZAR CONSULTAS
    public void consulta(Connection conecction, String consulta) {
        try {

            Statement stmt = conecction.createStatement();

            ResultSet rset = stmt.executeQuery(consulta);
            //recorre
            /*   while (rset.next()) {
                String nombre = rset.getString("nombre");
                int year = rset.getInt("year");
                String director = rset.getString("director");
                System.out.println(nombre + " " + year + " " + director);
            }*/
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    //FUNCION DE KIKO PARA HACER CONSULTAS
    public ResultSet ejecutarSelect(String consulta) throws SQLException {
        Statement stmt = connection.createStatement();
        ResultSet rset = stmt.executeQuery(consulta);
        return rset;
    }

    //FUNCION DE KIKO PARA EJECUTAR UNA CONSULTA INSERT,UPDATE O DELETE
    public int ejecutarInsertDeleteUpdate(String consulta) throws SQLException {
        Statement stmt = connection.createStatement();
        int fila = stmt.executeUpdate(consulta);
        return fila; //devuelve el numero de filas de mi consulta (insertada, actualizada o elminidada)
    }
//METODO QUE HE PERSONALIZADO PARA BORRAR FILAS

    public void borrarFila(java.sql.Connection conecction, String consulta) {
        try {

            Statement stmt = conecction.createStatement();

            stmt.executeUpdate(consulta);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
