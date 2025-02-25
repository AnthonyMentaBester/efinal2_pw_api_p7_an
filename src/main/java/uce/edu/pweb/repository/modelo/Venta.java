package uce.edu.pweb.repository.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "venta")
public class Venta {

    @Id
    @GeneratedValue(generator = "seq_venta",strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "seq_venta",sequenceName = "seq_venta",allocationSize = 1)
    @Column(name = "vta_id")
    private Integer id;
    @Column(name = "vta_numVenta")
    private Integer numVenta;
    @Column(name = "vta_cedulaCliente")
    private String cedulaCliente;
    @Column(name = "vta_totalVenta")
    private Double totalVenta;

    @OneToOne(mappedBy = "venta")
    private DetalleVenta detalleVenta;

    public Venta() {
    }

    public Venta(Integer id, Integer numVenta, Double totalVenta, DetalleVenta detalleVenta) {
        this.id = id;
        this.numVenta = numVenta;
        this.totalVenta = totalVenta;
        this.detalleVenta = detalleVenta;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumVenta() {
        return numVenta;
    }

    public void setNumVenta(Integer numVenta) {
        this.numVenta = numVenta;
    }

    public String getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(String cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public Double getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(Double totalVenta) {
        this.totalVenta = totalVenta;
    }

    public DetalleVenta getDetalleVenta() {
        return detalleVenta;
    }

    public void setDetalleVenta(DetalleVenta detalleVenta) {
        this.detalleVenta = detalleVenta;
    }

    
    

}
