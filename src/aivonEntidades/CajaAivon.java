package aivonEntidades;

public class CajaAivon {
    private int idCaja, cantidadProductos,estrellasCaja;
    private Pedido pedido;
    private Producto producto;

    public CajaAivon(int idCaja, int cantidadProductos, int estrellasCaja, Pedido pedido, Producto producto) {
        this.idCaja = idCaja;
        this.cantidadProductos = cantidadProductos;
        this.estrellasCaja = estrellasCaja;
        this.pedido = pedido;
        this.producto = producto;
    }

    public CajaAivon(int cantidadProductos, int estrellasCaja, Pedido pedido, Producto producto) {
        this.cantidadProductos = cantidadProductos;
        this.estrellasCaja = estrellasCaja;
        this.pedido = pedido;
        this.producto = producto;
    }
    public CajaAivon(){}

    public int getIdCaja() {
        return idCaja;
    }

    public void setIdCaja(int idCaja) {
        this.idCaja = idCaja;
    }

    public int getCantidadProductos() {
        return cantidadProductos;
    }

    public void setCantidadProductos(int cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
    }

    public int getEstrellasCaja() {
        return estrellasCaja;
    }

    public void setEstrellasCaja(int estrellasCaja) {
        this.estrellasCaja = estrellasCaja;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "CajaAivon{" + "cantidadProductos=" + cantidadProductos + ", estrellasCaja=" + estrellasCaja + ", pedido=" + pedido + ", producto=" + producto + '}';
    }
    
    
}
