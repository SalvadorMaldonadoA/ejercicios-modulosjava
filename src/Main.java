public class Main {

    public static void main(String[] args) {

        // 1. Crear un objeto ArticuloBibliografico (Instanciación)
        // Se llama al constructor que tienes definido en tu otra clase.
        ArticuloBibliografico articulo1 = new ArticuloBibliografico("978-000", "J.K. Rowling", true, 1997);

        // 2. Probar una de las funciones (Llamada a un metodo)
        boolean sePudoReservar = articulo1.reservar();

        // 3. Mostrar el resultado (Acceso a un atributo con Getter)
        System.out.println("ID del Artículo: " + articulo1.getId());

        if (sePudoReservar) {
            System.out.println("Resultado de la reserva: ¡Reservado!");
        } else {
            System.out.println("Resultado de la reserva: No se pudo reservar.");
        }

        // 4. Probar la otra función
        // Asumiendo que el año actual es 2025
        boolean esViejo = articulo1.esApto(2025);
        System.out.println("¿Tiene más de 5 años de antigüedad?: " + esViejo);
    }
}