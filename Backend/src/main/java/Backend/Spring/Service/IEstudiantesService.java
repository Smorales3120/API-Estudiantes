package Backend.Spring.Service;
import java.util.List;
import Backend.Spring.ModelEntity.Estudiantes; 
public interface IEstudiantesService {

	public List<Estudiantes> listar();
	public Estudiantes guardar(Estudiantes estudiante);
	public void borrar(Long id);
	public Estudiantes findById(Long id);
}
