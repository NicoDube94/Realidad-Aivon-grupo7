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
            
            JOptionPane.showMessageDialog(null, "error al agrregar producto");
        }
    }
    public void actializarProducto(Producto product){
        String sql="UPDATE producoto SET estado=?, nombre=?, uso=?, tamañoEnCm3=?, precioVentaAlpublico=?, precioCosto=?, estrellas=? WHERE idProducto=?;";
        try{
            PreparedStatement ps=con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setBoolean(1, product.isEstado());
            ps.setString(2, product.getNombre());
            ps.setString(3, product.getUso());
            ps.setInt(4, product.getTamCm3());
            ps.setDouble(5, product.getPrecioPublico());
            ps.setDouble(6, product.getPrecioCosto());
            ps.setInt(7, product.getEstrellas());
            ps.setInt(8, product.getIdProducto());
            ps.executeUpdate();
            
            ps.close();
        }catch(SQLException e){
             JOptionPane.showMessageDialog(null, "no se encontro el producto que sea actualizar");
        }
    }
    public Producto bucarProducto(int id){
       Producto producto=null;
       String sql="SELECT * FROM producto WHERE idProducto=?";
       try{
           PreparedStatement ps=con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
           ps.setInt(1, id);
           
            ResultSet rs = ps.executeQuery();
           
            if(rs.next()){
                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setEstado(rs.getBoolean("estado"));
                producto.setNombre(rs.getString("nombre"));
                producto.setUso(rs.getString("uso"));
                producto.setTamCm3(rs.getInt("tamañoEnCm3"));
                producto.setPrecioPublico(rs.getDouble("precioVentaAlPublico"));
                producto.setPrecioCosto(rs.getDouble("precioCosto"));
                producto.setEstrellas(rs.getInt("estrellas"));
            }else{
                JOptionPane.showMessageDialog(null, "El id especificado no existe");
            }
             ps.close();
            rs.close();
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, "no se encontro el producto que buscas");
       }
     return producto;  
    }
    public void modificarEstado(Producto producto, boolean estado){
        String sql="UPDATE producto SET estado =? WHERE producto.idProducto = ?;";
        try{
        PreparedStatement ps=con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        ps.setBoolean(1, estado);
        ps.setInt(2, producto.getIdProducto());
        
        ResultSet rs= ps.executeQuery();
       
        if(rs.next()){
                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setEstado(rs.getBoolean("estado"));
            }else{
                JOptionPane.showMessageDialog(null, "El id especificado no existe");
            }
         ps.close();
        rs.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "no se encontro el producto que buscas"); 
       }
        
  }
}
