package bbl;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		 
		Persistencia p = new Persistencia();
		ArrayList<Autor> lista = p.getAutores();
		ArrayList<Libro> lista1 = p.getLibro();	
		
		//System.out.println(lista);
		System.out.println(lista1);
	}

}
