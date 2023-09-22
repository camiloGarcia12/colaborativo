package repository;


import model.MiembroEquipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MiembroEquipoRepository extends JpaRepository<MiembroEquipo, Long> {
    // Agrega métodos personalizados según tus necesidades
}