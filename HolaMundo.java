import java.util.Scanner;

public class HolaMundo {
    public static void main(String[] args) {
        // Imprimir "Hola, mundo"
        System.out.println("Hola, mundo");

        // Solicitar al usuario su nombre y saludar personalmente
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, ingresa tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Hola, " + nombre);

        // Preguntar al usuario cómo está y responder a su respuesta
        System.out.print("¿Cómo estás? ");
        String respuesta = scanner.nextLine();
        System.out.println("Entiendo que estás " + respuesta);

        // Repetir el saludo tres veces usando un bucle while
        int contador = 0;
        while (contador < 3) {
            System.out.println("Hola, " + nombre);
            contador++;
        }
    }
}
