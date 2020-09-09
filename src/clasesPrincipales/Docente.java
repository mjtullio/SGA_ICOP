/**
 * 
 */
package clasesPrincipales;

/**
 * @author Ariel Bugueiro
 *
 */
public class Docente extends Persona{
	
	private String condicion;
	private double matricula;
	
	/**
	 * 
	 */
	public Docente() {
		super();
	}
	
	/**
	 * @param condicion
	 * @param matricula
	 */
	public Docente(String apellido, String nombre, String direccion,
			double dni, String email, String fechaNacimiento, String sexo,
			double telefono,String condicion, double matricula) {
		super (apellido, nombre, direccion ,dni , email, fechaNacimiento , sexo ,telefono);
		this.condicion = condicion;
		this.matricula = matricula;
	}
	
	/**
	 * @return the condicion
	 */
	public String getCondicion() {
		return condicion;
	}
	/**
	 * @param condicion the condicion to set
	 */
	public void setCondicion(String condicion) {
		this.condicion = condicion;
	}
	/**
	 * @return the matricula
	 */
	public double getMatricula() {
		return matricula;
	}
	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(double matricula) {
		this.matricula = matricula;
	}
}
