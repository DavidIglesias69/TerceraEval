package bbl;

// Definición de la clase Autor
public class Autor {

	// Atributos de la clase Autor
	private int id_Autor;
	private String Nombre;
	private String Apellidos;
	
	// Constructor de la clase Autor
	public Autor(int id_Autor, String nombre, String apellidos) {
		// Inicialización de los atributos con los valores proporcionados
		this.id_Autor = id_Autor;
		Nombre = nombre;
		Apellidos = apellidos;
	}
	
	// Métodos de acceso para el atributo id_Autor
	public int getId_Autor() {
		return id_Autor;
	}
	public void setId_Autor(int id_Autor) {
		this.id_Autor = id_Autor;
	}
	
	// Métodos de acceso para el atributo Nombre
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	
	// Métodos de acceso para el atributo Apellidos
	public String getApellidos() {
		return Apellidos;
	}
	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}
	
	// Método toString para representar el objeto Autor como una cadena
	@Override
	public String toString() {
		StringBuffer str = new StringBuffer();
		str.append("[");
		str.append(this.id_Autor);
		str.append("]");
		str.append(" ");
		str.append(this.Nombre);
		str.append(" ");
		str.append(this.Apellidos);
	
		return str.toString();
	}
}
