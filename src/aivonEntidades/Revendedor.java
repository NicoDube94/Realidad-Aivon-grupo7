package aivonEntidades;

public class Revendedor {
    private int idRevendedor;
    private String nombreCompleto, telefono, email;
    private boolean activa, estado;

    public Revendedor(int idRevendedor, String nombreCompleto, String telefono, String email, boolean activa, boolean estado) {
        this.idRevendedor = idRevendedor;
        this.nombreCompleto = nombreCompleto;
        this.telefono = telefono;
        this.email = email;
        this.activa = activa;
        this.estado = estado;
    }

    public Revendedor(String nombreCompleto, String telefono, String email, boolean activa, boolean estado) {
        this.nombreCompleto = nombreCompleto;
        this.telefono = telefono;
        this.email = email;
        this.activa = activa;
        this.estado = estado;
    }

    public int getIdRevendedor() {
        return idRevendedor;
    }

    public void setIdRevendedor(int idRevendedor) {
        this.idRevendedor = idRevendedor;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Revendedor{" + "nombreCompleto=" + nombreCompleto + ", telefono=" + telefono + ", email=" + email + ", activa=" + activa + ", estado=" + estado + '}';
    }
    
    
}
