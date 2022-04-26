package co.edu.uniquindio.unitravel.entidades;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.List;

@Entity
public class Persona implements Serializable {

    @Id
    private String cedula;

    @ElementCollection
    private List<String> telefonos;


    public Persona(){

    }

    public Persona(String cedula) {
        this.cedula = cedula;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula){
        this.cedula=cedula;
    }

    public List<String> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(List<String> telefonos) {
        this.telefonos = telefonos;
    }
}
