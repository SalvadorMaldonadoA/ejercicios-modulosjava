import tareapendiente.tareapendiente;

import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Ingresa la prioridad de tu tarea: ");
        String prioridad= scanner.nextLine();

tareapendiente tarea = new tareapendiente("Realizar un mapa conseptual",prioridad, false);
        System.out.println("Descripción de la tarea: " + tarea.getDescripción());
System.out.println("Avance de la tarea: " + tarea.verificarAvance());
        System.out.println("Caracter de la tarea: " + tarea.urgencia());
        }
    }
