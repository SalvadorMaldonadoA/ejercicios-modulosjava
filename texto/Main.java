package texto;

import java.util.Scanner;;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el texto inicial: ");
        String textoInicial = entrada.nextLine();

        System.out.print("Ingrese el identificador del módulo: ");
        String idModulo = entrada.nextLine();

        System.out.print("Ingrese la longitud máxima permitida: ");
        int longitudMaxima = entrada.nextInt();
        entrada.nextLine(); // limpiar buffer

        texto cadena = new texto(textoInicial, idModulo, longitudMaxima);

        System.out.print("Ingrese el prefijo a agregar: ");
        String prefijo = entrada.nextLine();

        String resultado = cadena.agregarPrefijo(prefijo);

        System.out.println("Módulo: " + cadena.getIdModulo());
        System.out.println("Texto final: " + resultado);
        System.out.println("Longitud máxima permitida: " + cadena.getLongitudMaxima());
        System.out.println("Cantidad de espacios en blanco: " + cadena.contarEspacios());

        entrada.close();
    }
}





