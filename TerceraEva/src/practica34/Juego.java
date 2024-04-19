package practica34;

import java.util.Random;
import java.util.Scanner;

import java.util.Random;
import java.util.Scanner;

public class Juego {
    private static final int LIMITE_SUPERIOR = 100;
    private static final int NUMERO_DE_INTENTOS = 5;

    private int numeroAdivinar;
    private int intentosRealizados;

    public Juego() {
        Random random = new Random();
        numeroAdivinar = random.nextInt(LIMITE_SUPERIOR + 1);
        intentosRealizados = 0;
    }

    public void jugar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al juego de adivinar el número entre 0 y 100.");
        System.out.println("Tienes " + NUMERO_DE_INTENTOS + " intentos para adivinar.");

        while (intentosRealizados < NUMERO_DE_INTENTOS) {
            System.out.print("Introduce tu número: ");
            int numeroUsuario = scanner.nextInt();
            intentosRealizados++;

            if (numeroUsuario == numeroAdivinar) {
                System.out.println("¡Felicidades! Has adivinado el número en " + intentosRealizados + " intentos.");
                return;
            } else if (numeroUsuario < numeroAdivinar) {
                System.out.println("El número es mayor.");
            } else {
                System.out.println("El número es menor.");
            }
        }

        System.out.println("Lo siento, has agotado tus " + NUMERO_DE_INTENTOS + " intentos. El número era: " + numeroAdivinar);
    }
}
