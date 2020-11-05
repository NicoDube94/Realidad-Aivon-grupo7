package AivonModelos;

import aivonEntidades.Campania;
import aivonEntidades.Pedido;
import aivonEntidades.Revendedor;
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class PedidoData {
       Connection con;
       Conexion co=new Conexion();
    public PedidoData(Conexion con){
        this.con=con.getConnection();
    }   
    public void guardarPedido(Pedido pedido){
        String sql="INSERT INTO pedio(idCampaña, idRevendedor, fechaIngreso,fechaEntrega, fechaDePago, cantidadDeCajas, imoprtePedido, estrellasPedido, estado)"+
                "VALUES(?,?,?,?,?,?,?,?,?)";
        try{
            PreparedStatement ps=con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, pedido.getCampania().getIdCampania());
            ps.setInt(2, pedido.getRevendedor().getIdRevendedor());
            ps.setDate(3, pedido.getFechaIngreso());
            ps.setDate(4, pedido.getFechaEntrega());
            ps.setDate(5, pedido.getFechaDePago());
            ps.setInt(6, pedido.getCantCajas());
            ps.setDouble(7, pedido.getImportePedido());
            ps.setInt(8, pedido.getEstrellasPedido());
            ps.setBoolean(9, pedido.isEstado());
            
            ResultSet rs=ps.getGeneratedKeys();
            ps.close();
            if(rs.next()){
                pedido.setIdPedido(rs.getInt(1));
            }else{
               JOptionPane.showMessageDialog(null, "no se puede obtener id");
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "imposible agregar pedido");
        }
    }
    public void obtenerImportePedio(Pedido pedido){
        
    }
    public void obtenerEstrellasPedido(Pedido pedido){
        
    }
    public void modificarEstado(Pedido pedido){
        
    }
    public void pagarPedido(Pedido pedido){
        
    }
    public Pedido buscarPedido(int id){
        Pedido pedido=null;
        String sql="SELECT * FROM pedido  WHERE idPedido=?;";
        try{
            PreparedStatement ps=con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
            
            ResultSet rs=ps.executeQuery();
            ps.close();
            if(rs.next()){
                pedido.setIdPedido(rs.getInt("idPedido"));
                Campania c=buscarCampania(rs.getInt("idCampaña"));
//                Revendedor r=buscarRevendedor(rs.getInt("idRevendedor"));
                pedido.setFechaIngreso(rs.getDate("fechaIngreso"));
                pedido.setFechaEntrega(rs.getDate("fechaEntrega"));
                pedido.setFechaDePago(rs.getDate("fechaDePago"));
                pedido.setCantCajas(rs.getInt("cantidadDeCajas"));
                pedido.setImportePedido(rs.getDouble("importePedido"));
                pedido.setEstrellasPedido(rs.getInt("estrellasPedido"));
                pedido.setEstado(rs.getBoolean("estado"));
            }else{
                JOptionPane.showMessageDialog(null, "El id especificado no existe");
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "no se encontro el pedido que buscas");

        }
        return pedido;
    }
    public Campania buscarCampania(int idCam){
        CampaniaData cd=new CampaniaData(co);
        return cd.buscarCampania(idCam);
    }
    /*public Revendedor buscarRevendedor(int idRev){
        RevendedorData rd=new RevendedorData();
        return rd.buscarRevendedor(idCam);
    }*/
}
