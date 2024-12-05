package es.pildoras.spring.mvc;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import es.pildoras.spring.mvc.validaciones.postalMadrid;

public class Alumno {
    @NotNull
    @Size(min=3, message="Campo Requerido")
    private String nombre;
    private String apellido;
    @Min(value=10, message="No apta para menores de 10")
    @Max(value=100, message="¿Mas de 100? hombre venga, ni tu te la crees")
    private int edad;
    private String optativa;
    private String provincia;
    private String idiomas;
    @Email
    private String email;
    //@Pattern(regexp="[0-9]{5}", message="Ingrese un codigo postal correcto")
    @postalMadrid
    private String codigoPostal;
    
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
    public String getOptativa() {
        return optativa;
    }
    public void setOptativa(String optativa) {
        this.optativa = optativa;
    }
    public String getProvincia() {
        return provincia;
    }
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    public String getIdiomas() {
        return idiomas;
    }
    public void setIdiomas(String idiomas) {
        this.idiomas = idiomas;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getCodigoPostal() {
        return codigoPostal;
    }
    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

}