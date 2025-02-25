package uce.edu.pweb.service.To;

import jakarta.persistence.Column;
import jakarta.persistence.OneToOne;
import uce.edu.pweb.repository.modelo.DetalleVenta;

public class VentaTo {

    private Integer id;
    
    private Integer numVenta;
    
    private String cedulaCliente;
    
    private Double totalVenta;

    
    private DetalleVenta detalleVenta;


    public VentaTo() {
    }


    public VentaTo(Integer id, Integer numVenta, String cedulaCliente, Double totalVenta, DetalleVenta detalleVenta) {
        this.id = id;
        this.numVenta = numVenta;
        this.cedulaCliente = cedulaCliente;
        this.totalVenta = totalVenta;
        this.detalleVenta = detalleVenta;
    }


    public VentaTo(Integer numVenta, String cedulaCliente) {
        this.numVenta = numVenta;
        this.cedulaCliente = cedulaCliente;
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
