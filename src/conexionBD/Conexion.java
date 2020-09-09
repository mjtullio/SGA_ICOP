package conexionBD;

import java.sql.*;

public class Conexion {

	Connection con;
	Statement st;
	ResultSet rs;

	public void abrirConexion() {
	try {
	String userName = "postgres";
	String password = "inmaculada2020";
	String url = "jdbc:postgresql://192.168.33.2:5432/SGA_ICOP";
	con = DriverManager.getConnection(url, userName, password);
	System.out.println("Conexión a la BD");

	} catch (Exception e) {
	System.out.println("Error en conexión ");
	System.out.println(e.getMessage());
	}
	}

	// Para cerrar la conexión una vez terminadas las consultas
	public void cerrarConexion() {
	try {
	con.close();
	System.out.println("Conexión cerrada");
	} catch (SQLException e) {
	System.out.println("Error al cerrar conexión");
	}
	}

}