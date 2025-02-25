package uce.edu.pweb.service;

import java.util.List;
import java.util.function.Function;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import uce.edu.pweb.repository.IProductoRepository;
import uce.edu.pweb.repository.modelo.Producto;
import uce.edu.pweb.service.To.ProductoTo;

@ApplicationScoped
public class IProductoServiceImpl implements IProductoService {

    @Inject
    private IProductoRepository iProductoRepository;

    Function<ProductoTo, Producto> mapP = pTo -> {
        Producto producto = new Producto(pTo.getId(),pTo.getCodigoBarras(), pTo.getNombre(), pTo.getCategoria(), pTo.getStock(),
                pTo.getPrecio(), pTo.getDetalleVenta());
        return producto;

    };

    Function<Producto, ProductoTo> mapTo = p -> {
        ProductoTo productoTo = new ProductoTo(p.getId(),p.getCodigoBarras(), p.getNombre(), p.getCategoria(), p.getStock(),
                p.getPrecio(), p.getDetalleVenta());
        return productoTo;

    };
    Function<Producto, ProductoTo> mapBarrasTo = p -> {
        ProductoTo productoTo = new ProductoTo(p.getCodigoBarras(), p.getNombre());
        return productoTo;

    };

    @Override
    public void ingresarProducto(ProductoTo productoTo) { 
        ProductoTo p = this.buscarProducto(productoTo.getCodigoBarras());
        if(p != null){
            productoTo.setStock(productoTo.getStock() + p.getStock());
            throw new RuntimeException("El producto ya existe");
        }
        this.iProductoRepository.ingresarProducto(mapP.apply(productoTo));
    }

    @Override
    public ProductoTo buscarProducto(String codigoBarras) {
        this.iProductoRepository.buscarProducto(codigoBarras);
        return this.mapTo.apply(this.iProductoRepository.buscarProducto(codigoBarras));
    }

    @Override
    public List<ProductoTo> listarProductos() {
        List<Producto> productos = this.iProductoRepository.listarProductos();
        return productos.stream().map(mapBarrasTo).toList();
    }

}
