package practica34;

import java.util.Scanner;

import java.util.Scanner;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Aquí solicitarías al usuario que inicie sesión

        // Muestra el menú y gestiona las opciones seleccionadas por el usuario
        int opcion;
        do {
            System.out.println("Menú:");
            System.out.println("1) Jugar");
            System.out.println("2) Ver mis estadísticas");
            System.out.println("3) Borrar estadísticas");
            System.out.println("4) Salir");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    Juego juego = new Juego();
                    juego.jugar();
                    break;
                case 2:
                    mostrarEstadisticas();
                    break;
                case 3:
                    borrarEstadisticas();
                    break;
                case 4:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Inténtalo de nuevo.");
            }
        } while (opcion != 4);

        scanner.close();
    }

    private static void mostrarEstadisticas() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mostrando estadísticas:");

        // Aquí podrías solicitar al usuario que ingrese su nombre de usuario para mostrar sus estadísticas
        System.out.print("Ingresa tu nombre de usuario: ");
        String usuario = scanner.nextLine();

        // Aquí llamas al método de MetodosDB para obtener las últimas partidas del usuario
        List<Partida> partidas = MetodosDB.obtenerUltimasPartidas(usuario, 10);

        // Aquí podrías mostrar las estadísticas obtenidas
        for (Partida partida : partidas) {
            System.out.println("Partida ID: " + partida.getId() +
                    ", Intentos: " + partida.getIntentos() +
                    ", Tiempo: " + partida.getTiempo());
        }
    }

    private static void borrarEstadisticas() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Borrando estadísticas:");

        // Aquí podrías solicitar al usuario que ingrese su nombre de usuario para borrar sus estadísticas
        System.out.print("Ingresa tu nombre de usuario: ");
        String usuario = scanner.nextLine();

        // Aquí llamas al método de MetodosDB para borrar las partidas del usuario
        MetodosDB.borrarPartidas(usuario);

        System.out.println("Se han borrado las estadísticas del usuario: " + usuario);
    }
}
