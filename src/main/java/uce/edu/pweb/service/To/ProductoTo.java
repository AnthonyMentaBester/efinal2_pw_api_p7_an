package uce.edu.pweb.service.To;

import jakarta.persistence.Column;
import uce.edu.pweb.repository.modelo.DetalleVenta;

public class ProductoTo {
    private Integer id;

    private String codigoBarras;

    private String nombre;
    private String categoria;

    private Integer stock;

    private Double precio;
    private DetalleVenta detalleVenta;

    public ProductoTo() {
    }

    public ProductoTo(Integer id, String codigoBarras, String nombre, String categoria, Integer stock, Double precio,
            DetalleVenta detalleVenta) {
        this.id = id;
        this.codigoBarras = codigoBarras;
        this.nombre = nombre;
        this.categoria = categoria;
        this.stock = stock;
        this.precio = precio;
        this.detalleVenta = detalleVenta;
    }

    public ProductoTo(String codigoBarras, String nombre) {
        this.codigoBarras = codigoBarras;
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public DetalleVenta getDetalleVenta() {
        return detalleVenta;
    }

    public void setDetalleVenta(DetalleVenta detalleVenta) {
        this.detalleVenta = detalleVenta;
    }

}
