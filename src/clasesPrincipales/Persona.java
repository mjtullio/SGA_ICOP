/**
 * 
 */
package clasesPrincipales;

/**
 * @author Ariel Bugueiro
 *
 */
public class Persona {

	private String apellido;
	private String nombre; 
	private String direccion;
	private double dni;
	private String email;
	private String fechaNacimiento;
	private String sexo;
	private double telefono;
	
	/**
	 * 
	 */
	public Persona() {
		super();
	}
	/**
	 * @param apellido
	 * @param nombre
	 * @param direccion
	 * @param dni
	 * @param email
	 * @param fechaNacimiento
	 * @param sexo
	 * @param telefono
	 */
	public Persona(String apellido, String nombre, String direccion,
			double dni, String email, String fechaNacimiento, String sexo,
			double telefono) {
		super();
		this.apellido = apellido;
		this.nombre = nombre;
		this.direccion = direccion;
		this.dni = dni;
		this.email = email;
		this.fechaNacimiento = fechaNacimiento;
		this.sexo = sexo;
		this.telefono = telefono;
	}
	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}
	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
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
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}
	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	/**
	 * @return the dni
	 */
	public double getDni() {
		return dni;
	}
	/**
	 * @param dni the dni to set
	 */
	public void setDni(double dni) {
		this.dni = dni;
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
	 * @return the fechaNacimiento
	 */
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	/**
	 * @param fechaNacimiento the fechaNacimiento to set
	 */
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	/**
	 * @return the sexo
	 */
	public String getSexo() {
		return sexo;
	}
	/**
	 * @param sexo the sexo to set
	 */
	public void setSexo(String sexo) {
		this.sexo = sexo;
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

}
