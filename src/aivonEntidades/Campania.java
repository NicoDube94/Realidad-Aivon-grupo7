package aivonEntidades;

import java.sql.Date;

public class Campania {
    private int idCampania, estrellasCampania;
    private Date fechaInicio, fechaFin;
    private double montoMinimo, montoTope;

    public Campania(int idCampania, int estrellasCampania, Date fechaInicio, Date fechaFin, double montoMinimo, double montoTope) {
        this.idCampania = idCampania;
        this.estrellasCampania = estrellasCampania;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.montoMinimo = montoMinimo;
        this.montoTope = montoTope;
    }

    public Campania(int estrellasCampania, Date fechaInicio, Date fechaFin, double montoMinimo, double montoTope) {
        this.estrellasCampania = estrellasCampania;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.montoMinimo = montoMinimo;
        this.montoTope = montoTope;
    }
    public Campania(){}

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

    public double getMontoTope() {
        return montoTope;
    }

    public void setMontoTope(double montoTope) {
        this.montoTope = montoTope;
    }

    @Override
    public String toString() {
        return "Campania{" + "estrellasCampania=" + estrellasCampania + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", montoMinimo=" + montoMinimo + ", montoTooe=" + montoTope + '}';
    }
    
    
}
