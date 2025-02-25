package uce.edu.pweb.service.To;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import uce.edu.pweb.repository.modelo.Producto;
import uce.edu.pweb.repository.modelo.Venta;

public class DetalleVentaTo {

    private Integer id;
    
    private Integer cantidad;
    
    private Double precioUnitario;
    
    private Double subtotal;

    
    private Producto producto;

    
    private Venta venta;


    public DetalleVentaTo() {
    }


    public DetalleVentaTo(Integer id, Integer cantidad, Double precioUnitario, Double subtotal, Producto producto,
            Venta venta) {
        this.id = id;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.subtotal = subtotal;
        this.producto = producto;
        this.venta = venta;
    }


    public DetalleVentaTo(Integer cantidad, Double precioUnitario, Double subtotal) {
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.subtotal = subtotal;
    }

    

}
