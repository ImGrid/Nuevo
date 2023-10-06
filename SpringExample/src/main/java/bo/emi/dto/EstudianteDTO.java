package bo.emi.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class EstudianteDTO {
    private Integer id;
    private String nombre;
    private String apellido;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date fechaNacimiento;
    private Integer semestre;

    private Integer idCiudad;
    private String ciudad;
    private String direccion;

    /**
     * Para facilitar el mapeo a JSON
     */
    public EstudianteDTO() {

    }

    public EstudianteDTO(Integer id, String nombre, String apellido, Date fechaNacimiento, Integer semestre,
                         Integer idCiudad, String ciudad, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.semestre = semestre;
        this.idCiudad = idCiudad;
        this.ciudad = ciudad;
        this.direccion = direccion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getSemestre() {
        return semestre;
    }

    public void setSemestre(Integer semestre) {
        this.semestre = semestre;
    }

    public Integer getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(Integer idCiudad) {
        this.idCiudad = idCiudad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
