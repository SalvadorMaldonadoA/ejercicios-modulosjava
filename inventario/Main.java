import inventario.Producto;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la referencia del producto: ");
        String referencia = entrada.nextLine();

        System.out.print("Ingrese la cantidad inicial en stock: ");
        int cantidadInicial = entrada.nextInt();

        System.out.print("Ingrese el precio unitario: ");
        double precioUnitario = entrada.nextDouble();

        Producto producto = new Producto(referencia, cantidadInicial, precioUnitario);

        System.out.println("\n--- Datos del producto ---");
        System.out.println(producto.resumenProducto());

        System.out.print("\nIngrese la cantidad de entrada de mercancía: ");
        int entradaStock = entrada.nextInt();

        System.out.println(producto.agregarStock(entradaStock));
        System.out.println("Cantidad actual: " + producto.getCantidad());

        System.out.println(producto.mostrarValorTotal());

        entrada.close();
    }
}
