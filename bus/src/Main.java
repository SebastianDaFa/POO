import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String placa;
        int capacidad, opcion, pasajeros;
        double precio;
        boolean menu = true;
        Bus bus = null;

        while (true) {
            System.out.print("Placa del bus: ");
            placa = scanner.next();
            System.out.print("\nCapacidad de pasajeros: ");
            capacidad = scanner.nextInt();
            System.out.println("\nPrecio del pasaje: ");
            precio = scanner.nextDouble();
            if (capacidad < 1 || precio < 1) {
                System.out.println("Error.... Vuelva a intentar");
                continue;
            }
            bus = new Bus(placa, capacidad, precio);
            break;
        }

        while (menu) {
            System.out.println("1. Obtener placa del bus");
            System.out.println("2. Obtener capacidad de pasajeros");
            System.out.println("3. Obtener valor del pasaje");
            System.out.println("4. Obtener número de pasajeros actuales");
            System.out.println("5. Obtener número de pasajeros totales");
            System.out.println("6. Subir pasajeros");
            System.out.println("7. Bajar pasajeros");
            System.out.println("8. Obtener dinero acumulado");
            System.out.println("9. Salir");
            opcion = scanner.nextInt();
            while (opcion < 1 || opcion > 9) {
                System.out.println("Error.... Vuelva a intentar");
                opcion = scanner.nextInt();
            }
            if (opcion == 1) {
                System.out.println("Placa: " + bus.getPlaca());
            } else if (opcion == 2) {
                System.out.println("Capacidad de pasajeros: " + bus.getCapacidadPasajeros());
            } else if (opcion == 3) {
                System.out.println("Precio del pasaje: " + bus.getPrecioPasaje());
            } else if (opcion == 4) {
                System.out.println("Pasajeros actuales: " + bus.getPasajerosActuales());
            } else if (opcion == 5) {
                System.out.println("Pasajeros totales: " + bus.getTotalPasajeros());
            } else if (opcion == 6) {
                System.out.println("Pasajeros que se subieron: ");
                pasajeros = scanner.nextInt();
                bus.subirPasajeros(pasajeros);

            } else if (opcion == 7) {
                System.out.println("Pasajeros que se bajaron: ");
                pasajeros = scanner.nextInt();
                bus.bajarPasajeros(pasajeros);

            } else if (opcion == 8) {
                precio = bus.getPrecioPasaje();
                pasajeros = bus.getTotalPasajeros();
                System.out.println("Dinero acumulado: " + precio * pasajeros);
            } else {
                menu = false;
            }
        }
        System.out.println("Saliendo....");
    }
}