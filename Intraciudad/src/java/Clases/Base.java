/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



/**
 *
 * @author Carlos Elliot
 */
public class Base {
    
    private Connection conn = null;
    private String nombr;
    private String p;
    private String idusr;
    private Statement estancia;
        
    public Connection conectar()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String DB, uss, pass;
            DB = "jdbc:mysql://localhost/db_intraciudad2";
            uss = "root";
            pass = "n0m3l0";
            conn = DriverManager.getConnection(DB, uss, pass);
            System.out.println("Conexion exitosa");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return conn;
    }
     public void cierraConexion() throws SQLException {
        this.conn.close();
    }    
     
      public ResultSet Reporte(String titulo, String calle, String colonia, String delegacion, String numero, String descripcion, String Imagen) throws SQLException {
        Statement st = (Statement) conn.createStatement();
        return st.executeQuery("call SP_RReporte('"+titulo+"','"+calle+"','"+colonia+"','"+delegacion+"','"+numero+"','"+descripcion+"','"+Imagen+"')");
     }
      public ResultSet VerImg(String img) throws SQLException { /*Revisa si la imagen ya existe para los reportes*/
        Statement st = (Statement) conn.createStatement();
        return st.executeQuery("call SP_VerImg('"+img+"')");
     }
     public ResultSet VerRep()throws SQLException { 
        Statement st = (Statement) conn.createStatement();
        return st.executeQuery("call sp_verReporte()");
     }
     public ResultSet Linea_todo(String id)throws SQLException { 
        Statement st = (Statement) conn.createStatement();
        return st.executeQuery("call SP_OEstAnt('"+id+"');");
     }     
     public ResultSet RepInd(String tit, int idd)throws SQLException { 
        Statement st = (Statement) conn.createStatement();
        return st.executeQuery("call sp_RepInd('"+tit+"','"+idd+"');");
     }     
}

