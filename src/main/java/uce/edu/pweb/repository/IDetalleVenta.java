package uce.edu.pweb.repository;

import uce.edu.pweb.repository.modelo.DetalleVenta;

public interface IDetalleVenta {
    public DetalleVenta buscarPorCantidad(Integer cantidad);

}
