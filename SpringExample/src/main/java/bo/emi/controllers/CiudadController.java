package bo.emi.controllers;

import bo.emi.dto.CiudadDTO;
import bo.emi.service.CiudadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/ciudades")
public class CiudadController {
    @Autowired
    private CiudadService ciudadService;

    @GetMapping()
    public @ResponseBody List<CiudadDTO> listar() {
        return ciudadService.obtenerCiudades();
    }
}
