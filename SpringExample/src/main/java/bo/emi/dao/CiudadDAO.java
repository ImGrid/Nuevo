package bo.emi.dao;

import bo.emi.entities.Ciudad;

import java.util.List;

public interface CiudadDAO {
    List<Ciudad> obtenerCiudades();
    Ciudad obtenerCiudad(Integer id);
    void registrarCiudad(Ciudad ciudad);
}
