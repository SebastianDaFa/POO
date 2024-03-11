import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero,tipo;
        double tarifa;
        System.out.print("Numero de la cita: ");
        numero = scanner.nextInt();
        System.out.print("\nTipo de la cita: ");
        tipo = scanner.nextInt();
        while(tipo<1 || tipo >5){
            System.out.print("Error, intente de nuevo\nTipo de la cita: ");
            tipo = scanner.nextInt();
        }
        System.out.print("\nSu tarifa regular: ");
        tarifa = scanner.nextDouble();
        Cita cita = new Cita(numero,tipo,tarifa);
        System.out.println(STR."\nPor ser tipo \{cita.getTipo()} queda con un valor final de \{cita.calcularValorFinal()}");
    }
}