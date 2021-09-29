package Backend.Spring.Controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import Backend.Spring.ModelEntity.Estudiantes;
import Backend.Spring.Service.IEstudiantesService;

//GET; Para obtener Datos
//POST; Para Guardar Datos
//PUT; Editar Datos
//Delete; Eliminar Datos

@CrossOrigin(origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class EstudiantesController {	
	
	@Autowired
	private IEstudiantesService estudiantesservices;
	
	@GetMapping("/estudiantes/{id}")
	public Estudiantes buscar(@PathVariable Long id) {
		return estudiantesservices.findById(id);
	}
	@GetMapping("/estudiantes")
	public List<Estudiantes> listar(){
		return estudiantesservices.listar();
	}
	
	@PostMapping("/estudiantes")
	public Estudiantes guardar(@RequestBody Estudiantes estudiante) {
		return estudiantesservices.guardar(estudiante);
	}
	
	@DeleteMapping("/estudiantes/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void borrar(@PathVariable Long id) {
		estudiantesservices.borrar(id);
	}
	@PutMapping("/estudiantes/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Estudiantes update(@RequestBody Estudiantes estudiante, @PathVariable Long id) {
		Estudiantes actual=estudiantesservices.findById(id);
		actual.setApellido(estudiante.getApellido());
		actual.setNombre(estudiante.getNombre());
		return estudiantesservices.guardar(actual);
	}
	
}
