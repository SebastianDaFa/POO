import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Password contrasena = new Password();
        int longitud;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Longitud: ");
        longitud = scanner.nextInt();
        Password contrasenaLong = new Password(longitud);
        System.out.println("Contraseña con longitud por defecto (8): "+contrasena.getContrasena()+" "+ contrasena.esFuerte());
        System.out.println("Contraseña con "+longitud+ " de longitud: "+contrasenaLong.getContrasena()+" "+ contrasenaLong.esFuerte());

    }
}