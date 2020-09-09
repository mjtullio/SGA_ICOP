package conexionBD;

/**
 * @author Marcelo J. Tullio
 *
 */
public class PruebaConexion {

	public static void main(String[] args) {

		Conexion AD = new Conexion();
		AD.abrirConexion();

		

		AD.cerrarConexion();

	}

}
