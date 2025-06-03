<<<<<<< HEAD
import java.util.Scanner;

public class Estudiante {
    private String nombre;
    private int[] calificaciones; // arreglo de 5 calificaciones

    public Estudiante(String nombre, int[] calificaciones) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }

    public double calcularPromedio() {
        int suma = 0;
        for (int calificacion : calificaciones) {
            suma += calificacion;
        }
        return (double) suma / calificaciones.length;
    }

    public char obtenerCalificacionFinal(double promedio) {
        if (promedio <= 50) {
            return 'F';
        } else if (promedio <= 60) {
            return 'E';
        } else if (promedio <= 70) {
            return 'D';
        } else if (promedio <= 80) {
            return 'C';
        } else if (promedio <= 90) {
            return 'B';
        } else {
            return 'A';
        }
    }

    public void imprimirResultados(double promedio, char calificacionFinal) {
        System.out.println("\nNombre del estudiante: " + nombre);
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Calificación " + (i + 1) + ": " + calificaciones[i]);
        }
        System.out.println("Promedio: " + promedio);
        System.out.println("Calificación: " + calificacionFinal);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar nombre
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = scanner.nextLine();

        // Solicitar 5 calificaciones
        int[] calificaciones = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese calificación " + (i + 1) + ": ");
            calificaciones[i] = scanner.nextInt();
        }

        // Crear objeto estudiante
        Estudiante estudiante = new Estudiante(nombre, calificaciones);

        // Calcular promedio y obtener calificación final
        double promedio = estudiante.calcularPromedio();
        char calificacionFinal = estudiante.obtenerCalificacionFinal(promedio);

        // Imprimir resultados
        estudiante.imprimirResultados(promedio, calificacionFinal);

        // Cerrar scanner
        scanner.close();
    }
}
=======
import java.util.Scanner;

public class Estudiante {
    private String nombre;
    private int[] calificaciones; // arreglo de 5 calificaciones

    public Estudiante(String nombre, int[] calificaciones) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }

    public double calcularPromedio() {
        int suma = 0;
        for (int calificacion : calificaciones) {
            suma += calificacion;
        }
        return (double) suma / calificaciones.length;
    }

    public char obtenerCalificacionFinal(double promedio) {
        if (promedio <= 50) {
            return 'F';
        } else if (promedio <= 60) {
            return 'E';
        } else if (promedio <= 70) {
            return 'D';
        } else if (promedio <= 80) {
            return 'C';
        } else if (promedio <= 90) {
            return 'B';
        } else {
            return 'A';
        }
    }

    public void imprimirResultados(double promedio, char calificacionFinal) {
        System.out.println("\nNombre del estudiante: " + nombre);
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Calificación " + (i + 1) + ": " + calificaciones[i]);
        }
        System.out.println("Promedio: " + promedio);
        System.out.println("Calificación: " + calificacionFinal);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar nombre
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = scanner.nextLine();

        // Solicitar 5 calificaciones
        int[] calificaciones = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese calificación " + (i + 1) + ": ");
            calificaciones[i] = scanner.nextInt();
        }

        // Crear objeto estudiante
        Estudiante estudiante = new Estudiante(nombre, calificaciones);

        // Calcular promedio y obtener calificación final
        double promedio = estudiante.calcularPromedio();
        char calificacionFinal = estudiante.obtenerCalificacionFinal(promedio);

        // Imprimir resultados
        estudiante.imprimirResultados(promedio, calificacionFinal);

        // Cerrar scanner
        scanner.close();
    }
}
>>>>>>> c1f8a09 (Se sube proyecto)
