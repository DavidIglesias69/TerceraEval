package consultas;
import java.sql.*;
public class Prueba {

	public static void main(String[] args) {

		Conexion cone = new Conexion();
		Statement stm = cone.abrirConexion();

		try {
			ResultSet rs = stm.executeQuery("SELECT * FROM persona;");

			if (rs != null) {
				while(rs.next()) {
					System.out.print(rs.getString(1));
					System.out.print(" - ");
					System.out.print(rs.getString(2));
					System.out.print(" - ");
					System.out.print(rs.getString(3));
					System.out.println();
					
				}
			}


		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}



	}
}
