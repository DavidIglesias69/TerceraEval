package file;

import java.io.File;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {

		crearDirectorioYArchivo();

		listadoArchivosDirectorios();
		
		eliminar();
	}

	public static void crearDirectorioYArchivo() throws IOException {

		String rutaEscritorio = System.getProperty("user.home") + "/Desktop";

		String nombreDirectorio = "practica_files";
		String archivo1 = "archivoX.txt";


		File carpEscritorio = new File(rutaEscritorio, nombreDirectorio);

		carpEscritorio.mkdir();

		String temp;
		for(int i = 1; i <= 3; i++) {
			temp = archivo1.replaceFirst("X", ""+i);
			File archivo = new File(carpEscritorio, temp);
			archivo.createNewFile();
		}
	}

	public static void listadoArchivosDirectorios() {

		String rutaEscritorio = System.getProperty("user.home") + "/Desktop";

		String nombreDirectorio = "practica_files";

		File carpEscritorio = new File(rutaEscritorio, nombreDirectorio);

		String[] list = carpEscritorio.list();

		for(int i = 0; i < list.length; i++) {
			if(list[i].substring(list[i].length()-3, list[i].length()).equals("txt")) {
				System.out.println(list[i]);
			}
		}
	}

	public static void eliminar() {

		String rutaEscritorio = System.getProperty("user.home") + "/Desktop";

		String nombreDirectorio = "practica_files";

		File carpEscritorio = new File(rutaEscritorio, nombreDirectorio);

		String[] list = carpEscritorio.list();



		for(int i = 0; i <= list.length; i++) {

			File delete = new File(carpEscritorio, list[i]);
			delete.delete();
		}

		carpEscritorio.delete();



	}
}
