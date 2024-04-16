package bbl;

import java.sql.SQLException;
import java.util.ArrayList;

// Clase principal que contiene el método main
public class Main {

	public static void main(String[] args) {
		// Crear una instancia de la clase Persistencia
		Persistencia p = new Persistencia();
		
		// Obtener la lista de autores y libros utilizando el método getAutores() y getLibro() respectivamente
		ArrayList<Autor> listaAutores = p.getAutores();
		ArrayList<Libro> listaLibros = p.getLibro();	
		
		// Imprimir la lista de libros en la consola
		System.out.println(listaLibros);
		try {
			Persistencia.insertarUsuario();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
