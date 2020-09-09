/**
 * 
 */
package clasesPrincipales;

import java.util.ArrayList;

/**
 * @author Ariel Bugueiro
 *
 */
public class Instituto {

	private String domicilio;
	private String email;
	private String nombre;
	private int numeroInstituto;
	private double telefono;
	ArrayList<Carrera> carreras;
	
	/**
	 * 
	 */
	public Instituto() {
		super();
	}
	/**
	 * @param domicilio
	 * @param email
	 * @param nombre
	 * @param numeroInstituto
	 * @param telefono
	 * @param carreras
	 */
	public Instituto(String domicilio, String email, String nombre,
			int numeroInstituto, double telefono, ArrayList<Carrera> carreras) {
		super();
		this.domicilio = domicilio;
		this.email = email;
		this.nombre = nombre;
		this.numeroInstituto = numeroInstituto;
		this.telefono = telefono;
		this.carreras = carreras;
	}
	/**
	 * @return the domicilio
	 */
	public String getDomicilio() {
		return domicilio;
	}
	/**
	 * @param domicilio the domicilio to set
	 */
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
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
	 * @return the numeroInstituto
	 */
	public int getNumeroInstituto() {
		return numeroInstituto;
	}
	/**
	 * @param numeroInstituto the numeroInstituto to set
	 */
	public void setNumeroInstituto(int numeroInstituto) {
		this.numeroInstituto = numeroInstituto;
	}
	/**
	 * @return the telefono
	 */
	public double getTelefono() {
		return telefono;
	}
	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(double telefono) {
		this.telefono = telefono;
	}
	/**
	 * @return the carreras
	 */
	public ArrayList<Carrera> getCarreras() {
		return carreras;
	}
	/**
	 * @param carreras the carreras to set
	 */
	public void setCarreras(ArrayList<Carrera> carreras) {
		this.carreras = carreras;
	}
	
	
}
