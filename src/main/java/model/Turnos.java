package model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Turnos {
    @Column(name = "Turnos")
    public String horaio;
    public String planta;

    public Turnos() {
    }

    public Turnos(String horaio, String planta) {}
}
