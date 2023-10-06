package bo.emi.dao.impl;

import bo.emi.dao.EstudianteDAO;
import bo.emi.entities.Estudiante;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EstudianteDAOImpl implements EstudianteDAO {
    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public List<Estudiante> obtenerEstudiantes() {
        Session session = sessionFactory.getCurrentSession();
        Query<Estudiante> query = session.createQuery(
                "select e from Estudiante e where e.estado = :estado");
        query.setParameter("estado", "A");
        return query.list();
    }

    @Override
    public Estudiante obtenerEstudiante(Integer id) {
        return null;
    }

    @Override
    public void registrarEstudiante(Estudiante estudiante) {
        // Completar
    }

    @Override
    public void actualizarEstudiante(Estudiante estudiante) {
        // Completar
    }

    @Override
    public void eliminarEstudiante(Integer id) {
        // Completar
    }
}
