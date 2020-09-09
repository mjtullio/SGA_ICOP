package conexionBD;

public class PruebaConexion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Conexion AD = new Conexion();
		AD.abrirConexion();

		

		AD.cerrarConexion();

	}

}
