package Backend.Spring.ModeloDao;

import org.springframework.data.jpa.repository.JpaRepository;

import Backend.Spring.ModelEntity.*;

public interface IEstudiantesDano extends JpaRepository<Estudiantes, Long> {

}
