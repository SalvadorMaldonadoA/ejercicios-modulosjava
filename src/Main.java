import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Ingresa el numero de cuenta: ");
        int numeroCuenta= scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingresa el nombre del titular: ");
        String titular = scanner.nextLine();
        System.out.println("Coloque la cantidad a depositar: ");
        int deposito= scanner.nextInt();
        System.out.println("=== Situacion de retiro ===");
        System.out.println("Coloque la cantidad a retirar: ");
        int retiro=scanner.nextInt();

    CuentaDeAhorros cuenta = new CuentaDeAhorros(numeroCuenta, titular, 500);
        System.out.println("Nombre del titular: " + cuenta.getTitular());
        System.out.println("Numero de cuenta: " + cuenta.getNumCuenta());
        System.out.println("Saldo actual: "+ cuenta.getSaldoActual());
        System.out.println("Ha realizado un deposito. Su saldo actual es de: "+ cuenta.deposito(deposito));
        System.out.println("Saldo actual: "+ cuenta.retiro(retiro));
    }
}