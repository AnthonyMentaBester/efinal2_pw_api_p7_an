package uce.edu.pweb.repository.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "detalleVenta")
public class DetalleVenta {

    @Id
    @GeneratedValue(generator = "seq_detalleVenta",strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "seq_detalleVenta",sequenceName = "seq_detalleVenta",allocationSize = 1)
    @Column(name = "dtva_id")
    private Integer id;
    @Column(name = "dtva_cantidad")
    private Integer cantidad;
    @Column(name = "dtva_precioUnitario")
    private Double precioUnitario;
    @Column(name = "dtva_subtotal")
    private Double subtotal;

    @OneToOne
    @JoinColumn(name = "pto_id_detalleVenta")
    private Producto producto;

    @OneToOne
    @JoinColumn(name = "vta_id_detalleVenta")
    private Venta venta;

    public DetalleVenta() {
    }

    public DetalleVenta(Integer id, Integer cantidad, Double precioUnitario, Double subtotal, Producto producto,
            Venta venta) {
        this.id = id;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.subtotal = subtotal;
        this.producto = producto;
        this.venta = venta;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    

    

}
