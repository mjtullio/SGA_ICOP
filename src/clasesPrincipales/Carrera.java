/**
 * 
 */
package clasesPrincipales;

import java.util.ArrayList;

/**
 * @author Ariel Bugueiro
 *
 */
public class Carrera {
	
	private String director;
	private String nombre;
	ArrayList<Materia> materias;
	/**
	 * 
	 */
	public Carrera() {
		super();
	}
	/**
	 * @param director
	 * @param nombre
	 * @param materias
	 */
	public Carrera(String director, String nombre, ArrayList<Materia> materias) {
		super();
		this.director = director;
		this.nombre = nombre;
		this.materias = materias;
	}
	/**
	 * @return the director
	 */
	public String getDirector() {
		return director;
	}
	/**
	 * @param director the director to set
	 */
	public void setDirector(String director) {
		this.director = director;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the materias
	 */
	public ArrayList<Materia> getMaterias() {
		return materias;
	}
	/**
	 * @param materias the materias to set
	 */
	public void setMaterias(ArrayList<Materia> materias) {
		this.materias = materias;
	}
}