package pe.company.EC1MamaniAdrian.model;

import java.util.Date;

public class Constructora {
    private static final long serialVersionUID = 1L;

    private int codProyecto;
    private String nProyecto;
    private String ubicacion;
    private String municipalidad;
    private Date fAprobacion;
    private Date fEjecucion;
    private double importe;
    private int tiempoDias;
    private String ingeniero;
    private String financieraRespaldo;
    private String descripcion;

    public Constructora(Constructora constructora) {
        this(constructora.getCodProyecto(),constructora.getnProyecto(),constructora.getUbicacion()
                ,constructora.getMunicipalidad(),constructora.getfAprobacion(),constructora.getfEjecucion(),
                constructora.getImporte(),constructora.getTiempoDias(),constructora.getIngeniero(),
                constructora.getFinancieraRespaldo(),constructora.getDescripcion());
    }

    public Constructora(int codProyecto, String nProyecto, String ubicacion, String municipalidad, Date fAprobacion, Date fEjecucion, double importe, int tiempoDias, String ingeniero, String financieraRespaldo, String descripcion) {
        this.codProyecto = codProyecto;
        this.nProyecto = nProyecto;
        this.ubicacion = ubicacion;
        this.municipalidad = municipalidad;
        this.fAprobacion = fAprobacion;
        this.fEjecucion = fEjecucion;
        this.importe = importe;
        this.tiempoDias = tiempoDias;
        this.ingeniero = ingeniero;
        this.financieraRespaldo = financieraRespaldo;
        this.descripcion = descripcion;
    }

    public int getCodProyecto() {
        return codProyecto;
    }

    public void setCodProyecto(int codProyecto) {
        this.codProyecto = codProyecto;
    }

    public String getnProyecto() {
        return nProyecto;
    }

    public void setnProyecto(String nProyecto) {
        this.nProyecto = nProyecto;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getMunicipalidad() {
        return municipalidad;
    }

    public void setMunicipalidad(String municipalidad) {
        this.municipalidad = municipalidad;
    }

    public Date getfAprobacion() {
        return fAprobacion;
    }

    public void setfAprobacion(Date fAprobacion) {
        this.fAprobacion = fAprobacion;
    }

    public Date getfEjecucion() {
        return fEjecucion;
    }

    public void setfEjecucion(Date fEjecucion) {
        this.fEjecucion = fEjecucion;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public int getTiempoDias() {
        return tiempoDias;
    }

    public void setTiempoDias(int tiempoDias) {
        this.tiempoDias = tiempoDias;
    }

    public String getIngeniero() {
        return ingeniero;
    }

    public void setIngeniero(String ingeniero) {
        this.ingeniero = ingeniero;
    }

    public String getFinancieraRespaldo() {
        return financieraRespaldo;
    }

    public void setFinancieraRespaldo(String financieraRespaldo) {
        this.financieraRespaldo = financieraRespaldo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
