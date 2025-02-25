package uce.edu.pweb.service;

import java.util.List;

import uce.edu.pweb.repository.modelo.Producto;
import uce.edu.pweb.service.To.ProductoTo;

public interface IProductoService {
    public void ingresarProducto(ProductoTo productoTo);
    public ProductoTo buscarProducto(String codigoBarras);
    public List<ProductoTo> listarProductos();

}
