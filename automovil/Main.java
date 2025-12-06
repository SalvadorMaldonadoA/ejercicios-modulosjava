import java.util.Scanner;
import java.time.Year;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la marca del vehículo: ");
        String marca = scanner.nextLine();

        System.out.print("Ingresa el año de fabricación: ");
        int anio = scanner.nextInt();

        System.out.print("Ingrese la velocidad máxima del vehículo: ");
        double velocidad = scanner.nextDouble();

        automovil.automovil auto = new automovil.automovil(marca, anio, velocidad);

        int anioActual = Year.now().getValue();


        System.out.println("Marca: " + auto.getMarcaVehiculo());
        System.out.println("Año de fabricación: " + auto.getAnioFabricacion());
        System.out.println("Velocidad máxima: " + auto.getVelocidadMaxima());
        System.out.println("\nEncender el vehículo: " + auto.encender(anioActual));
        System.out.println("Antigüedad del vehículo: " + auto.calcularAntiguedad(anioActual) + " años");

        scanner.close();
    }
}


