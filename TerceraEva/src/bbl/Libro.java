package bbl;

// Definición de la clase Libro
public class Libro {
	
	// Atributos de la clase Libro
	private String ISBN;
	private String titulo;
	private String genero;
	private int anio_Publicacion;
	private double precio;
	
	// Relación con la clase Autor
	private Autor autor;

	// Métodos de acceso para el atributo ISBN
	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	// Métodos de acceso para el atributo titulo
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	// Métodos de acceso para el atributo genero
	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	// Métodos de acceso para el atributo anio_Publicacion
	public int getAnio_Publicacion() {
		return anio_Publicacion;
	}

	public void setAnio_Publicacion(int anio_Publicacion) {
		this.anio_Publicacion = anio_Publicacion;
	}

	// Métodos de acceso para el atributo precio
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	// Métodos de acceso para el atributo autor
	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	// Constructor de la clase Libro
	public Libro(String iSBN, String titulo, String genero, int anio_Publicacion, double precio, Autor autor) {
		// Inicialización de los atributos con los valores proporcionados
		ISBN = iSBN;
		this.titulo = titulo;
		this.genero = genero;
		this.anio_Publicacion = anio_Publicacion;
		this.precio = precio;
		this.autor = autor;
	}

	// Método toString para representar el objeto Libro como una cadena
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
