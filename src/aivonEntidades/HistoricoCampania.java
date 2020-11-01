package aivonEntidades;

public class HistoricoCampania {
    private int idHistorico, estrellasCampaniaRevendedor;
    private Campania campaniaH;
    private Revendedor revendedorH;
    private boolean activo;

    public HistoricoCampania(int idHistorico, int estrellasCampaniaRevendedor, Campania campaniaH, Revendedor revendedorH, boolean activo) {
        this.idHistorico = idHistorico;
        this.estrellasCampaniaRevendedor = estrellasCampaniaRevendedor;
        this.campaniaH = campaniaH;
        this.revendedorH = revendedorH;
        this.activo = activo;
    }

    public HistoricoCampania(int estrellasCampaniaRevendedor, Campania campaniaH, Revendedor revendedorH, boolean activo) {
        this.estrellasCampaniaRevendedor = estrellasCampaniaRevendedor;
        this.campaniaH = campaniaH;
        this.revendedorH = revendedorH;
        this.activo = activo;
    }

    public int getIdHistorico() {
        return idHistorico;
    }

    public void setIdHistorico(int idHistorico) {
        this.idHistorico = idHistorico;
    }

    public int getEstrellasCampaniaRevendedor() {
        return estrellasCampaniaRevendedor;
    }

    public void setEstrellasCampaniaRevendedor(int estrellasCampaniaRevendedor) {
        this.estrellasCampaniaRevendedor = estrellasCampaniaRevendedor;
    }

    public Campania getCampaniaH() {
        return campaniaH;
    }

    public void setCampaniaH(Campania campaniaH) {
        this.campaniaH = campaniaH;
    }

    public Revendedor getRevendedorH() {
        return revendedorH;
    }

    public void setRevendedorH(Revendedor revendedorH) {
        this.revendedorH = revendedorH;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "HistoricoCampania{" + "idHistorico=" + idHistorico + ", estrellasCampaniaRevendedor=" + estrellasCampaniaRevendedor + ", campaniaH=" + campaniaH + ", revendedorH=" + revendedorH + ", activo=" + activo + '}';
    }
    
    
}
