package uce.edu.pweb.repository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import uce.edu.pweb.repository.modelo.DetalleVenta;

@Transactional
@ApplicationScoped
public class IDetalleVentaImpl implements IDetalleVenta {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public DetalleVenta buscarPorCantidad(Integer cantidad) {
        TypedQuery<DetalleVenta> myQuery = this.entityManager.createQuery("SELECT dv FROM DetalleVenta dv WHERE dv.cantidad = :cantidad",DetalleVenta.class).setParameter("cantidad", cantidad);
        return myQuery.getSingleResult();
    }

}

