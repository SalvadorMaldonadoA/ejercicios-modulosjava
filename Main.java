import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la temperatura:");
        double temp = sc.nextDouble();
        sc.nextLine(); // limpiar buffer

        System.out.println("Ingrese la unidad de medida (Celsius o Fahrenheit):");
        String unidadMedida = sc.nextLine();

        System.out.println("Ingrese la fecha de registro:");
        String fecha = sc.nextLine();

        temperatura.temperatura temperatura = new temperatura.temperatura(temp, unidadMedida, fecha);

        System.out.println("Fecha: " + temperatura.getFechaRegistro());
        System.out.println("Temperatura convertida: " + temperatura.conversion());
        System.out.println("Unidad actual: " + temperatura.getUnidadDeMedida());
        System.out.println("Evaluación: " + temperatura.evaluarTemperatura());
    }
}


