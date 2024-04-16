package bbl;

public class Autor {

	private int id_Autor;
	private String Nombre;
	private String  Apellidos;
	
	
	public int getId_Autor() {
		return id_Autor;
	}
	public void setId_Autor(int id_Autor) {
		this.id_Autor = id_Autor;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellidos() {
		return Apellidos;
	}
	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}
	public Autor(int id_Autor, String nombre, String apellidos) {
		
		this.id_Autor = id_Autor;
		Nombre = nombre;
		Apellidos = apellidos;
	}
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
