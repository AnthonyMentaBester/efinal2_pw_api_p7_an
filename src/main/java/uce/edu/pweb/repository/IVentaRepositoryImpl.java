package uce.edu.pweb.repository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import uce.edu.pweb.repository.modelo.Venta;

@Transactional
@ApplicationScoped
public class IVentaRepositoryImpl implements IVentaRepository{
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void ingresarVenta(Venta venta) {
        this.entityManager.persist(venta);
        
    }

}
