/**
 * 
 */
package clasesPrincipales;

/**
 * @author Ariel Bugueiro
 *
 */
public class Alumno extends Persona{

	private double matricula;
	private String modalidadCursado;
	
	/**
	 * 
	 */
	public Alumno() {
		super();
	}
	
	/**
	 * @param matricula
	 * @param modalidadCursado
	 */
	public Alumno(String apellido, String nombre, String direccion,
			double dni, String email, String fechaNacimiento, String sexo,
			double telefono,double matricula, String modalidadCursado) {
		super (apellido, nombre, direccion ,dni , email, fechaNacimiento , sexo ,telefono);
		this.matricula = matricula;
		this.modalidadCursado = modalidadCursado;
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
	/**
	 * @return the modalidadCursado
	 */
	public String getModalidadCursado() {
		return modalidadCursado;
	}
	/**
	 * @param modalidadCursado the modalidadCursado to set
	 */
	public void setModalidadCursado(String modalidadCursado) {
		this.modalidadCursado = modalidadCursado;
	}
	
	
}