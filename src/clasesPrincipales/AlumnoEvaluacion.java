/**
 * 
 */
package clasesPrincipales;

/**
 * @author Ariel Bugueiro
 *
 */
public class AlumnoEvaluacion {
	
	private String estadoAlumno;
	private Alumno alumno;
	private Evaluacion evaluacion;
	/**
	 * 
	 */
	public AlumnoEvaluacion() {
		super();
	}
	/**
	 * @param estadoAlumno
	 * @param alumno
	 * @param evaluacion
	 */
	public AlumnoEvaluacion(String estadoAlumno, Alumno alumno,
			Evaluacion evaluacion) {
		super();
		this.estadoAlumno = estadoAlumno;
		this.alumno = alumno;
		this.evaluacion = evaluacion;
	}
	/**
	 * @return the estadoAlumno
	 */
	public String getEstadoAlumno() {
		return estadoAlumno;
	}
	/**
	 * @param estadoAlumno the estadoAlumno to set
	 */
	public void setEstadoAlumno(String estadoAlumno) {
		this.estadoAlumno = estadoAlumno;
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
	 * @return the evaluacion
	 */
	public Evaluacion getEvaluacion() {
		return evaluacion;
	}
	/**
	 * @param evaluacion the evaluacion to set
	 */
	public void setEvaluacion(Evaluacion evaluacion) {
		this.evaluacion = evaluacion;
	}
	
}