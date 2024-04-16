package bbl;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Persistencia {

	public ArrayList<Autor> getAutores(){

		ArrayList<Autor> listaAutor = new ArrayList<Autor>();
		Conexion cone = new Conexion();

		Statement stm = cone.abrirConexion();

		try {
			ResultSet rs = stm.executeQuery("SELECT * FROM Autor;");
			if (rs!= null) {
				while (rs.next()) {
					
					int id_Autor=rs.getInt(1);
					String Nombre = rs.getString(2);
					String  Apellidos = rs.getString(3);

					Autor autor = new Autor (id_Autor,Nombre,Apellidos);

					listaAutor.add(autor);

				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return listaAutor;	
	}

	public Autor getAutor (int id_Autor) {

		Conexion cone = new Conexion();
		Statement stm = cone.abrirConexion();
 
		Autor autor = null;
		try {
			ResultSet rs = stm.executeQuery("SELECT * FROM Autor WHERE id_autor = "+id_Autor+";");
			if (rs!= null) {
				while (rs.next()) {

					String Nombre = rs.getString(2);
					String  Apellidos = rs.getString(3);

					autor = new Autor(id_Autor,Nombre,Apellidos);



				}
			}



		} catch (Exception e) {
			e.printStackTrace();
		}
		return autor;
	}

	public ArrayList<Libro> getLibro(){

		ArrayList<Libro> lista = new ArrayList<Libro>();
		Conexion cone = new Conexion();

		Statement stm = cone.abrirConexion();

		try {
			ResultSet rs = stm.executeQuery("SELECT * FROM Libro;");
			if (rs!= null) {
				while (rs.next()) {

					String ISBN=rs.getString(1);
					String titulo = rs.getString(2);
					String genero = rs.getString(3);
					int anio_Publicacion= rs.getInt(4);
					double precio= rs.getDouble(5);


					Autor autor= getAutor(rs.getInt(6));

					Libro libro = new Libro (ISBN,titulo,genero,anio_Publicacion,precio,autor);

					lista.add(libro);

				}
			}



		} catch (Exception e) {
			e.printStackTrace();
		}
		return lista;	
	}

}
