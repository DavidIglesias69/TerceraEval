package practica34;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MetodosDB {

    public static void insertarPartida(Partida partida) {
        Conexion conexion = new Conexion();
        Connection link = conexion.abrirConsulta();
        String consulta = "INSERT INTO partidas (intentos, tiempo, usuario) VALUES (?, ?, ?)";

        try {
            PreparedStatement ps = link.prepareStatement(consulta);
            ps.setInt(1, partida.getIntentos());
            ps.setInt(2, partida.getTiempo());
            ps.setString(3, partida.getUsuario());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            conexion.cerrarConexion((Statement) link);
        }
    }

    public static List<Partida> obtenerUltimasPartidas(String usuario, int cantidad) {
        List<Partida> partidas = new ArrayList<>();
        Conexion conexion = new Conexion();
        Connection link = conexion.abrirConsulta();
        String consulta = "SELECT * FROM partidas WHERE usuario = ? ORDER BY id DESC LIMIT ?";

        try {
            PreparedStatement ps = link.prepareStatement(consulta);
            ps.setString(1, usuario);
            ps.setInt(2, cantidad);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                int intentos = rs.getInt("intentos");
                int tiempo = rs.getInt("tiempo");
                partidas.add(new Partida(id, intentos, tiempo, usuario));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            conexion.cerrarConexion((Statement) link);
        }

        return partidas;
    }

    public static void borrarPartidas(String usuario) {
        Conexion conexion = new Conexion();
        Connection link = conexion.abrirConsulta();
        String consulta = "DELETE FROM partidas WHERE usuario = ?";

        try {
            PreparedStatement ps = link.prepareStatement(consulta);
            ps.setString(1, usuario);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            conexion.cerrarConexion((Statement) link);
        }
    }

    // Otros métodos para manejar las operaciones en la base de datos
}
