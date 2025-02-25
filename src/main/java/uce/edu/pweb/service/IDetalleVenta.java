package uce.edu.pweb.service;

import uce.edu.pweb.repository.modelo.DetalleVenta;
import uce.edu.pweb.service.To.DetalleVentaTo;

public interface IDetalleVenta {
    public DetalleVentaTo buscarPorCantidad(Integer cantidad);

}
