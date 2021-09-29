package Backend.Spring.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Backend.Spring.ModelEntity.Estudiantes;
import Backend.Spring.ModeloDao.IEstudiantesDano;

@Service
public class EstudiantesService implements IEstudiantesService {
	
	@Autowired
	IEstudiantesDano estudiantedao;
	
	@Override
	public List<Estudiantes> listar() {
		// TODO Auto-generated method stub
		return estudiantedao.findAll();
	}

	@Override
	public Estudiantes guardar(Estudiantes estudiante) {
		// TODO Auto-generated method stub
		return estudiantedao.save(estudiante);// Si no existe el objeto lo crea y si existe lo actualiza
	}

	@Override
	public void borrar(Long id) {
		// TODO Auto-generated method stub
		estudiantedao.deleteById(id);
	}

	@Override
	public Estudiantes findById(Long id) {
		// TODO Auto-generated method stub
		return estudiantedao.findById(id).orElse(null);
	}
	
}

