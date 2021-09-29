package Backend.Spring.ModelEntity;
import java.io.Serializable;

import javax.persistence.*;

@Entity	
@Table(name="Estudiantes")
public class Estudiantes implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	@Column
	private String nombre;
	@Column
	private String apellido;
	@Column
	private String carrera;
	@Column
	private float promedio;
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	public float getPromedio() {
		return promedio;
	}
	public void setPromedio(float promedio) {
		this.promedio = promedio;
	}
	private static final long serialVersionUID = 1L;

}
