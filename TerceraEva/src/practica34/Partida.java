package practica34;

public class Partida {
    private int id;
    private int intentos;
    private int tiempo;
    private String usuario;

    public Partida(int id, int intentos, int tiempo, String usuario) {
        this.id = id;
        this.intentos = intentos;
        this.tiempo = tiempo;
        this.usuario = usuario;
    }

    // Métodos getter y setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}

