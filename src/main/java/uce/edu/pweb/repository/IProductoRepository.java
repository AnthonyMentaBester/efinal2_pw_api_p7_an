package uce.edu.pweb.repository;

import java.util.List;

import uce.edu.pweb.repository.modelo.Producto;

public interface IProductoRepository {
    public void ingresarProducto(Producto producto);
    public Producto buscarProducto(String codigoBarras);
    public List<Producto> listarProductos();
}
