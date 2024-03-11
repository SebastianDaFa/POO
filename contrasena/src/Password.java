import java.util.Random;

public class Password {
    private int longitud = 8;
    private String contrasena;


    public Password() {
        Random random = new Random();
        StringBuilder contrasena = new StringBuilder();
        for (int i = 0; i < longitud; i++) {
            int tipo = random.nextInt(3);
            char caracter;
            if (tipo == 0) {
                int car = random.nextInt(26);
                caracter = (char) ('a' + car);
            } else if (tipo == 1) {
                int car = random.nextInt(26);
                caracter = (char) ('A' + car);
            } else {
                int car = random.nextInt(10);
                caracter = (char) ('0' + car);
            }
            contrasena.append(caracter);
        }
        this.contrasena = contrasena.toString();
    }

    public Password(int longitud) {
        Random random = new Random();
        StringBuilder contrasena = new StringBuilder();
        for (int i = 0; i < longitud; i++) {
            int tipo = random.nextInt(3);
            char caracter;
            if (tipo == 0) {
                int car = random.nextInt(26);
                caracter = (char) ('a' + car);
            } else if (tipo == 1) {
                int car = random.nextInt(26);
                caracter = (char) ('A' + car);
            } else {
                int car = random.nextInt(10);
                caracter = (char) ('0' + car);
            }
            contrasena.append(caracter);
        }
        this.contrasena = contrasena.toString();
    }

    public String getContrasena() {
        return contrasena;
    }

    public Boolean esFuerte() {
        int contadorMayusculas = 0;
        int contadorMinusculas = 0;
        int contadorNumeros = 0;
        for (int i = 0; i < contrasena.length(); i++) {
            char caracter = contrasena.charAt(i);
            if (Character.isUpperCase(caracter)) {
                contadorMayusculas++;
            } else if (Character.isLowerCase(caracter)) {
                contadorMinusculas++;
            } else if (Character.isDigit(caracter)) {
                contadorNumeros++;
            }
        }
        return contadorMayusculas > 2 && contadorMinusculas > 1 && contadorNumeros > 5;
    }
}