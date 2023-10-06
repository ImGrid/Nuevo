package bo.emi.service.impl;

import bo.emi.dao.CiudadDAO;
import bo.emi.dao.EstudianteDAO;
import bo.emi.dto.EstudianteDTO;
import bo.emi.entities.Ciudad;
import bo.emi.entities.Estudiante;
import bo.emi.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
@Service
public class EstudianteServiceImpl implements EstudianteService {
    // Inyectar el objeto de acceso a datos.
    @Autowired
    private EstudianteDAO estudianteDAO;

    @Autowired
    private CiudadDAO ciudadDAO;
    @Override
    @Transactional
    public List<EstudianteDTO> obtenerEstudiantes() {
        List<EstudianteDTO> estudianteDTOS = new ArrayList<>();
        List<Estudiante> estudiantes = estudianteDAO.obtenerEstudiantes();

        for (Estudiante estudiante : estudiantes) {
            Ciudad ciudad = estudiante.getCiudad();
            estudianteDTOS.add(new EstudianteDTO(estudiante.getId(), estudiante.getNombre(),
                    estudiante.getApellido(), estudiante.getFechaNacimiento(),
                    estudiante.getSemestre(), ciudad.getId(), ciudad.getNombre(),
                    estudiante.getDireccion()));
        }

        return estudianteDTOS;
    }

    @Override
    @Transactional
    public EstudianteDTO obtenerEstudiante(Integer id) {
        // Completar
        return null;
    }

    @Override
    @Transactional
    public void registrarEstudiante(EstudianteDTO estudianteDTO) {
        // Completar
    }

    @Override
    @Transactional
    public void actualizarEstudiante(EstudianteDTO estudianteDTO) {
        // Completar
    }

    @Override
    @Transactional
    public void eliminarEstudiante(Integer id) {
        // Completar
    }
}
