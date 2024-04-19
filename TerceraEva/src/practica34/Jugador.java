package practica34;

public class Jugador {
    private String usuario;
    private String contraseña;
    private String nombreCompleto;

    public Jugador(String usuario, String contraseña, String nombreCompleto) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.nombreCompleto = nombreCompleto;
    }

    // Métodos getter y setter
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
}
