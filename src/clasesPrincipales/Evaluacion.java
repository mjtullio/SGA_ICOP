/**
 * 
 */
package clasesPrincipales;

import java.time.LocalDate;

/**
 * @author Ariel Bugueiro
 *
 */
public class Evaluacion {
	
	private LocalDate fecha;
	private int notaFinal;
	private int numeroActa;
	private String tipo;
	
	/**
	 * 
	 */
	public Evaluacion() {
		super();
	}
	/**
	 * @param fecha
	 * @param notaFinal
	 * @param numeroActa
	 * @param tipo
	 */
	public Evaluacion(LocalDate fecha, int notaFinal, int numeroActa,
			String tipo) {
		super();
		this.fecha = fecha;
		this.notaFinal = notaFinal;
		this.numeroActa = numeroActa;
		this.tipo = tipo;
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
	/**
	 * @return the notaFinal
	 */
	public int getNotaFinal() {
		return notaFinal;
	}
	/**
	 * @param notaFinal the notaFinal to set
	 */
	public void setNotaFinal(int notaFinal) {
		this.notaFinal = notaFinal;
	}
	/**
	 * @return the numeroActa
	 */
	public int getNumeroActa() {
		return numeroActa;
	}
	/**
	 * @param numeroActa the numeroActa to set
	 */
	public void setNumeroActa(int numeroActa) {
		this.numeroActa = numeroActa;
	}
	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	
}
