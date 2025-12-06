import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

                Scanner scanner= new Scanner(System.in);
                int cantidadAsientos;
                System.out.println("Cuantos asientos desea reservar?: ");
                cantidadAsientos= scanner.nextInt();
                vuelo.vuelo reserva = new vuelo.vuelo("IBZ-402", 50, 49, 200);

                System.out.println("=== REPORTE DE VUELO: " + reserva.getCodigoDeVuelo());
                System.out.println("Reserva: " + reserva.reservarAsiento(cantidadAsientos));
                System.out.println("Asientos totales reservados: " + reserva.getNumeroTotalAsientos());
                System.out.println("Porcentaje de ocupación: " + reserva.porcentajeOcupacion() + "%");

            }
        }


