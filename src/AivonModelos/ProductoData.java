package AivonModelos;

import aivonEntidades.Producto;
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ProductoData {
    private Connection con;

    public ProductoData(Conexion con) {
        this.con = con.getConnection();
    }
    
    public void guardarProducto(Producto product){
        String sql="INSERT INTO producto(estado, nombre, uso, tamañoEnCm3, precioVentaAlpublico, precioCosto, estrellas)"+
                "VALUES (?,?,?,?,?,?,?)";
        
        try{
            PreparedStatement ps= con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setBoolean(1, product.isEstado());
            ps.setString(2,product.getNombre());
            ps.setString(3, product.getUso());
            ps.setInt(4, product.getTamCm3());
            ps.setDouble(5, product.getPrecioPublico());
            ps.setDouble(6, product.getPrecioCosto());
            ps.setInt(7, product.getEstrellas());
            
            ps.executeUpdate();
            ResultSet rs= ps.getGeneratedKeys();
            ps.close();
            
            if(rs.next()){
                product.setIdProducto(rs.getInt(1));
            }else{ 
                JOptionPane.showMessageDialog(null, "no se puede obtener id");
            }
            rs.close();
        }catch(SQLException e){
            JOptionPane.showInternalMessageDialog(null, "no se emcontro el producto");
    };
    }
}
