/**
 * 
 */
package clasesPrincipales;

import java.time.LocalDate;

/**
 * @author Ariel Bugueiro
 *
 */
public class Asistencia{
	
	private boolean asistencia;
	private LocalDate fecha;
	/**
	 * 
	 */
	public Asistencia() {
		super();
	}
	/**
	 * @param asistencia
	 * @param fecha
	 */
	public Asistencia(boolean asistencia, LocalDate fecha) {
		super();
		this.asistencia = asistencia;
		this.fecha = fecha;
	}
	/**
	 * @return the asistencia
	 */
	public boolean isAsistencia() {
		return asistencia;
	}
	/**
	 * @param asistencia the asistencia to set
	 */
	public void setAsistencia(boolean asistencia) {
		this.asistencia = asistencia;
	}
	/**
	 * @return the fecha
	 */
	public LocalDate getFecha() {
		return fecha;
	}
	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}	

}