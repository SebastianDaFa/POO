import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean menu = true;
        int numero,opcion;
        String tipo;
        double valorInicial,monto;
        System.out.print("Numero de cuenta: ");
        numero = scanner.nextInt();
        System.out.print("Tipo de cuenta (Ahorro o Credito): ");
        tipo = scanner.next();
        while (!tipo.equalsIgnoreCase("AHORRO") && !tipo.equalsIgnoreCase("CREDITO")) {
            System.out.print("Error... \nTipo de cuenta (Ahorro o Credito): ");
            tipo = scanner.next();
        }

        System.out.print("Valor inicial: ");
        valorInicial = scanner.nextInt();
        while (valorInicial<10000){
            System.out.println("Error... El valor inicial debe ser mayor a 10000\nValor inicial: ");
            valorInicial = scanner.nextInt();
        }
        Cuenta cuenta = new Cuenta(numero,tipo,valorInicial);
        while (menu){
            System.out.println("1. Consignar");
            System.out.println("2. Retirar");
            System.out.println("3. Obtener saldo actual");
            System.out.println("4. Obtener saldo mínimo");
            System.out.println("5. Obtener capacidad de crédito");
            System.out.println("6. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            while (opcion < 1 || opcion > 6){
                System.out.println("Error...\nIngrese una opcion: ");
                opcion = scanner.nextInt();

            }
            if (opcion == 1){
                System.out.print("Monto a consignar: ");
                monto = scanner.nextDouble();
                cuenta.consignar(monto);
            } else if (opcion == 2) {
                System.out.println("Monto a retirar: ");
                monto = scanner.nextDouble();
                cuenta.retirar(monto);
            } else if (opcion == 3) {
                System.out.println("Saldo actual: "+cuenta.getSaldo());
            } else if (opcion == 4) {
                System.out.println("Saldo minimo: "+cuenta.getSaldoMinimo());
            }else if (opcion == 5){
                System.out.println("Capacidad de credito: "+cuenta.getCapacidadCredito());
            }else {
                menu = false;
            }
        }
        System.out.println("Saliendo...");
    }
}
