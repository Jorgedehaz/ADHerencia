import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import model.*;

import java.time.Instant;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager em = emf.createEntityManager();

        try {
            // Crear objetos
            Medico medico = new Medico("12345678A", "123456789", "Dr. Perez", "Calle Falsa 123", "912345678", "Consulta 1");
            medico.agregarHistoricoVisita(new Visita("Apendicitis", Date.from(Instant.now())));

            // Comenzar una transacción
            em.getTransaction().begin();

            // Guardar el objeto en la base de datos
            em.persist(medico);

            // Confirmar la transacción
            em.getTransaction().commit();

            System.out.println("Medico guardado con éxito!");
        } finally {
            em.close();
            emf.close();
        }
    }
}
