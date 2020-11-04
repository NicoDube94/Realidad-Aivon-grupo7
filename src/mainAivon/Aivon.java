package mainAivon;

import AivonModelos.Conexion;
import AivonModelos.ProductoData;
import aivonEntidades.Producto;

public class Aivon {

    public static void main(String[] args) {
        
        Conexion cone=new Conexion();
        Producto crema=new Producto(450, 5, 655, 400, "crema Hins", "hidratacion de la piel", true);
        Producto cremaAfeitar=new Producto(200, 2, 310, 162, "Guillet", "crema de afeitar ultra suave", true);
        ProductoData pd=new ProductoData(cone);
        
//        pd.guardarProducto(cremaAfeitar);
//        pd.actializarProducto(cremaAfeitar);
        pd.modificarEstado(crema, true);
    }
    
}
