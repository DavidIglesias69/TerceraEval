package bbl;

public class Libro {
	
	private String ISBN;
	private String titulo;
	private String genero;
	private int anio_Publicacion;
	private double precio;
	
	private Autor autor;

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getAnio_Publicacion() {
		return anio_Publicacion;
	}

	public void setAnio_Publicacion(int anio_Publicacion) {
		this.anio_Publicacion = anio_Publicacion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public Libro(String iSBN, String titulo, String genero, int anio_Publicacion, double precio, Autor autor) {
	
		ISBN = iSBN;
		this.titulo = titulo;
		this.genero = genero;
		this.anio_Publicacion = anio_Publicacion;
		this.precio = precio;
		this.autor = autor;
	}


	public String toString() {
		StringBuffer str = new StringBuffer();
		str.append("[");
		str.append(this.titulo);
		str.append("]");
		str.append(" ");
		str.append(this.ISBN);
		str.append(" ");
		str.append(this.genero);
		str.append(" ");
		str.append(this.anio_Publicacion);
		str.append(" ");
		str.append(this.precio);
		str.append(" ");
		str.append(this.autor);
		str.append("\n");
		
		return str.toString();

	}
	
	
	
	

}
