import articulo.articulo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el identificador del libro: ");
        String identificador = entrada.nextLine();

        System.out.print("Ingrese el autor del libro: ");
        String autor = entrada.nextLine();

        System.out.print("Ingrese el año de publicación: ");
        int anioPublicacion = entrada.nextInt();

        articulo libro1 = new articulo(identificador, autor, anioPublicacion);


        System.out.println("\nDatos del libro:");
        System.out.println("Identificador: " + libro1.getIdentificador());
        System.out.println("Autor: " + libro1.getAutor());
        System.out.println("Disponible: " + libro1.isDisponible());

        System.out.println(libro1.reservar());

        System.out.println("Antigüedad: " + libro1.calcularAntiguedad() + " años");
        System.out.println(libro1.verificarPrestamo());

        entrada.close();
    }
}

