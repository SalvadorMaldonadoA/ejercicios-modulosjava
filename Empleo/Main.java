import Empleo.Empleo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la clave del empleado: ");
        String clave = scanner.nextLine();

        System.out.print("Ingresa el salario mensual: ");
        double salario = scanner.nextDouble();

        System.out.print("Ingresa el porcentaje de retención de impuestos: ");
        double retencion = scanner.nextDouble();

        Empleo empleado = new Empleo(clave, salario, retencion);


        System.out.println("Clave: " + empleado.getClaveEmpleado());
        System.out.println("Salario mensual: $" + empleado.getSalarioMensual());
        System.out.println("Retención de impuestos: " + empleado.getPorcentajeRetencion() + "%");

        System.out.println("Salario neto: $" + empleado.calcularSalarioNeto());

        System.out.print("Ingresa el porcentaje de aumento salarial: ");
        double aumento = scanner.nextDouble();
        double nuevoSalario = empleado.aplicarAumento(aumento);

        System.out.println("Nuevo salario mensual tras aumento: $" + nuevoSalario);

        scanner.close();
    }
}
