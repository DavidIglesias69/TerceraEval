package practica34;

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
                    // Lógica para iniciar el juego
                    break;
                case 2:
                    // Lógica para ver las estadísticas del jugador
                    break;
                case 3:
                    // Lógica para borrar las estadísticas del jugador
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
}

