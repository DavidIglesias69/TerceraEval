package bbl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

// Clase encargada de interactuar con la base de datos y obtener información de autores y libros
public class Persistencia {

	// Método para obtener una lista de todos los autores de la base de datos
	public ArrayList<Autor> getAutores(){

		// Crear una lista para almacenar los autores
		ArrayList<Autor> listaAutor = new ArrayList<Autor>();
		// Crear una instancia de la clase Conexion para establecer conexión con la base de datos
		Conexion cone = new Conexion();

		// Obtener una instancia de Statement para ejecutar consultas SQL
		Statement stm = cone.abrirConexion();

		try {
			// Ejecutar la consulta SQL para obtener todos los autores
			ResultSet rs = stm.executeQuery("SELECT * FROM Autor;");
			// Verificar si el resultado no es nulo
			if (rs!= null) {
				// Iterar sobre cada fila del resultado
				while (rs.next()) {

					// Obtener los valores de cada columna de la fila
					int id_Autor=rs.getInt(1);
					String Nombre = rs.getString(2);
					String  Apellidos = rs.getString(3);

					// Crear un objeto Autor con los valores obtenidos
					Autor autor = new Autor (id_Autor,Nombre,Apellidos);

					// Agregar el autor a la lista
					listaAutor.add(autor);

				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		// Devolver la lista de autores
		return listaAutor;	
	}

	// Método para obtener un autor específico por su ID
	public Autor getAutor (int id_Autor) {

		// Crear una instancia de la clase Conexion para establecer conexión con la base de datos
		Conexion cone = new Conexion();
		// Obtener una instancia de Statement para ejecutar consultas SQL
		Statement stm = cone.abrirConexion();

		// Inicializar el objeto Autor como nulo
		Autor autor = null;
		try {
			// Ejecutar la consulta SQL para obtener el autor por su ID
			ResultSet rs = stm.executeQuery("SELECT * FROM Autor WHERE id_autor = "+id_Autor+";");
			// Verificar si el resultado no es nulo
			if (rs!= null) {
				// Iterar sobre cada fila del resultado
				while (rs.next()) {

					// Obtener los valores de cada columna de la fila
					String Nombre = rs.getString(2);
					String  Apellidos = rs.getString(3);

					// Crear un objeto Autor con los valores obtenidos
					autor = new Autor(id_Autor,Nombre,Apellidos);

				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		// Devolver el autor obtenido
		return autor;
	}

	// Método para obtener una lista de todos los libros de la base de datos
	public ArrayList<Libro> getLibro(){

		// Crear una lista para almacenar los libros
		ArrayList<Libro> lista = new ArrayList<Libro>();
		// Crear una instancia de la clase Conexion para establecer conexión con la base de datos
		Conexion cone = new Conexion();

		// Obtener una instancia de Statement para ejecutar consultas SQL
		Statement stm = cone.abrirConexion();

		try {
			// Ejecutar la consulta SQL para obtener todos los libros
			ResultSet rs = stm.executeQuery("SELECT * FROM Libro;");
			// Verificar si el resultado no es nulo
			if (rs!= null) {
				// Iterar sobre cada fila del resultado
				while (rs.next()) {

					// Obtener los valores de cada columna de la fila
					String ISBN=rs.getString(1);
					String titulo = rs.getString(2);
					String genero = rs.getString(3);
					int anio_Publicacion= rs.getInt(4);
					double precio= rs.getDouble(5);

					// Obtener el autor del libro utilizando el método getAutor()
					Autor autor= getAutor(rs.getInt(6));

					// Crear un objeto Libro con los valores obtenidos
					Libro libro = new Libro (ISBN,titulo,genero,anio_Publicacion,precio,autor);

					// Agregar el libro a la lista
					lista.add(libro);

				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		// Devolver la lista de libros
		return lista;	
	}

	public static void insertarUsuario () throws SQLException {

		Scanner sc = new Scanner (System.in);
		System.out.println("dime tu nombre");
		String nombre= sc.nextLine();
		System.out.println("dime tus apellidos");
		String apellidos= sc.nextLine();



		Conexion cone = new Conexion();
		Connection link = cone.abrirConsulta();

		String sql ="INSERT INTO Autor (nombre,apellidos) VALUES (?,?)";
		PreparedStatement ps = link.prepareStatement(sql);
		ps.setString(1,nombre);
		ps.setString(2,apellidos);

		ps.execute();
	}
	
	public void actualizarPrecioLibro (String isbnLibro, double nuevoPrecio) throws SQLException {
		
		
		
		Conexion cone = new Conexion();
		Connection link = cone.abrirConsulta();

		String sql = "UPDATE Libro SET Libro.precio =? WHERE Libro.precio=?";
		PreparedStatement ps = link.prepareStatement(sql);
		ps.setDouble(1,nuevoPrecio);
		ps.setString(2,isbnLibro);
		//9780192833987
		ps.execute();
	}
	
public int actualizarPrecio (double precioAntiguo, double precioNuevo) throws SQLException {
		
		
		
		Conexion cone = new Conexion();
		Connection link = cone.abrirConsulta();

		String sql = "UPDATE Libro SET precio =? WHERE precio=?";
		PreparedStatement ps = link.prepareStatement(sql);
		ps.setDouble(2,precioAntiguo);
		ps.setDouble(1,precioNuevo);
		return ps.executeUpdate();
	}
	
	
}
