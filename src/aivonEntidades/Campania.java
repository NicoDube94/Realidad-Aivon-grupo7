package aivonEntidades;

import java.util.Date;

public class Campania {
    private int idCampania, estrellasCampania;
    private Date fechaInicio, fechaFin;
    private double montoMinimo, montoTooe;

    public Campania(int idCampania, int estrellasCampania, Date fechaInicio, Date fechaFin, double montoMinimo, double montoTooe) {
        this.idCampania = idCampania;
        this.estrellasCampania = estrellasCampania;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.montoMinimo = montoMinimo;
        this.montoTooe = montoTooe;
    }

    public Campania(int estrellasCampania, Date fechaInicio, Date fechaFin, double montoMinimo, double montoTooe) {
        this.estrellasCampania = estrellasCampania;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.montoMinimo = montoMinimo;
        this.montoTooe = montoTooe;
    }

    public int getIdCampania() {
        return idCampania;
    }

    public void setIdCampania(int idCampania) {
        this.idCampania = idCampania;
    }

    public int getEstrellasCampania() {
        return estrellasCampania;
    }

    public void setEstrellasCampania(int estrellasCampania) {
        this.estrellasCampania = estrellasCampania;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public double getMontoMinimo() {
        return montoMinimo;
    }

    public void setMontoMinimo(double montoMinimo) {
        this.montoMinimo = montoMinimo;
    }

    public double getMontoTooe() {
        return montoTooe;
    }

    public void setMontoTooe(double montoTooe) {
        this.montoTooe = montoTooe;
    }

    @Override
    public String toString() {
        return "Campania{" + "estrellasCampania=" + estrellasCampania + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", montoMinimo=" + montoMinimo + ", montoTooe=" + montoTooe + '}';
    }
    
    
}
