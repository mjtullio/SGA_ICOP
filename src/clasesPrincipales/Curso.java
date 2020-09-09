/**
 * 
 */
package clasesPrincipales;

import java.util.ArrayList;

/**
 * @author Ariel Bugueiro
 *
 */
public class Curso {

	private int anio;
	private int cicloLectivo;
	private String division;
	private ArrayList<MateriaAlumno> materiaAlumno;
	private ArrayList<MateriaCurso> materiaCurso;
	/**
	 * 
	 */
	public Curso() {
		super();
	}
	/**
	 * @param anio
	 * @param cicloLectivo
	 * @param division
	 * @param materiaAlumno
	 * @param materiaCurso
	 */
	public Curso(int anio, int cicloLectivo, String division,
			ArrayList<MateriaAlumno> materiaAlumno,
			ArrayList<MateriaCurso> materiaCurso) {
		super();
		this.anio = anio;
		this.cicloLectivo = cicloLectivo;
		this.division = division;
		this.materiaAlumno = materiaAlumno;
		this.materiaCurso = materiaCurso;
	}
	/**
	 * @return the anio
	 */
	public int getAnio() {
		return anio;
	}
	/**
	 * @param anio the anio to set
	 */
	public void setAnio(int anio) {
		this.anio = anio;
	}
	/**
	 * @return the cicloLectivo
	 */
	public int getCicloLectivo() {
		return cicloLectivo;
	}
	/**
	 * @param cicloLectivo the cicloLectivo to set
	 */
	public void setCicloLectivo(int cicloLectivo) {
		this.cicloLectivo = cicloLectivo;
	}
	/**
	 * @return the division
	 */
	public String getDivision() {
		return division;
	}
	/**
	 * @param division the division to set
	 */
	public void setDivision(String division) {
		this.division = division;
	}
	/**
	 * @return the materiaAlumno
	 */
	public ArrayList<MateriaAlumno> getMateriaAlumno() {
		return materiaAlumno;
	}
	/**
	 * @param materiaAlumno the materiaAlumno to set
	 */
	public void setMateriaAlumno(ArrayList<MateriaAlumno> materiaAlumno) {
		this.materiaAlumno = materiaAlumno;
	}
	/**
	 * @return the materiaCurso
	 */
	public ArrayList<MateriaCurso> getMateriaCurso() {
		return materiaCurso;
	}
	/**
	 * @param materiaCurso the materiaCurso to set
	 */
	public void setMateriaCurso(ArrayList<MateriaCurso> materiaCurso) {
		this.materiaCurso = materiaCurso;
	}	
	
}
