package uce.edu.pweb.controller;

import java.util.List;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;
import uce.edu.pweb.repository.modelo.Producto;
import uce.edu.pweb.service.IProductoService;
import uce.edu.pweb.service.To.ProductoTo;

@Path("/productos")
public class ProductoController {

    @Inject
    private IProductoService productoService;
    
    @POST
    @Path("")
    @Consumes(MediaType.APPLICATION_JSON)
    //http://localhost:8080/supermaxi/v1.1/productos
    public void ingresarProducto(ProductoTo productoTo){
        this.productoService.ingresarProducto(productoTo);
    }

    @GET
    @Path("")
    @Consumes(MediaType.APPLICATION_JSON)
    //http://localhost:8080/supermaxi/v1.1/productos
    public List<ProductoTo> listarProductos(){
        return this.productoService.listarProductos();
    }

}
