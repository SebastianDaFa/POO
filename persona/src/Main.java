import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir datos por teclado
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Edad: ");
        int edad = scanner.nextInt();
        System.out.print("Sexo (H/M): ");
        char sexo = scanner.next().charAt(0);
        System.out.print("Peso (kg): ");
        double peso = scanner.nextDouble();
        System.out.print("Altura (m): ");
        double altura = scanner.nextDouble();

        // Crear objetos de la clase Persona
        Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);
        Persona persona2 = new Persona(nombre, edad, sexo);
        Persona persona3 = new Persona();

        // Comprobar peso ideal para cada persona
        System.out.println("\nPersona 1:");
        mostrarResultadoIMC(persona1);
        mostrarEsMayorDeEdad(persona1);
        System.out.println(persona1);

        System.out.println("\nPersona 2:");
        mostrarResultadoIMC(persona2);
        mostrarEsMayorDeEdad(persona2);
        System.out.println(persona2);

        System.out.println("\nPersona 3:");
        mostrarResultadoIMC(persona3);
        mostrarEsMayorDeEdad(persona3);
        System.out.println(persona3);
    }

    private static void mostrarResultadoIMC(Persona persona) {
        double resultado = persona.calcularIMC();
        if (resultado == -1) {
            System.out.println("Está por debajo de su peso ideal.");
        } else if (resultado == 0) {
            System.out.println("Está en su peso ideal.");
        } else {
            System.out.println("Tiene sobrepeso.");
        }
    }

    private static void mostrarEsMayorDeEdad(Persona persona) {
        if (persona.esMayorDeEdad()) {
            System.out.println("Es mayor de edad.");
        } else {
            System.out.println("No es mayor de edad.");
        }
    }
}
