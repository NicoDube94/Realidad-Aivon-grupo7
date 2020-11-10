package AivonModelos;

import java.sql.*;
import aivonEntidades.*;
import javax.swing.*;
import java.util.*;

public class CampaniaData {
    Connection con;
    Conexion co=new Conexion();
    public CampaniaData(Conexion con){
        this.con=con.getConnection();
    }
    public void crearCampania(Campania campania){
        String sql="INSERT INTO campaña (fechaInicio, fechaFin, montoMinimo, montoTope, estrellasCampaña)"+
                "VALUE(?,?,?,?,?)";
        try{
            PreparedStatement ps=con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setDate(1, campania.getFechaInicio());
            ps.setDate(2, campania.getFechaFin());
            ps.setDouble(3, campania.getMontoMinimo());
            ps.setDouble(4, campania.getMontoTope());
            ps.setInt(5, campania.getEstrellasCampania());
        }catch(SQLException e){
           JOptionPane.showMessageDialog(null, "error al buscar campaña"); 
        }
    }
    public Campania buscarCampania(int id){
        Campania cam=null;
        String sql="SELECT * FROM campaña WHERE idCampaña=?;";
        try{
            PreparedStatement ps=con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                cam.setIdCampania(rs.getInt("idCampaña"));
                cam.setFechaInicio(rs.getDate("fechaInicio"));
                cam.setFechaFin(rs.getDate("fechaFin"));
                cam.setMontoMinimo(rs.getDouble("montoMinimo"));
                cam.setMontoTope(rs.getDouble("montoTope"));
                cam.setEstrellasCampania(rs.getInt("estrellasCampaña"));
            }
             ps.close();
             rs.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "error al buscar campaña");
        }
        return cam;
    }
}
