package bo.emi.service;

import bo.emi.dto.EstudianteDTO;

import java.util.List;

public interface EstudianteService {
    List<EstudianteDTO> obtenerEstudiantes();
    EstudianteDTO obtenerEstudiante(Integer id);
    void registrarEstudiante(EstudianteDTO estudianteDTO);
    void actualizarEstudiante(EstudianteDTO estudianteDTO);
    void eliminarEstudiante(Integer id);
}
