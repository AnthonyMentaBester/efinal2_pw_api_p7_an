package uce.edu.pweb.repository;

import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import uce.edu.pweb.repository.modelo.Producto;

@Transactional
@ApplicationScoped
public class IProductoRepositoryImpl implements IProductoRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void ingresarProducto(Producto producto) {
       this.entityManager.persist(producto);
    }

    @Override
    public List<Producto> listarProductos() {
        TypedQuery<Producto> myQuery = this.entityManager.createQuery("SELECT p FROM Producto p",Producto.class);
        return myQuery.getResultList();
    }

    @Override
    public Producto buscarProducto(String codigoBarras) {
        TypedQuery<Producto> myQuery = this.entityManager.createQuery("SELECT p FROM Producto p WHERE p.codigoBarras = :codigoBarras",Producto.class).setParameter("codigoBarras", codigoBarras);
        return myQuery.getSingleResult();
    }

}
