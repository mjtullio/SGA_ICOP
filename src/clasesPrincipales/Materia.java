/**
 * 
 */
package clasesPrincipales;

/**
 * @author Ariel Bugueiro
 *
 */
public class Materia {
	
	private String correlatividad;
	private String jefeCatedra;
	private String nombre;
	/**
	 * 
	 */
	public Materia() {
		super();
	}
	/**
	 * @param correlatividad
	 * @param jefeCatedra
	 * @param nombre
	 */
	public Materia(String correlatividad, String jefeCatedra, String nombre) {
		super();
		this.correlatividad = correlatividad;
		this.jefeCatedra = jefeCatedra;
		this.nombre = nombre;
	}
	/**
	 * @return the correlatividad
	 */
	public String getCorrelatividad() {
		return correlatividad;
	}
	/**
	 * @param correlatividad the correlatividad to set
	 */
	public void setCorrelatividad(String correlatividad) {
		this.correlatividad = correlatividad;
	}
	/**
	 * @return the jefeCatedra
	 */
	public String getJefeCatedra() {
		return jefeCatedra;
	}
	/**
	 * @param jefeCatedra the jefeCatedra to set
	 */
	public void setJefeCatedra(String jefeCatedra) {
		this.jefeCatedra = jefeCatedra;
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
	
}