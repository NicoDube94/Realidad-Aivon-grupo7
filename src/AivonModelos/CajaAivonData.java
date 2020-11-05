package AivonModelos;

import aivonEntidades.CajaAivon;
import aivonEntidades.Pedido;
import aivonEntidades.Producto;
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CajaAivonData {
    Connection con;
    Conexion co=new Conexion();;
    public CajaAivonData(Conexion con){
        this.con=con.getConnection();
    }
    public void guardarCaja(CajaAivon cjA){
       String sql="INSERT INTO producto(idPedido, idProducto, cantidadProductos, estrellasCajas)"+
                "VALUES (?,?,?,?)";
        
        try{
            PreparedStatement ps= con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, cjA.getPedido().getIdPedido());
            ps.setInt(2,cjA.getProducto().getIdProducto());
            ps.setInt(3, cjA.getCantidadProductos());
            ps.setInt(4, cjA.getEstrellasCaja());
            
            ps.executeUpdate();
            ResultSet rs= ps.getGeneratedKeys();
            ps.close();
            
            if(rs.next()){
                cjA.setIdCaja(rs.getInt(1));
            }else{ 
                JOptionPane.showMessageDialog(null, "no se puede obtener id");
            }
            rs.close();
        }catch(SQLException e){
            
            JOptionPane.showMessageDialog(null, "error al guardar caja");
        }
    }
    public List<CajaAivon> obtenerCajas(){
        List<CajaAivon> cajas=new ArrayList<>();
        CajaAivon caja;
     
        String sql="SELECT * FROM cajadeaivon;";
        try{
            PreparedStatement ps=con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs=ps.executeQuery();
            ps.close();
            while(rs.next()){
                caja=new CajaAivon();
                caja.setIdCaja(rs.getInt("idCaja"));
                Pedido pdi=buscarPedido(rs.getInt("idPedido"));
                Producto pr=buscarProducto(rs.getInt("idProducto"));
                caja.setPedido(pdi);
                caja.setProducto(pr);
                caja.setCantidadProductos(rs.getInt("cantidadProductos"));
                caja.setEstrellasCaja(rs.getInt("estrellasCaja"));
                cajas.add(caja);
                
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "no se pueden obtener las cajas");
        }
        return cajas;
    }
    public void obtenerImporte(CajaAivon cjA){
//            completar aca ¿...? jeje...
    }
    public Producto buscarProducto(int idPro){
        ProductoData pro=new ProductoData(co);
      return pro.bucarProducto(idPro);
    }
    public Pedido buscarPedido(int idPe){
        PedidoData ped=new PedidoData(co);
        return ped.buscarPedido(idPe);
    }
}
