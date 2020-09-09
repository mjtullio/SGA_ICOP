/**
 * 
 */
package clasesPrincipales;

import java.util.ArrayList;

/**
 * @author Ariel Bugueiro
 *
 */
public class MateriaAlumno {
	
	private String aula;
	private double porcentajeAsistencia;
	private int nota;
	private Alumno alumno;
	private Materia materia;
	private ArrayList<Asistencia> asistencias;
	/**
	 * 
	 */
	public MateriaAlumno() {
		super();
	}
	/**
	 * @param aula
	 * @param porcentajeAsistencia
	 * @param nota
	 * @param alumno
	 * @param materia
	 * @param asistencias
	 */
	public MateriaAlumno(String aula, double porcentajeAsistencia, int nota,
			Alumno alumno, Materia materia, ArrayList<Asistencia> asistencias) {
		super();
		this.aula = aula;
		this.porcentajeAsistencia = porcentajeAsistencia;
		this.nota = nota;
		this.alumno = alumno;
		this.materia = materia;
		this.asistencias = asistencias;
	}
	/**
	 * @return the aula
	 */
	public String getAula() {
		return aula;
	}
	/**
	 * @param aula the aula to set
	 */
	public void setAula(String aula) {
		this.aula = aula;
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
	 * @return the nota
	 */
	public int getNota() {
		return nota;
	}
	/**
	 * @param nota the nota to set
	 */
	public void setNota(int nota) {
		this.nota = nota;
	}
	/**
	 * @return the alumno
	 */
	public Alumno getAlumno() {
		return alumno;
	}
	/**
	 * @param alumno the alumno to set
	 */
	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}
	/**
	 * @return the materia
	 */
	public Materia getMateria() {
		return materia;
	}
	/**
	 * @param materia the materia to set
	 */
	public void setMateria(Materia materia) {
		this.materia = materia;
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
	
	
	
	
	
}
