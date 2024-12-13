package model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.time.LocalDate;
import java.util.Date;

@Embeddable
public class Visita {
    @Column(name = "Visita")
    private String descripcion;
    private Date fecha;

    public Visita(String descripcion, Date fecha) {
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    public Visita() {
    }
}
