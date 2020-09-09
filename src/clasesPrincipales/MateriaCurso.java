/**
 * 
 */
package clasesPrincipales;

import java.util.ArrayList;

/**
 * @author Ariel Bugueiro
 *
 */
public class MateriaCurso {

	private double porcentajeAsistencia;
	private Materia materias;
	private ArrayList <Docente> docentes;
	private ArrayList<Asistencia> asistencias;
	private ArrayList<AlumnoEvaluacion> evaluaciones;
	
	/**
	 * 
	 */
	public MateriaCurso() {
		super();
	}
	
	/**
	 * @param porcentajeAsistencia
	 * @param materias
	 * @param docentes
	 * @param asistencias
	 * @param evaluaciones
	 */
	public MateriaCurso(double porcentajeAsistencia, Materia materias,
			ArrayList<Docente> docentes, ArrayList<Asistencia> asistencias,
			ArrayList<AlumnoEvaluacion> evaluaciones) {
		super();
		this.porcentajeAsistencia = porcentajeAsistencia;
		this.materias = materias;
		this.docentes = docentes;
		this.asistencias = asistencias;
		this.evaluaciones = evaluaciones;
	}

	/**
	 * @return the porcentajeAsistencia
	 */
	public double getPorcentajeAsistencia() {
		return porcentajeAsistencia;
	}

	/**
	 * @param porcentajeAsistencia the porcentajeAsistencia to set
	 */
	public void setPorcentajeAsistencia(double porcentajeAsistencia) {
		this.porcentajeAsistencia = porcentajeAsistencia;
	}

	/**
	 * @return the materias
	 */
	public Materia getMaterias() {
		return materias;
	}

	/**
	 * @param materias the materias to set
	 */
	public void setMaterias(Materia materias) {
		this.materias = materias;
	}

	/**
	 * @return the docentes
	 */
	public ArrayList<Docente> getDocentes() {
		return docentes;
	}

	/**
	 * @param docentes the docentes to set
	 */
	public void setDocentes(ArrayList<Docente> docentes) {
		this.docentes = docentes;
	}

	/**
	 * @return the asistencias
	 */
	public ArrayList<Asistencia> getAsistencias() {
		return asistencias;
	}

	/**
	 * @param asistencias the asistencias to set
	 */
	public void setAsistencias(ArrayList<Asistencia> asistencias) {
		this.asistencias = asistencias;
	}

	/**
	 * @return the evaluaciones
	 */
	public ArrayList<AlumnoEvaluacion> getEvaluaciones() {
		return evaluaciones;
	}

	/**
	 * @param evaluaciones the evaluaciones to set
	 */
	public void setEvaluaciones(ArrayList<AlumnoEvaluacion> evaluaciones) {
		this.evaluaciones = evaluaciones;
	}
	
	
	
	
}