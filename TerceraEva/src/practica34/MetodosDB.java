package practica34;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MetodosDB {
    
    // Método para insertar un nuevo jugador en la base de datos
    public static void insertarJugador(Jugador jugador) {
        Conexion conexion = new Conexion();
        Connection link = conexion.abrirConsulta();
        String consulta = "INSERT INTO jugadores (usuario, contraseña, nombre_completo) VALUES (?, ?, ?)";

        try {
            PreparedStatement ps = link.prepareStatement(consulta);
            ps.setString(1, jugador.getUsuario());
            ps.setString(2, jugador.getContraseña());
            ps.setString(3, jugador.getNombreCompleto());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            conexion.cerrarConexion((Statement) link);
        }
    }

    // Otros métodos para manejar las operaciones en la base de datos
}

