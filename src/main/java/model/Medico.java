package model;
import jakarta.persistence.Entity;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Medico extends Person {

    @OneToOne
    @JoinColumn(name = "consulta_consulta_id")
    private consulta consulta;

    @ElementCollection
    private List<Visita> historicoVisitas = new ArrayList<>();

    public Medico() {}

    public Medico(String dni, String numeroSeguridadSocial, String nombre, String direccion, String telefono, consulta consulta) {
        super(dni, numeroSeguridadSocial, nombre, direccion, telefono);
        this.consulta = consulta;
    }

    public void agregarHistoricoVisita(Visita visita) {
        historicoVisitas.add(visita);
    }

    public consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(consulta consulta) {
        this.consulta = consulta;
    }

    public List<Visita> getHistoricoVisitas() {
        return historicoVisitas;
    }

    public void setHistoricoVisitas(List<Visita> historicoVisitas) {
        this.historicoVisitas = historicoVisitas;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Medico: " + getNombre());
        System.out.println("Consulta: " + consulta);
        System.out.println("Historico de operaciones: " + historicoVisitas);
    }
}
