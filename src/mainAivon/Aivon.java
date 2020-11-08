package mainAivon;

import AivonModelos.*;

import aivonEntidades.*;
import java.time.LocalDate;
import java.time.Month;

public class Aivon {

    public static void main(String[] args) {
        
         Conexion cone=new Conexion();
         
//  --------------------------------------------- Producto --------------------------------------------------------       
       
        Producto crema=new Producto(450, 5, 655, 400, "crema Hins", "hidratacion de la piel", true);
        
        Producto cremaAfeitar=new Producto(200, 2, 310, 162, "Guillet", "crema de afeitar ultra suave", true);
        
// ---------------------------------------------- CajaDeAivon ------------------------------------------------------

        CajaAivon caja1=new CajaAivon(2,padido1,crema);
        
        CajaAivon caja2=new CajaAivon(2,pedido2,cremaAfeitar);
        
//   ----------------------------------------------- Pedido ---------------------------------------------------------

        Pedido epdido1=new Pedido(2, camp1 , revendedor1, LocalDate.of(2019,12,14),localDate.of(2019,12,24), true);
        
        Pedido epdido2=new Pedido(2, camp2 , revendedor1, LocalDate.of(2020,02,07),localDate.of(2020,02,14), true);

//   ------------------------------------------------ Campania ------------------------------------------------------

        Campania camp1=new Campania(45, LocalDate.of(2019,11,17), 1450, 6000);
        
        Campania camp2=new Campania(32, LocalDate.of(2020,01,11), 2000, 6500);

//   ------------------------------------------------ Revendedor ---------------------------------------------------- 
    
        Revendedor revendedor1=new Revendedor("Maria Gomez", "2664785496", "marita32@gmail.com",true,true);
        
        Revendedor revendedor2=new Revendedor("Analia Perez", "2657121314", "perezana@gmail.com", true, true);
        
//   ------------------------------------------------- HistoricoCampania ---------------------------------------------

        HistoricoCampania histo1=new HistoricoCampania(camp1, revendedor1);
        
        HistoricoCampania histo2=new HistoricoCampania(camp2, revendedor2);
        
//   -------------------------------------------------- Datas ---------------------------------------------------------

        ProductoData pd=new ProductoData(cone);
        
        PedidoData pedidoD=new PedidoData(cone);
        
        CajaAivonData cajaD=new CajaAivonData(cone);
        
        CampaniaData camD=new CampaniaData(cone);
        
        RevendedorData revD=new RevendedorData(cone);
        
        HistoricoCampania hsd=new HistoricoCampania(cone);
        
//   -------------------------------------------------- Metodos ---------------------------------------------------------     

    }
}