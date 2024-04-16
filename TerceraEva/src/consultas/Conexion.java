package consultas;

import java.sql.*;

public class Conexion {

	private final String database = "jdbc:mysql://localhost/prg";
	private final String usuario = "root";
	private final String password = "";
	
	public Statement abrirConexion() {
		
		Connection link;
		Statement stm = null;
		
		try {
			
			//Class.forName("com.mysql.cj.jdbc.Driver");
			link = DriverManager.getConnection(database, usuario, password);
			stm = link.createStatement();
		
		} catch (Exception e) {
			//MANEJO DE EXCEPCIONES
			
			
		}
		
		return stm;
	}
	
	public void cerrarConexion(Statement stm) {
		
		try {
			stm.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
