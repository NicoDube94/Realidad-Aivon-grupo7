package AivonModelos;

import com.mysql.jdbc.Connection;
import java.sql.*;

public class Conexion {
   private  String base="aivon";
   private  String url = "jdbc:mysql://localhost:3306/"+base;
   private  String user = "root";
   private  String pass = "";
           Connection con=null;
    
    public Connection getConnection(){
        if(con==null)
        {
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                con = (Connection)DriverManager.getConnection(url, user, pass);
            }
            catch (SQLException |ClassNotFoundException e)
            {
                System.err.print(e);
            }
        }
            return con;
    }
}


