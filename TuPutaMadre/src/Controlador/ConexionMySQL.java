/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.util.TimeZone;
import java.sql.*;
import java.util.Calendar;


public class ConexionMySQL {
    //Atributos:
    private String BD;
    private String USUARIO;
    private String PASS;
    private Connection connection;
    private String HOST;
    private TimeZone zonahoraria;
   
    //Constructores:
    public ConexionMySQL() {
    }
    public ConexionMySQL(String USUARIO, String PASS, String BD) {
        this.BD = BD;
        this.USUARIO = USUARIO;
        this.PASS = PASS;
        this.HOST="localhost";
        this.connection=null;
    }
   
    //Métodos:
    public Connection getConnection() {
        return connection;
    }
    //Conectar la BBDD:
    public void conectar() throws SQLException {
        if(connection == null || connection.isClosed()){
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Calendar now = Calendar.getInstance();
                zonahoraria = now.getTimeZone();
                connection = (Connection) DriverManager.getConnection(
                        "jdbc:mysql://" + HOST + "/" + BD + "?user=" + USUARIO + "&password=" + PASS
                                + "&useLegacyDatetimeCode=false&serverTimezone=" + zonahoraria.getID());
            } catch(ClassNotFoundException e){
                System.out.println(e.getMessage());
            } catch (SQLException a) {
                System.out.println(a.getMessage());
            }
        }
    }
      //Desconectar la BBDD:
    public void desconectar() throws SQLException{
        if(connection!=null && !connection.isClosed()){
            connection.close();
        }
    }
      //Consulta con SELECT:
    public ResultSet ejecutarSelect(String consulta) throws SQLException{
        Statement stmt = connection.createStatement();
        ResultSet rset = stmt.executeQuery(consulta);
        return rset;
    }
      //Ejesutar una consulta INSERT, DELETE o UPDATE:
    public int ejecutarInsertDeleteUpdate(String consulta) throws SQLException{
        Statement stmt = connection.createStatement();
        int fila = stmt.executeUpdate(consulta);
        return fila;
    }
   
}

