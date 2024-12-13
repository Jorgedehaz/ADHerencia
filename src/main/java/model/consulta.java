package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "consulta")
public class consulta {

    @Id
    @Column(name="consulta_id")
    public int id;

    @Column(name="planta_ubicada")
    public int planta;

}
