package model;


import jakarta.persistence.*;
import java.util.List;

@Entity
public class Celador extends Person {

    @ElementCollection
    private List<String> turnos;

    public Celador() {}

    public Celador(String dni, String numeroSeguridadSocial, String nombre, String direccion, String telefono) {
        super(dni, numeroSeguridadSocial, nombre, direccion, telefono);
    }

    public List<String> getTurnos() {
        return turnos;
    }

    public void setTurnos(List<String> turnos) {
        this.turnos = turnos;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Celador: " + getNombre());
        System.out.println("Turnos: " + turnos);
    }
}

