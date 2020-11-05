package aivonEntidades;

public class Producto {
    private int idProducto,tamCm3,estrellas;
    private double precioPublico, precioCosto;
    private String nombre,uso;
    private boolean estado;

    public Producto(int idProducto, int tamCm3, int estrellas, double precioPublico, double precioCosto, String nombre, String uso, boolean estado) {
        this.idProducto = idProducto;
        this.tamCm3 = tamCm3;
        this.estrellas = estrellas;
        this.precioPublico = precioPublico;
        this.precioCosto = precioCosto;
        this.nombre = nombre;
        this.uso = uso;
        this.estado = estado;
    }

    public Producto(int tamCm3, int estrellas, double precioPublico, double precioCosto, String nombre, String uso, boolean estado) {
        this.tamCm3 = tamCm3;
        this.estrellas = estrellas;
        this.precioPublico = precioPublico;
        this.precioCosto = precioCosto;
        this.nombre = nombre;
        this.uso = uso;
        this.estado = estado;
    }
    public Producto(){};

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getTamCm3() {
        return tamCm3;
    }

    public void setTamCm3(int tamCm3) {
        this.tamCm3 = tamCm3;
    }

    public int getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }

    public double getPrecioPublico() {
        return precioPublico;
    }

    public void setPrecioPublico(double precioPublico) {
        this.precioPublico = precioPublico;
    }

    public double getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(double precioCosto) {
        this.precioCosto = precioCosto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Producto{" + "tamCm3=" + tamCm3 + ", estrellas=" + estrellas + ", precioPublico=" + precioPublico + ", precioVenta=" + precioCosto + ", nombre=" + nombre + ", uso=" + uso + ", estado=" + estado + '}';
    }
    
    
}
