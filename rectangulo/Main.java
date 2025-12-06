import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la longitud del rectángulo: ");
        double longitud = scanner.nextDouble();

        System.out.print("Ingresa la altura del rectángulo: ");
        double altura = scanner.nextDouble();

        scanner.nextLine(); 

        System.out.print("Ingresa la identificación del rectángulo: ");
        String id = scanner.nextLine();

        rectangulo.rectangulo rectangulo = new rectangulo.rectangulo(longitud, altura, id);

        System.out.println("\nEtiqueta de identificación: " + rectangulo.getId());
        System.out.println("Área del rectángulo: " + rectangulo.area());
        System.out.println("Perímetro del rectángulo: " + rectangulo.perimetro());

        scanner.close();
    }
}