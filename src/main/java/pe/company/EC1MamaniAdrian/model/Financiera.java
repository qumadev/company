package pe.company.EC1MamaniAdrian.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "prestamos")
public class Financiera implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int nroPrestamo;
    @Temporal(TemporalType.DATE)
    private Date fPrestamo;
    @Column
    private String financista;
    @Column
    private String cliente;
    @Column
    private double importe;
    @Column
    private int nLetras;
    @Column
    private double interes;
    

    public Financiera() {
		super();
	}

	public Financiera(Financiera financiera){
        this(financiera.getNroPrestamo(),financiera.getfPrestamo(),financiera.getFinancista(),financiera.getCliente(),
                financiera.getImporte(), financiera.getnLetras(),financiera.getInteres());
    }

    public Financiera(int nroPrestamo, Date fPrestamo, String financista, String cliente, double importe, int nLetras, double interes) {
        this.nroPrestamo = nroPrestamo;
        this.fPrestamo = fPrestamo;
        this.financista = financista;
        this.cliente = cliente;
        this.importe = importe;
        this.nLetras = nLetras;
        this.interes = interes;
    }
    
	@PrePersist
	public void prePersist() {
		this.fPrestamo=new Date();
	}

    public int getNroPrestamo() {
        return nroPrestamo;
    }

    public void setNroPrestamo(int nroPrestamo) {
        this.nroPrestamo = nroPrestamo;
    }

    public Date getfPrestamo() {
        return fPrestamo;
    }

    public void setfPrestamo(Date fPrestamo) {
        this.fPrestamo = fPrestamo;
    }

    public String getFinancista() {
        return financista;
    }

    public void setFinancista(String financista) {
        this.financista = financista;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public int getnLetras() {
        return nLetras;
    }

    public void setnLetras(int nLetras) {
        this.nLetras = nLetras;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }
}
