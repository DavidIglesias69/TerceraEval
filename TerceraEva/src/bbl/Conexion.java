package bbl;

import java.sql.*;

public class Conexion {

	private final String database = "jdbc:mysql://92.222.10.128/Biblioteca";
	private final String usuario = "alumno";
	private final String password = "AlumnoDAW123!";
	
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
