package aivonEntidades;

import java.sql.Date;

public class Pedido {
    private int idPedido, cantCajas, estrellasPedido;
    private Campania campania;
    private Revendedor revendedor;
    private double importePedido;
    private Date fechaIngreso,fechaEntrega,fechaDePago;
    private boolean estado;

    public Pedido(int idPedido, int cantCajas, int estrellasPedido, Campania campania, Revendedor revendedor, double importePedido, Date fechaIngreso, Date fechaEntrega, Date fechaDePago, boolean estado) {
        this.idPedido = idPedido;
        this.cantCajas = cantCajas;
        this.estrellasPedido = estrellasPedido;
        this.campania = campania;
        this.revendedor = revendedor;
        this.importePedido = importePedido;
        this.fechaIngreso = fechaIngreso;
        this.fechaEntrega = fechaEntrega;
        this.fechaDePago = fechaDePago;
        this.estado = estado;
    }

    public Pedido(int cantCajas, int estrellasPedido, Campania campania, Revendedor revendedor, double importePedido, Date fechaIngreso, Date fechaEntrega, Date fechaDePago, boolean estado) {
        this.cantCajas = cantCajas;
        this.estrellasPedido = estrellasPedido;
        this.campania = campania;
        this.revendedor = revendedor;
        this.importePedido = importePedido;
        this.fechaIngreso = fechaIngreso;
        this.fechaEntrega = fechaEntrega;
        this.fechaDePago = fechaDePago;
        this.estado = estado;
    }
    public Pedido(){}

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getCantCajas() {
        return cantCajas;
    }

    public void setCantCajas(int cantCajas) {
        this.cantCajas = cantCajas;
    }

    public int getEstrellasPedido() {
        return estrellasPedido;
    }

    public void setEstrellasPedido(int estrellasPedido) {
        this.estrellasPedido = estrellasPedido;
    }

    public Campania getCampania() {
        return campania;
    }

    public void setCampania(Campania campania) {
        this.campania = campania;
    }

    public Revendedor getRevendedor() {
        return revendedor;
    }

    public void setRevendedor(Revendedor revendedor) {
        this.revendedor = revendedor;
    }

    public double getImportePedido() {
        return importePedido;
    }

    public void setImportePedido(double importePedido) {
        this.importePedido = importePedido;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Date getFechaDePago() {
        return fechaDePago;
    }

    public void setFechaDePago(Date fechaDePago) {
        this.fechaDePago = fechaDePago;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Pedido{" + "idPedido=" + idPedido + ", cantCajas=" + cantCajas + ", estrellasPedido=" + estrellasPedido + ", campania=" + campania + ", revendedor=" + revendedor + ", importePedido=" + importePedido + ", fechaIngreso=" + fechaIngreso + ", fechaEntrega=" + fechaEntrega + ", fechaDePago=" + fechaDePago + ", estado=" + estado + '}';
    }
    
    
}
