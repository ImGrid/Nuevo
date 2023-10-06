package bo.emi.dao;

import bo.emi.entities.Estudiante;

import java.util.List;

public interface EstudianteDAO {
    List<Estudiante> obtenerEstudiantes();

    Estudiante obtenerEstudiante(Integer id);
    void registrarEstudiante(Estudiante estudiante);
    void actualizarEstudiante(Estudiante estudiante);
    void eliminarEstudiante(Integer id);
}
