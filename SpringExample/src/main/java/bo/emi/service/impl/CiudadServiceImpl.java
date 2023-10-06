package bo.emi.service.impl;

import bo.emi.dao.CiudadDAO;
import bo.emi.dto.CiudadDTO;
import bo.emi.entities.Ciudad;
import bo.emi.service.CiudadService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CiudadServiceImpl implements CiudadService, ApplicationListener<ContextRefreshedEvent> {
    @Autowired
    private CiudadDAO ciudadDAO;

    @Transactional
    @Override
    public List<CiudadDTO> obtenerCiudades() {
        List<Ciudad> ciudades = ciudadDAO.obtenerCiudades();
        List<CiudadDTO> ciudadDTOs = new ArrayList<>();

        for (Ciudad ciudad : ciudades) {
            ciudadDTOs.add(new CiudadDTO(ciudad.getId(), ciudad.getNombre()));
        }

        return ciudadDTOs;
    }

    @Override
    @Transactional
    public void onApplicationEvent(ContextRefreshedEvent event) {
        List<Ciudad> ciudades = ciudadDAO.obtenerCiudades();

        if (ciudades.isEmpty()) {
            ciudadDAO.registrarCiudad(new Ciudad("La Paz"));
            ciudadDAO.registrarCiudad(new Ciudad("Cochabamba"));
            ciudadDAO.registrarCiudad(new Ciudad("Santa Cruz"));
            ciudadDAO.registrarCiudad(new Ciudad("Sucre"));
            ciudadDAO.registrarCiudad(new Ciudad("Oruro"));
            ciudadDAO.registrarCiudad(new Ciudad("Potosí"));
            ciudadDAO.registrarCiudad(new Ciudad("Tarija"));
            ciudadDAO.registrarCiudad(new Ciudad("Beni"));
            ciudadDAO.registrarCiudad(new Ciudad("Pando"));
        }
    }
}
