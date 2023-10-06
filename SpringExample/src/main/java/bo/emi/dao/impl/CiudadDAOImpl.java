package bo.emi.dao.impl;

import bo.emi.dao.CiudadDAO;
import bo.emi.entities.Ciudad;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CiudadDAOImpl implements CiudadDAO {
    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public List<Ciudad> obtenerCiudades() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("select c from Ciudad c", Ciudad.class).list();
    }

    @Override
    public Ciudad obtenerCiudad(Integer id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Ciudad.class, id);
    }

    @Override
    public void registrarCiudad(Ciudad ciudad) {
        Session session = sessionFactory.getCurrentSession();
        session.save(ciudad);
    }
}
